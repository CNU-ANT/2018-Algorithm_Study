import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        int[] ans;
        int N;
        
        N = scanner.nextInt();
        ans = new int[N+1];
        ans[0] = 0;
	    for(int i=1; i<=N; i++){
	        for(int j=0; j<=i; j++){
		        ans[i] += i + j;
	        }
	    }

	    int result = 0;
	    for(int i=1; i<=N; i++){
	        result += ans[i];
	    }

	    System.out.println(result);
	    }
}

