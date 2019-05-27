public class KeywordFinal {
    public static void main(String[] args) {
        System.out.println(Test.CONSTANT);
        final int X = 10;
        System.out.println(X);
    }
}

class Test{
    public static final int CONSTANT = 0;
}