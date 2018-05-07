import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A,B,C;
		A=scanner.nextInt();
		B=scanner.nextInt();
		C=scanner.nextInt();
		if(A>B && A>C){
            System.out.println(B>C?B:C);
		}else if(B>C){
			System.out.println(A>C?A:C);
		}else{
			System.out.println(A>B?A:B);
		}
	}
}

