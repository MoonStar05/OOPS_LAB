package WEEK_03;
import java.util.Scanner;

class Box{

    int length;
    int breadth;
    int height;

    Box(int a, int b, int c){
        this.length = a;
        this.breadth = b;
        this.height = c;
    }

    void getVolume() {
        int vol = length*breadth*height;
        System.out.println("The volume of given box is: " + vol);
    }
    void dimensions() {
        System.out.println("The length of the box is: " + length);
        System.out.println("The breadth of the box is: " + breadth);
        System.out.println("The height of the box is: " + height);
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(int a,int b,int c,int d){
        super( a , b, c);
        this.weight = d;

    }
    void getWeight() {
        System.out.println("The weight of the given box is: "+ weight);
    }
}
class shipment extends Box{
    int cost;
    shipment(int a, int b, int c , int d) {
        super(a, b, c);
        this.cost = d;
        // TODO Auto-generated constructor stub
    }

    int get_cost(){
        return cost;
    }
}
public class minor_5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int x = sc.nextInt();
        System.out.println("Enter breadth: ");
        int y = sc.nextInt();
        System.out.println("Enter height: ");
        int z = sc.nextInt();
        Box b = new Box(x,y,z);
        b.getVolume();
        b.dimensions();
        BoxWeight bw = new BoxWeight(x,y,z,56);
        bw.getWeight();
        shipment s = new shipment(x,y,z,50);
        System.out.println("The cost of shipment is: "+s.cost);
    }

}

