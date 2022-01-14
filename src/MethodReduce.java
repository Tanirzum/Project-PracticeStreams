import java.util.*;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);
        // 5, 8, 2, 4, 3
        // accumulator = 5 40 80 320 960
        // element =     8  2  4  3
        // result = 960
    }
}
