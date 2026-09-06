//Demonstrate use of multiple catch clauses for handling diff types of exception hjandling
//  such as Arithmetic exception and array out of bound exception

import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){  
    Scanner sc= new Scanner(System.in); 
    try
    {
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the " +size+ " of the array");
        for(int i=0;i<size;i++)
        numbers[i]=sc.nextInt();
    
    System.out.println("Enter the array index to be accessed");
    int index= sc.nextInt();
    System.out.println(" The array index to be accessed " + numbers[index]);
    System.out.println(" The array index of" + numbers[index] + "is divided by " );
    int divisor =sc.nextInt();
    int result = numbers[index]/divisor;
    System.out.println("Result " +result);

      
    }
    catch(ArithmeticException e){
        System.out.println("ERROR ... Cannot be divided by 0");}
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrAY INDEX OUT OF RANGE");}
        finally{
            sc.close();
       
    }    

    }

}