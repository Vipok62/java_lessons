public class Point {
    public static void main(String[] args) {
        Method l = new Method(6, -4, -3, 10);
        System.out.println("Расстояние между двумя точками на полскости с координатами " +
                 l.x1 + "," + l.y1 + " и " + l.x2 + "," + l.y2 + " равно " + l.square() + " условных единиц." );
    }
}
