import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, w, h, ans;

        x = scanner.nextInt();
        y = scanner.nextInt();
        w = scanner.nextInt();
        h = scanner.nextInt();

        ans = Math.min(Math.min(w-x, x), Math.min(h-y,y));
        System.out.println(ans);

    }
}
