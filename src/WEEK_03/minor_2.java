package WEEK_03;
import java.util.Scanner;

class factorial{
int fact(int n) {
    if(n<0) {
        return -1;
    }
    if(n==0) {
        return 1;
    }
    return n*fact(n-1);
}
}
public class minor_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        factorial f = new factorial();
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of given number is : " + f.fact(n));
    }

}
