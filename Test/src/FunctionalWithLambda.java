import java.util.stream.Collectors;

public class FunctionalWithLambda {
    @FunctionalInterface
    interface A {

        int add(int a, int b);

        default int del(int a, int b) {
            return 0;
        }


    }
    A a = (x, y) -> x+y;
    int z = a.add(5,6);
}
