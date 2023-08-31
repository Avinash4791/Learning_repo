import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTest {
    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 98, 15);
        Set<Integer> set = new HashSet();
        // myList.stream().filter(n -> n%2 == 0).forEach(System.out::println);
        // myList.stream().map(n->n+"").filter(n->n.startsWith("1")).forEach(System.out::println);
        //myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        myList.stream().findFirst().ifPresent(System.out::println);
        String str = "Java is (programming) language";
        String result = "";
        boolean flag = false;

        char arr[] = str.toCharArray();
        for(int i = 0; i<=arr.length-1; i++) {
         if(arr[i] == '(') {
             flag = true;
         }
         if(flag) result += arr[i];

             if(arr[i] == ')') {
                 flag = false;
             }
         }
        System.out.println(result);
    }

       /* List<Integer> numbers = Arrays.asList(15, 48, 90, 13, 0, 11, 2, 101);
        System.out.println(numbers.stream().filter(Main::isPrime).collect(Collectors.toList()));
    }

    public static boolean isPrime(int number) {
                    for(int i = 1; i<= number/2; i++) {
                        if(number % i == 0) {
                            return false;
                        }
                    }
                    return true;

           return IntStream.rangeClosed(2, number/2).noneMatch(i -> number %i ==0);*/
        //}
}

