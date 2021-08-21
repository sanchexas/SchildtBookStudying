package TASKS;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.println(MiddleNum(x,y,z));


    }
    public static double MiddleNum(double x, double y, double z){
        return (x+y+z) / 3;
    }
}
