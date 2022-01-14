import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudents {
    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 'm', 22, 3, 8.3);
        Students st2 = new Students("Nikolay", 'm', 28, 2, 6.4);
        Students st3 = new Students("Elena", 'f', 19, 1, 8.9);
        Students st4 = new Students("Petr", 'm', 35, 4, 7);
        Students st5 = new Students("Mariya", 'f', 23, 3, 7.4);

        List<Students> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//            Создание Streams из готовой коллекции
        students = students.stream().filter(element -> element.getAge() > 22
                        && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(students);

//        Создание Streams с нуля
        Stream<Students> myStream = Stream.of(st1, st2, st3, st4, st5);
        myStream.filter(element -> element.getAge() > 22
                        && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
       System.out.println(students);
    }
}
