import java.util.Scanner;

class Shape{
    void area(){
        System.out.println("THE AREA IS ");
    }
}
class Circle extends Shape{
    double radius;

    Circle(double r){
        radius = r;

    }
    void area(){
        System.out.println("THE AREA OF CIRCLE IS " + ((3.14)*radius*radius));

    }}
class Rectangle extends Shape{
    double length,breadth;

    Rectangle(double l,double b){
        length=l;
        breadth=b;}

        void area(){
            System.out.println("THE AREA OF RECTANGLE IS "+(length*breadth));

        }
    }
    public class Program3 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius");
            double r =sc.nextDouble();
            System.out.println("Enter length");
            double l =sc.nextDouble();
            System.out.println("Enter breadth");
            double b =sc.nextDouble();
            Shape s;
             s = new Circle(r);
            s.area();
             s = new Rectangle(l,b);
            s.area();

        sc.close();
        }
    }

    
   





    

