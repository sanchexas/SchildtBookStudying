package ClassesAndMethods;
//                                                  ТЕМА:
public class Box {//                        ВВОД МЕТОДА В КЛАСС BOX

    double width;
    double height;
    double depth;


    void volume() {
        System.out.println("Объём равен:");
        System.out.println(width * height * depth);
    }
}
 class BoxDemo{
        public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.depth = 5;
        mybox1.height = 10;
        mybox1.width = 12;

        mybox2.width = 7;
        mybox2.height = 9;
        mybox2.depth = 18;

        mybox1.volume();
        mybox2.volume();
        }
    }

