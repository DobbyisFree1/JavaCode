import java.util.Scanner;

public class Test3{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		in.close();
		if(i%4==0 && i%100!=0) {
			System.out.println("1");
		}else if(i%4==0 && i%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
    }
}
