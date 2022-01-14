import java.util.*;

public class MethodForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(UtilsForEach::myMethod);
    }
}
