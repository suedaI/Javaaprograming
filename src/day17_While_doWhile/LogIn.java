package day17_While_doWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //username:"cydeo"
        //password:"Cydeo123"

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your username:");
String u = scan.next();
        System.out.println("enter your password");
String p = scan.next();

if (u.equals("cydeo") && p.equals("Cydeo123")){
    System.out.println("loged in.");
}else{//if credentials are not valid
    int attempts=3;
    while (!(u.equals("cydeo") && p.equals("Cydeo123") && attempts>0)){ //
        System.out.println("incorect username or password,pls re-enter");
        System.out.println("enter your username:");
        u = scan.next();

        System.out.println("enter your password:");
        p= scan.next();
        attempts--;

    }
}
if (u.equals("cydeo") && p.equals("Cydeo123")){
    System.out.println("log in.");
}else{
    System.out.println("your account is locked. ");
}


scan.close();
    }
}
