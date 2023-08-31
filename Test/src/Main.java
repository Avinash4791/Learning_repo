import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "";
        for(int i = str.length()-1; i>=0; i--) {
            //s = s+str.charAt(i);
            System.out.print(str.charAt(i));
        }
        String res = s.equalsIgnoreCase(str) ? "its palindrome" : " not palindrome";
        //System.out.println(res);
    }
}