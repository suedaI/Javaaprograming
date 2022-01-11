package day32_Constructors.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Products Owner", id, salary, companyName);
    }

}
