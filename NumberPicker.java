import java.util.Random; //Without this import, we get the following: error: cannot find symbol

public class NumberPicker {
	public static void main(String args[]) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}
