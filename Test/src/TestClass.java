import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] a) {
        /*String s = "java is (programming) language";
        char[] arr = s.toCharArray();
        String res = "";
        boolean flag = false;
        for(int i = 0; i< arr.length-1; i++) {
            if(arr[i] == '(') {
                i+= 1;
                flag = true;
            }
            if(flag && arr[i] != ')' && arr[i] !='(') {
                res += arr[i];
            }
            if(arr[i] == ')') {
                flag = false;
            }
        }
        System.out.println(res);
    }*/
        String[] ls1 = {"EAR", "ARM", "SAW", "Programming", "ARE", "RAM", "WAS", "Developer"};
        //String[] ls2 = {"ARE", "RAM", "WAS", "Developer"};

        for (int i = 0; i < ls1.length-1; i++) {
            for (int j = i + 1; j < ls1.length; j++) {
                char[] ar1 = ls1[i].toCharArray();
                char[] ar2 = ls1[j].toCharArray();
                Arrays.sort(ar1);
                Arrays.sort(ar2);
                if (Arrays.equals(ar1, ar2)) {
                    System.out.println(ls1[i] + " " + ls1[j]);
                }
            }
        }
    }
}
