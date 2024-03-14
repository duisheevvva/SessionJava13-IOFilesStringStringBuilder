import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String>animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Hourse");
        animals.add("Dog");
        
        List<String>sortedList = new ArrayList<>();

        for (String animal :animals) {
            if (!sortedList.contains(animal))
                sortedList.add(animal);
        }
        System.out.println("Sorted : " + sortedList);
    }
}
