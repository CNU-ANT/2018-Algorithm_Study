import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = bufferedReader.readLine().split(" ");
        char[] A = inputStr[0].toCharArray();
        char[] B = inputStr[1].toCharArray();

        reversing(A);
        reversing(B);

        int x = Integer.parseInt(String.valueOf(A));
        int y = Integer.parseInt(String.valueOf(B));
        char[] result = String.valueOf(x + y).toCharArray();

        reversing(result);
        System.out.println(Integer.parseInt(String.valueOf(result)));

    }

    public static void reversing(char[] array){
        int size = array.length;
        char temp;
        for(int i=0; i<size/2; i++){
            temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
    }
}
