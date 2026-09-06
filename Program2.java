//Program to read and print two strings : done 
// check whether they are equal :done,find the fifth character of the first string:done 
//print the length of the string: done

import java.util.Scanner;   //importing scanner from java.util for reading input nd giving outputs
public class Program2//Main class definition, it should be same as the filename
{  
    public static void main(String args[])//java application entry  
    {
    
        Scanner sc = new Scanner(System.in); //for user input
        System.out.println("Enter the first string");
        String st1 = sc.next();
        System.out.println("Enter the second string");
        String st2 = sc.next();
        System.out.println("THE FIRST STRING IS " +st1);
        System.out.println("THE SECOND STRING IS " +st2);
        if (st1.equals(st2)){
            System.out.println("BOTH THE STRINGS ARE EQUAL");

        }else{
            System.out.println("Strings are not equal");
         }

         if(st1.length()>=5){
            System.out.println("FIFTH CHARACTER OF THE FIRST STRING IS " +st1.charAt(4));
         }else{
            System.out.println("Invalid");
         }
         System.out.println("The length of 1st string is "+st1.length());
          System.out.println("The length of 2nd string is "+st2.length());
          sc.close();

    }
}