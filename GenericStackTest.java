package recursion;
import java.util.Scanner;
public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			stack1.push(sc.nextLine());
		}
		sc.close();
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}
	}
}