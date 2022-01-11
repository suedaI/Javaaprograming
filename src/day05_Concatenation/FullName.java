package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
       String first_name = "Jimmy";
     String last_name = "King";
     int age = 45;
     String jobTitle = "SDET";
     String companyName = "Apple Inc";
     double salary = 100000.58;
     String fullName = first_name + " " + last_name;
        System.out.println(fullName);
       //full name of the person is ----
        System.out.println("full name of the person " + fullName);
        //--- is years old
        System.out.println( fullName + " is " + age + "  years old ");

//Fullname is JobTitle, works at CompanyName' and FullName , salary is Salary
        System.out.println( fullName + " is " + jobTitle + " , works at " + companyName  +  fullName + "'s salary is $ " + salary);

    }




}
