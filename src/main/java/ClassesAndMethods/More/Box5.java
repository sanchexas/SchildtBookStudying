package ClassesAndMethods.More;
//                                                      ТЕМА:
public class Box5 {//                           ПЕРЕГРУЗКА КОНСТРУКТОРОВ
  double width;
  double height;
  double depth;

  Box5( double w, double h, double d){
      width = w;
      height = h;
      depth = d;

  }

  Box5(){
      width = -1;
      height = -1;
      depth = -1;

  }
  Box5(double len){
      width = height = depth = len;
  }

  double volume(){
      return width * height * depth;
  }
}

class OberloadCons{
    public static void main(String[] args) {
        Box5 mybox1 = new Box5(10,20,15);
        Box5 mybox2 = new Box5();
        Box5 mycube = new Box5(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox 2 = " + vol);

        vol = mycube.volume();
        System.out.println("Объем mycube = " + vol);
    }
}
