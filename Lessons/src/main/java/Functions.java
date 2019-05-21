public class Functions {
    public static void main(String[] args){
        hello("world");

        double i = 5;
        System.out.println("Площадь квадрата со сторонами " + i + " равна " + area(i));

        double a = 5;
        double b = 7;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b));
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(double i){
        return i * i;
    }
    public static double area(double a, double b){
        return a * b;
    }

}