//Define a Person class with members name, age and gender.
//  Overload constructors to initialize Person details. Create objects and display those whose age is >18.

import java.util.Scanner;
class Person{
    String name;
    int age;
    String gender;

Person(){
    name="Unknown";
    age=0;
    gender="Unknown";
}
Person(String n,int a,String g){
  name=n;
  age=a;
  gender=g;

}
void display(){
    System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender  );
}
}
public class program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n= sc.nextInt();
        Person[] p =new Person[n];
        for(int i=0;i<n;i++){
        System.out.println(" The people " +(i+1));
        System.out.println(" Name " );
        String name =sc.next();
        System.out.println(" Age " );
        int age =sc.nextInt();
        System.out.println(" Gender " );
        String gender =sc.next();
        p[i] = new Person(name,age,gender);
    }
System.out.println("\n--- Persons with Age > 18 ---");
        for (int i = 0; i < n; i++) {
            if (p[i].age > 18) {
                p[i].display();
}

}
    }
}
