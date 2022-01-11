package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";
        Boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println("---------------------------------");
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible for Loan: " + isEligible2);

        System.out.println("------------------------------");
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >=18 && (gender == 'M' || gender =='F');

        System.out.println(name3 + "is eligible for work : " + isEligible3);

        System.out.println("---------------");
        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = true;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenShip:" + isEligible4);
        System.out.println("-------------------------------");
        String student = "Anna";
        double gpa = 3.5;
        int familyInCome = 100000;
        boolean isEligible5 = gpa >= 3.5 || familyInCome <= 60000;
        System.out.println(student + " is  eligible for scholarship: " + isEligible5);
        System.out.println("----------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3= " + result3);
        System.out.println("----------------------------");
        int score = 85;
        boolean passed = score >= 60;
        boolean faild = !passed;

        System.out.println("passed = " + passed);
        System.out.println("faild = " + faild);



    }
}
