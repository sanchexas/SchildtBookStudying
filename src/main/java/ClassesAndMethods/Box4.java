package ClassesAndMethods;
//                                              ТЕМА:
public class Box4 {//               ПАРАМЕТРИЗИРОВАННЫЕ КОНСТРУКТОРЫ
    double width;
    double height;
    double depth;

    //   ЭТО КОНСТРУКТОР КЛАССА BOX
    Box4(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width * height * depth;
    }
}
class BoxDemo4{
    public static void main(String[] args) {

        Box4 mybox1 = new Box4(10,23,12);
        Box4 mybox2 = new Box4(12,6,13);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);
    }
}