package WEEK_05;

import java.util.Scanner;
interface gps{
    String location();
    default void time() {
        System.out.println("The whole operation performed at this moment");
    }
}
interface camera{
    void takeSnap();
    boolean openCam();
    void focus();
}
class SmartPhone implements gps,camera{
    int n;
    String city;
    int id;
    String name;
    SmartPhone(int a , String b,int v,String d){
        n = a;
        city = b;
        id = v;
        name = d;
    }

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public boolean openCam() {
        if(id>0) {
            return true;
        }
        return false;

    }

    @Override
    public void focus() {
        if(openCam()) {
            System.out.println("The camera is set at a focus of " + n);
        }
        else {
            System.out.println("Camera is not opened yet!! ");
            System.out.println("Camera is not opened yet!! ");
        }
    }

    @Override
    public String location() {
        return city;
    }

    void name() {
        System.out.println("The name of this smart phone holder with the id " + id + " is : " + name);
    }
}
public class Week_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the smart phone holder:  ");
        String d = sc.next();
        System.out.println("Enter the id for the smartphone:");
        int m = sc.nextInt();
        System.out.println("Enter the focus for the camera: ");
        int a = sc.nextInt();
        if(a>11 || a <0) {
            System.out.println("Enter the focus of the camera again(it should be less than 10 and more than 0) ");
            a = sc.nextInt();
        }
        System.out.println("Enter the location for the smart phone: ");
        String s = sc.next();
        SmartPhone one = new SmartPhone(a,s,m,d);
        one.name();
        one.focus();
        one.time();
        System.out.println("The current location of the smart phone is " + one.location());
        gps two = new SmartPhone(a,s,m,d);
        System.out.println("Current location of the phone with only gps: " + two.location());
        // two.focus();   -->cannot do this

    }
}
