import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
            for(int j=0; j<10; j++){
                array[j] = scanner.nextInt();
            }
            quickSort(array, 0, array.length-1);
            System.out.println(array[7]);
        }
    }


    private static void quickSort(int[] array, int left, int right) {
        if(left < right ){
            int mid = getPivot(array, left, right);
            quickSort(array, left, mid);
            quickSort(array, mid+1, right);
        }
    }

    private static int getPivot(int[] array, int left, int right) {
        int pivot = array[left];
        int l = left+1;
        int r = right;

        while(l <= r){
            if(pivot >= array[l]){
                l++;
            }
            else if(pivot < array[r]){
                r--;
            }
            else{
                swap(array, l, r);
            }
        }

        swap(array, left, r);
        return r;
    }

    private static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

