package TASKS;

//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//Для генерации случайного числа используйте метод Math.random(),
//который возвращает значение в промежутке [0, 1].


public class task01 {
    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }
}
