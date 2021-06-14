package ClassesAndMethods;
//                                                 ТЕМА:
public class Box3 {//                 ВВОД МЕТОДА ПРИНИМАЮЩЕГО ПАРАМЕТРЫ
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
    void setSize( double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

}
class BoxDemo3{
    public static void main(String[] args) {

    Box3 mybox1 = new Box3();
    Box3 mybox2 = new Box3();

    double vol;

    mybox1.setSize(5,4,6);
    mybox2.setSize(7,3,8);

    vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

    vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);




    }
}
