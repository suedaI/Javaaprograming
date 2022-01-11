package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("aaron");
        System.out.println(employee1);
        Employee employee2 = new Employee("ali",'m');
        System.out.println(employee2);
        Employee employee3=new Employee("olga",'f',"sdet");
        System.out.println(employee3);
        Employee employee4=new Employee("sueda",'f',"QA",150000);
        System.out.println(employee4);


    }
}
