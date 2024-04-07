package WEEK_07;

import java.util.Scanner;

class employee{
    private String fname;
    private String lname;
    private double sal;
    public employee(String fname,String lname,double sal){
        this.fname=fname;
        this.lname=lname;
        this.sal=sal;
    }
    public double get(){
        return sal;
    }
    public void set(double value){
        if(value>=0){
            sal=value;
        }
        else{
            System.out.println("Salary cannot be negative value is not updated");
        }
    }
    public void display(){
        System.out.println("first name "+fname+"\nlast name "+lname+"\nsalary "+sal +"\n");
    }
}
class mid_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name of employee 1: ");
        String a = sc.next();
        System.out.println("Enter last name of employee 1: ");
        String b = sc.next();
        System.out.println("Enter first name of employee 2: ");
        String c = sc.next();
        System.out.println("Enter last name of employee 2: ");
        String d = sc.next();
        double sal1 = 0,sal2=0;
        if(sal1<=0) {
            System.out.println("Enter salary of employee 1: ");
            sal1 = sc.nextDouble();
        }
        if(sal2<=0) {
            System.out.println("Enter salary of employee 2: ");
            sal2 = sc.nextDouble();
        }
        employee e1=new employee(a,b,sal1);
        employee e2=new employee(c,d,sal2);
        e1.display();
        e2.display();
        e1.set(0.1*e1.get()+e1.get());
        e2.set(0.1*e2.get()+e2.get());
        System.out.println("Salary after update: ");
        e1.display();
        e2.display();
    }
}
