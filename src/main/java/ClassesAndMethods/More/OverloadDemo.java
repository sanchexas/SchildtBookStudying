package ClassesAndMethods.More;
//                                                    ТЕМА:
public class OverloadDemo {//                   ПЕРЕГРУЗКА МЕТОДОВ

    void test(){
        System.out.println("Параметры отсутствуют");
    }
    void test(int a){
        System.out.println("а: " + a);
    }
    void test(int a, int b){
        System.out.println("a и b: " + a + b );
    }
    void test(double a, double b){
        System.out.println("а и b: " + a + b);
    }
    void test(boolean a){
        System.out.println("bool a : " + a);
    }
    double test(double a, double b, double c){
        System.out.println("a: "+ a + " b: " + b + " c: " + c);
        return a * b * c;
    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        //Вызвать все варианты метода test
        ob.test();
        ob.test(10);
        ob.test(10,15);
        ob.test(100.25,12.45);
        ob.test(true);
        result = ob.test(
                12.25,
                13.56,
                11.23
        );

        System.out.println("Результаты вызова ob.test(12.25,13.56,11.23): " + result);


    }

}