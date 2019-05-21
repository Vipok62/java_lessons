public class SquareAndRectangle {
    public static void main(String[] args){
        Square s = new Square(8);
        System.out.println("Площадь квадрата со сторонами " + s.l + " равна " + area(s));

        Rectangle s1 = new Rectangle(12,23);

        System.out.println("Площадь прямоугольника со сторонами " + s1.a + " и " + s1.b + " равна " + area(s1));

    }
    public static double area(Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle s1){
        return s1.a * s1.b;
    }
}

