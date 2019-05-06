import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Args yy = new Args();
        do {
            System.out.println("Калькулятор v2. ");
            System.out.println("Введите переменную a: ");
            Args qwe = new Args();
            qwe.a = scanner.nextInt();
            System.out.println("Введите переменную b: ");
            Args qwer = new Args();
            qwer.b = scanner.nextInt();
            System.out.println("Введите знак: ");
            Args qq = new Args();
            qq.q = scanner.next().charAt(0);

            switch (qq.q) {
                case '+':
                    yy.y = qwe.a + qwer.b;
                    System.out.println("Ответ: " + yy.y);
                    break;
                case '-':
                    yy.y = qwe.a - qwer.b;
                    System.out.println("Ответ: " + yy.y);
                    break;
                case '*':
                    yy.y = qwe.a * qwer.b;
                    System.out.println("Ответ: " + yy.y);
                    break;
                case '/':
                    yy.y = qwe.a / qwer.b;
                    System.out.println("Ответ: " + yy.y);
                    break;
                default:
                    System.out.println("Введён некорректный знак!");
            }}while (yy.y != 999999999);
    }
}

class Args {
    double a;
    double b;
    char q;
    double y;
}