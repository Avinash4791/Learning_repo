import org.omg.Messaging.SyncScopeHelper;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface MyPredicate<T> {
    boolean tst(T t);
}
public class Java8Programs {

    public static void main(String arg[]) {
        Employee emp = new Employee("raj", "dk", 30, "Mumbai");
        Employee emp1 = new Employee("maj", "gaj", 34, "Thane");
        Employee emp2 = new Employee("rajesh", "tak", 40, "Pune");
        Employee emp3 = new Employee("jay", "shreeRam", 25, "Delhi");
        Employee emp4 = new Employee("rahul", "pani", 26, "Noida");
        List<Employee> employeeList = Arrays.asList(emp,emp1, emp2, emp3, emp4);
        List<Integer> age = employeeList.stream().map(e -> e.getAge() <30 ?e.getAge():0).collect(Collectors.toList());
        IntStream.range(1,11).forEach(System.out::println);
        List<String> firstNames = employeeList.stream().
                filter(e -> e.getFirstName().startsWith("r")).
                map(Employee::getFirstName).collect(Collectors.toList());
        System.out.println(firstNames);
        age.stream().forEach(System.out::println);
        List<String> names = employeeList.stream().map(Employee::getFirstName).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<Employee> sortedEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println("sorted names " + names);
        System.out.println("sorted employee  " + sortedEmployee);

        //String test = emp1::getFirstName;
        Predicate<Employee> prd = x -> x.getFirstName().startsWith("r");
        System.out.println(prd);
        for(Employee e : employeeList) {
            if (prd.test(e)) System.out.println(e);

        }
        Integer a = employeeList.stream().
                filter(e -> e.getFirstName().startsWith("r")).
                map(Employee::getAge).mapToInt(n -> n).sum();
        System.out.println((Integer) employeeList.stream().mapToInt(Employee::getAge).sum());
        System.out.println("sum of all ages" + a);
        Consumer<String> con = System.out::println;
        firstNames.forEach(con);
        Function<String, String> function1 = x -> x.substring(0,3);
        System.out.println(firstNames.stream().map(function1).collect(Collectors.toList()));
    }
}
