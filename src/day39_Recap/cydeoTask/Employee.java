package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                ", name=" + getName() +
                ", salary=" + getSalary() +
                '}';
    }



}
