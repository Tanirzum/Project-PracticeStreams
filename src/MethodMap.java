import java.util.*;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("how are you?");
        list.add("privet");
        list.add("kak dela?");

//           Вот так можем получить длину строки без Streams
        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list);

//           Вот так можем получить длину строки через метода map
        List<Integer> list1 = list.stream().map(String::length)
                .collect(Collectors.toList());

        System.out.println(list1);

    }
}
