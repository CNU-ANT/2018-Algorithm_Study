import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int targetIndex = -1;
		int temp = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<9; i++){
			temp = scanner.nextInt();
			if(max < temp){
				max = temp;
				targetIndex = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(targetIndex);
	}

}

