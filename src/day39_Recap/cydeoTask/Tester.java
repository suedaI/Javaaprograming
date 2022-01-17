package day39_Recap.cydeoTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getName()+" "+getJobTitle()+ " is has create ticket");
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+getJobTitle()+ " is working");
    }
}
