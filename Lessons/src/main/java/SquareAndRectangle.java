public class SquareAndRectangle {
    public static void main(String[] args){
        Square s = new Square(8);
        System.out.println("Площадь квадрата со сторонами " + s.l + " равна " + s.area());

        Rectangle s1 = new Rectangle(12,23);

        System.out.println("Площадь прямоугольника со сторонами " + s1.a + " и " + s1.b + " равна " + s1.area());

    }


}

