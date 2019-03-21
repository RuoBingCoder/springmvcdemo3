package springmvc.test2.handel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.test2.dao.DepartmentDao;
import springmvc.test2.dao.EmployeeDao;
import springmvc.test2.entity.Employee;

import java.util.Map;

/**
 * @author :石建雷
 * @date :2019.3.6
 * spring mvc 简单的例子
 */
// @SessionAttributes(value = {"employees"})  的使用
@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;


    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public String save(Employee employee) {
        employeeDao.save(employee);
        return "/emps";
        //重定向


    }


    @RequestMapping("/emps")
    public String list(Map<String, Object> map) {

        map.put("employees", employeeDao.getAll());

        return "list";


    }

    /**
     * 这个常用要记住
     * @param map
     * @return
     */
    @RequestMapping(value = "/add_employee", method = RequestMethod.GET)
    public String input(Map<String, Object> map) {

        map.put("departments", departmentDao.getDepartments());
        map.put("employee", new Employee());


        return "input";

    }

    private static String SUCCESS = "success";

    @RequestMapping("/test")
    public String test() {
        System.out.println("这是一个测试！");
        return SUCCESS;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("这是一个测试！");
        return "hello word!";
    }
}
