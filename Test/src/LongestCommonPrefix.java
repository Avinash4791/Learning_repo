import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] arg) {
        String input[] = {"apple", "ape", "april"};
        int size = input.length;
        Arrays.sort(input);
        int i;
        for(i=0; i<input[0].length() && input[0].charAt(i) == input[size - 1].charAt(i); i++);
        String res = input[0].substring(0, i);
       System.out.println(res);

    }
}
