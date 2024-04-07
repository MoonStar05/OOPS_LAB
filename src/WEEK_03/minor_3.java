package WEEK_03;
class nestedClass{

    void meth1() {
        for(int i=0;i<5;i++) {
            System.out.println("Number: "+i);
        }

        class class02{
            void meth2() {
                for(int i=5;i<11;i++) {
                    System.out.println("Number: "+i);
                }
            }
        }
        class02 cl = new class02();
        cl.meth2();
    }
}
public class minor_3 {
    public static void main(String[] args) {
        nestedClass mainClass = new nestedClass();
        mainClass.meth1();
    }

}
