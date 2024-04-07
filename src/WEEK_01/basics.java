package WEEK_01;
import java.util.*;
class Maths{
    int f;
    int s;
    Maths(int a , int b){
        f = a;
        s = b;
    }
    void sum() {
        int d = f + s;
        System.out.println("The sum of given numbers is: "+ d);
    }
    void multiply() {
        System.out.println("The product of given numbers is: "+f*s);
    }
    void divide() {
        System.out.println("The division of given numbers is: "+f/s);
    }
    void subtract() {
        int d = f- s;
        System.out.println("The subtraction of given numbers is: " + d);
    }

}
class strings{
    String s;
    strings(String g){
        s=g;
    }
    void concantanate(String p) {
        String n;
        n = s+" " +p;
        System.out.println("After merging initial with the new one: "+ n);
    }

}
public class basics {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int first = sc.nextInt();
            System.out.println("Enter the second number:");
            int second = sc.nextInt();
            Maths a = new Maths(first,second);
            a.sum();
            a.multiply();
            a.divide();
            a.subtract();
            System.out.println();
            System.out.println("Enter the first word in the String:");
            String p = sc.next();
            System.out.println("Enter the second word:");
            String q = sc.next();
            strings s = new strings(p);
            s.concantanate(q);
        }
        catch(Exception e) {
            System.out.println("Error obtained "+ e);
        }
    }
}
