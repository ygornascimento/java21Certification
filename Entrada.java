import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = a + b;
        System.out.println(sum);
	}
}
