package practice.day18;

import java.awt.*;
import java.util.Scanner;

public class day15_Q02 {

    /*
    User name is "admin", Password is "pwd123"
    Ask user to enter username and password
    User should see "Enter your username and password" message
    If user enters correct credentials, he should get "You are in account!" message
    Otherwise, he should see "Enter your username and password" message 3 times
    After 3 times he should get "Your account is blocked" message
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int counter=0;
         do {
             if (counter == 3) {
                 System.out.println("Your account is bocked");
                 break;
             }
             System.out.println("Enter your user name");
             String userName= input.next();

             System.out.println("Enter your password");
             String password = input.next();

             counter++;

             if(userName.equals("admin") && password.equals("pwd123")) {
                 System.out.println("You are in your account");
                 break;
             }
         }while (true);

         }
    }
