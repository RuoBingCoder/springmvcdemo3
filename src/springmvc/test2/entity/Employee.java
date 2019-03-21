package springmvc.test2.entity;

public class Employee {
    private Integer id;
    private String email;
    private String lastname;
    private Integer gender;
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(Integer id, String email, String lastname, Integer gender, Department department) {
        this.id = id;
        this.email = email;
        this.lastname = lastname;
        this.gender = gender;
        this.department = department;
    }

    public Employee(){


    }
}
