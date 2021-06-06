package Arrays;

public class Array {
    public static void main(String[] args) {

        OneArray();
        AutoArray();
        AVG();
        multiArray();
        Matrix();

    }
    public static void OneArray(){      //Одномерный массив

        int[] month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("В апреле " + month_days[3] + " дней.");
    }

    public static void AutoArray(){    //Усовершенствованная версия OneArray

        int[] month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("В апреле " + month_days[3] + " дней.");
    }

    public static void AVG(){       //Вычисляем среднее значение

        double[] nums = {
                10.1,
                11.2,
                12.3,
                13.4,
                14.5
        };

        double result = 0;

        for (int i = 0; i < 5; i++) {

            result = result + nums[i];
            System.out.println("Среднее значение равно " + result / 5);

        }
    }

    public static void multiArray(){     // многомерный массив

        int[][] twoArray = new int[4][5];
        int  i,j, k = 0;

        for (i = 0; i < 4; i++)

            for (j = 0; j < 5; j++) {
                twoArray[i][j] = k;
                k++;

            }

        for (i = 0; i < 4; i++) {

            for (j = 0; j < 5; j++)
                System.out.print(twoArray[i][j] + " ");
                System.out.println();


        }

    }

    public static void Matrix(){

        //smth
    }
}
