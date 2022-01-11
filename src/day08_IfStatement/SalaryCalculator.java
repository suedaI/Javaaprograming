package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;//one week salary
        double stateTax = salaryBeforeTax * stateTaxRate /100;//
double federaltax = salaryBeforeTax * federalTaxRate /100;
double totalTax = stateTax + federaltax;


double salaryAfterTax = salaryBeforeTax - totalTax;


System.out.println("Gross pay is : $ " + salaryBeforeTax);
        System.out.println("state tax = $ " + stateTax);
        System.out.println("federal tax = $ " + federaltax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $ " + salaryAfterTax);








    }
}
