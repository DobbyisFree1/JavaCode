import java.util.Scanner;

public class Test2{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = in.nextInt();
		in.close();
        
		if(90<=i && i<=100) {
			System.out.println("A");
		}else if(80<=i && i<90) {
			System.out.println("B");
		}else if(70<=i && i<80) {
			System.out.println("C");
		}else if(60<=i && i<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}