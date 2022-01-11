package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("sueda",'F',29,150000);

        employee1.setAge(22);
        System.out.println(employee1);


        Employee employee2=new Employee("ali",'M',76,11111);
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);
    }
}
