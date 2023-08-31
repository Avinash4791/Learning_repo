import java.util.Optional;

public class SpringClass {

    public static void main(String arg[]) {
        Optional<String> optional = getName();
        optional.ifPresent( System.out::println);
        System.out.println(optional.orElseGet(() -> "test"));
    }

    public static Optional<String> getName() {
        String str = "My name is TestClass";
        str = str.substring(str.indexOf("s")+2);
        return Optional.ofNullable(null);
    }
}
