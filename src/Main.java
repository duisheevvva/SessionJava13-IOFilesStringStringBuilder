
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Nurkyz");
        students.add("Sabina");
        students.add("Joomart");
        students.add("Bektur");
        students.add("Sultan");
        students.add("Nurtilek");
        students.add("SultanAli");
        students.add("Nurmuhammed");
        students.add("Yzaat");
        students.add("Eldiyar");
        students.add("Kudaiberdi");
        students.add("Nurmuhammed");
        students.add("Bektur");
        students.add("Zaripbek");
//        TODO 1
        students.add(0, "Beknazar");
        System.out.println("1-position updated : " + students);

//        TODO 2
        String student = students.get(3);
        System.out.println("Found element: " + student);

//        TODO 3
        students.set(6, "NurtilekUpdated");
        System.out.println("6- position updated list : " + students);

//        TODO 4

        students.remove(3);
        System.out.println("3 position deleted :" + students);

//        TODO 5
        if (students.contains("Nurkyz")) {
            System.out.println(" Search element found!");
        } else {
            System.out.println("Element not found!");
        }

//        TODO 6
        List<String> subList = students.subList(0, 7);
        System.out.println("SubList : " + subList);

//        TODO 7
        List<String> mentors = new ArrayList<>();
        mentors.add("Ulan agai");
        mentors.add("Aizat");
        mentors.add("Datka");
        students.addAll(mentors);
        System.out.println("Join list :" + students);
//        TODO 8
        Collections.reverse(students);
        System.out.println("reversed list : " + students);

//        TODO 9
        students.removeAll(students);
        System.out.println("Clear list : " + students);

//        TODO 10
        System.out.println("List is empty : " + students.isEmpty());


    }
}