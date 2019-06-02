package LearningJava;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = s1.nextLine();
        System.out.println("Input age: ");
        int age = s1.nextInt();
        System.out.println("Input height: ");
        float height = s1.nextFloat();
        System.out.printf("Name: %s; Age: %d; Height: %.2f", name,age,height);
        s1.close();
    }
}
