
import service.RemoveService;
import service.ReverseService;
import service.serviceImpl.RemoveServiceImpl;
import service.serviceImpl.ReverseServiceImpl;

public class Task2 {
    public static void main(String[] args) {

        ReverseService reverseService = new ReverseServiceImpl();
        reverseService.reverseString("Hello");
        RemoveService removeService = new RemoveServiceImpl();
        removeService.removeDuplicates("Helllllo");

        StringBuilder stringBuilder = new StringBuilder("Ata");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }

}
