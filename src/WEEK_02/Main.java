package WEEK_02;
class Box {
    int height, length, breadth;

    Box(){
        height = 0;
        length = 0;
        breadth = 0;
    }
    Box(int side){
        height = side;
        length = side;
        breadth = side;
    }
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public int Volume(){
        return this.length * this.breadth * this.height;
    }

    public Box copyDimensions(){
        Box newbox = new Box();
        newbox.length = this.length;
        newbox.breadth = this.breadth;
        newbox.height = this.height;
        return newbox;
    }

    public boolean equalDimensions(Box box){
        return (this.height == box.height && this.length == box.length && this.breadth == box.length);
    }
}
public class Main {
    public static void main(String[] args){
        Box box1 = new Box();
        box1.length = 10;
        box1.breadth = 5;
        box1.height = 5;

        Box box2 = new Box(20);
        Box box3 = new Box(5, 10, 5);
        System.out.printf("Box1 volume:%d\nBox2 volume:%d\nBox3 volume:%d\n",box1.Volume(), box2.Volume(), box3.Volume());
        System.out.printf("Are box1 and box3 dimensions same: %b", box1.equalDimensions(box3));
    }
}
