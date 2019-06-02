package Calculate_v3;

import java.util.Scanner;

public class CalculateVersion3 {
    public static void main(String[] args){
        Signs a = new Signs();
        Signs b = new Signs();
        Scanner scan = new Scanner(System.in);
        System.out.println("Калькулятор v2. ");
        System.out.println("Введите переменную а: ");
    }
}






class Signs{
    private String signs;
    private double a;
    private double b;


    public static double signPlus(double a, double b){ return a + b;}
    public static double signMinus(double a, double b) {return a - b;}
    public static double signMultiplication(double a, double b) {return a * b;}
    public static double signDivision(double a, double b){return a / b;}

}