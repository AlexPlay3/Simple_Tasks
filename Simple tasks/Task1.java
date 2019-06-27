package Simple;

import java.util.Scanner;

public class Task1 {

	    private static Scanner sc;

		public static void main(String[] arg) {

	//Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное.

	        double x;
	        double y;

	        double sum;
	        double raz;
	        double proizv;

	        x = enterDouble("entrer x: ");
	        y = enterDouble("enter y: ");

	        sum = x + y;
	        raz = x - y;
	        proizv = x * y;

	        System.out.println("summa = " + sum);
	        System.out.println("raznost = " + raz);
	        System.out.println("proizvedenie = " + proizv);
	    }

	    public static double enterDouble(String message) {

	        sc = new Scanner(System.in);

	        double a;

	        System.out.print(message);
	        while (!sc.hasNextDouble()) {
	            sc.next();
	            System.out.print(message);
	        }
	        a = sc.nextDouble();
	        return a;

	    }

}
