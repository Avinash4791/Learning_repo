import java.util.Scanner;

public class StringWordReverse {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ss = "";
        String S[] = str.split("[.]");
        for(int i =S.length-1; i>0; i--) {
            ss+=S[i]+".";
        }
        ss+=S[0];
        System.out.print(ss);
    }
}
