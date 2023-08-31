import java.util.Scanner;
import java.util.stream.IntStream;

public class PatternProgram {

    public static void main(String arg[]) {
       /* Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();*/
        /*for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        for(int i = 1; i<=5; i++) {
            for(int j = 5; j>i; j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
