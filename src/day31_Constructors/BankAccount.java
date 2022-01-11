package day31_Constructors;

public class BankAccount {

 public String accountHolder;
 public long accountNumber;
 public double balance;

 public void setInfo (String accountHolder,long accountNumber){
  this.accountHolder=accountHolder;
  this.accountNumber=accountNumber;
 }

 public String toString() {
  return "BankAccount{" +
          "accountHolder='" + accountHolder + '\'' +
          ", accountNumber=" + accountNumber +
          ", balance= $" + balance +
          '}';
 }

 public void checkBalance(){
  System.out.println("your avaible balance is: "+balance);
 }
 public void deposit(double amount){
  if (amount<=0){
   System.out.println("Depositing amount can not be zero or negatif");
   return;
  }
  balance+=amount;
 }
 public void withdraw(double amount){
 if (amount>balance){ //if withdrawing amount is greater than available balance
  System.out.println("insufficient balange");
  return;
 }
  if (amount<=0){
   System.out.println("withdrawing amount can not be negative or zero");
   return;
  }
  balance-=amount;
 }




}
