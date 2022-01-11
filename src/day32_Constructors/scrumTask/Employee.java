package day32_Constructors.scrumTask;


public class Employee extends Person {
    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(name + " " + companyName + " " + " is working");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}