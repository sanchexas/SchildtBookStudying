package ClassesAndMethods.More;
//                                                          ТЕМА:
public class Test {//                      ПРИМЕНЕНИЕ ОБЪЕКТОВ В КАЧЕСТВЕ ПАРАМЕТРОВ


    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean equals(Test o){
        if(o.a == a && o.b == b){
            return true;
        }else return false;
    }
}
class PassOb{
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(30,20);

        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.equals(ob3));
    }
}
