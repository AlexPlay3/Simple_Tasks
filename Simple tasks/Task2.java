package Simple;

import java.util.Scanner;

public class Task2 {
	
    public static void main(String[] arg) {
        //Найдите  значение функции: с = 3 + а.

        double a;
        double c;

        a = enterDouble("enter a:");
        c = 3 + a;

        System.out.println("c = " + c);

    }

    public static double enterDouble(String message) {

        double a;

        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();

            System.out.print(message);
        }
            a = sc.nextDouble();
            return a;

        }

}
