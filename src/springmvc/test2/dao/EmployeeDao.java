package springmvc.test2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springmvc.test2.entity.Department;
import springmvc.test2.entity.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    public static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;
    static {

        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "@163.com", "E-AA", 1, new Department(101, "E-AA")));
        employees.put(1002, new Employee(1002, "@161.com", "E-BB", 0, new Department(102, "E-BB")));
        employees.put(1003, new Employee(1003, "@164.com", "E-CC", 1, new Department(103, "E-CC")));
        employees.put(1004, new Employee(1004, "@166.com", "E-DD", 0, new Department(104, "E-DD")));
        employees.put(1005, new Employee(1005, "@168.com", "E-EE", 1, new Department(105, "E-EE")));


    }

    public static Integer id = 1006;

    public void save(Employee employee) {

        if (employee.getId() == null) {

            employee.setId(id++);

        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));

        employees.put(employee.getId(), employee);


    }

    public Collection<Employee> getAll() {

        return employees.values();
    }

    public Employee employee(Integer id) {

        return employees.get(id);


    }
    public void delete(Integer id){

        employees.remove(id);
    }

    /**
     * 查找用户
     *
     * @param id
     * @return
     */
//    Employee findEmpById(Integer id);

   /* *//**
     * 添加用户
     *
     * @param employee
     *//*
    void insertEmp(Employee employee);

    *//**
     * 更新用户
     *
     * @param employee
     *//*
    void updateEmp(Employee employee);

    *//**
     * 删除用户
     *
     * @param employee
     *//*
    void delteEmp(Employee employee);*/


}
