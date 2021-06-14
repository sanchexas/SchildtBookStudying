package ClassesAndMethods;
//                                                ТЕМА:
public class Box2 {//                        ВОЗВРАТ ЗНАЧЕНИЙ

    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

}
class BoxDemo2{
    public static void main(String[] args) {

        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        mybox1.depth = 5;
        mybox1.width = 7;
        mybox1.height = 10;

        mybox2.depth = 10;
        mybox2.width = 12;
        mybox2.height = 5;

        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);



    }
}
