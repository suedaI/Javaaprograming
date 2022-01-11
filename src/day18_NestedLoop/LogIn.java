package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username");
        String u=scan.next();
        System.out.println("enter your password");
        String p=scan.next();

        if (u.equals("cydeo") && p.equals("woodenspoon")){
            System.out.println("logged in.");
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.println("incorrect username or password");
                System.out.println("enter your username");
                u = scan.next();
                System.out.println("enter your password");
                p = scan.next();
                if (u.equals("cydeo") && p.equals("woodenspoon")) {
                    System.out.println("loggin ");
                    break;
                }


            }
            if (!(u.equals("cydeo") && p.equals("woodenspoon")) ){
                System.err.println("your account is locked,Plese contact support team");
            }


        }

            }

        }








