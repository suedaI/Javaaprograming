package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setInfo("mariana", 'f', 25, 3455, "developer", 10000, true);
        employee2.setInfo("ali", 'm', 45, 4567, "QA", 3456, true);
        employee3.setInfo("sueda", 'f', 34, 4321, "QA", 150000, true);
        employee4.setInfo("gokhan", 'm', 27, 8700, "QA", 7865, false);
        employee5.setInfo("alihan", 'm', 58, 5411, "QA", 4576, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countPartTime = 0;
        double max=employees[0].salary;
        double min=employees[0].salary;
        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }
if (employee.salary>max){
    max=employee.salary;
}
if (employee.salary<min){
    min=employee.salary;
}


        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }
}
