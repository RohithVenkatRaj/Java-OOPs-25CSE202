import java.util.Scanner;
public class Sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("Enter the elements");
            for(int i=0;i<size;i++)
            nums[i]=sc.nextInt();
        System.out.println("Enter the array to be indexed");
        int index =sc.nextInt();
        System.out.println(" The array to be indexed" +nums[index]);
        System.out.println("Enter the divisor");
        int divisor =sc.nextInt();
        int result = nums[index]/divisor;
        System.out.println("The result after  dividing "+nums[index]+ "is"+result);
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
