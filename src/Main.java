
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        TODO Task 1

//        File achyp atabyz
        FileWriter fileWriter = new FileWriter("java13.txt");
        fileWriter.write("""
                ~~~~~~~~~~~~~Motivation for Java 13~~~~~~~~~~
                               Нельзя научиться программированию, просто читая книги, так
                               же, как нельзя научиться ездить на велосипеде, просто читая
                               инструкцию. Нужно практиковаться!!!
                """);

        fileWriter.close();


//        file okush uchun file reader klassty koldonobuz
        FileReader fileReader = new FileReader("java13.txt");
      /*  Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();

       */


//        filedyn ichindegi maanini sala turchu peremennyi achabyz
        int charValue;
//        if ke shart berish uchun kak jardamchy peremennyi
        boolean isTrue = true;
//        counter ichindegi sozdordu sanash uchun
        int wordCount = 0;

//        while ichinde : Бул цикл файлдын аягына (-1) жеткенге чейин файлдан символдорду бирден окуйт.
        while ((charValue = fileReader.read()) != -1) {
//       file readerden charvalue ge algan textti char tibindegi peremennyiga salyp alabyz
            char currentChar = (char) charValue;
//     Циклдин ичинде ар бир символ Character.isWhitespace() method колдонуу менен ortodogu probelderdi chygarat.

//            ifttin ichindegi logika: jogoruda korsotulgon method arkyluu
//            ortodogu probelderdi karait dagy esli probel bar bolso
//            shart tuura bolot dagy wordCounter ishteit istrue= false
//              egerde shart tuura emes bolso bashkacha aitkanda ortodo probel jok bolso anda shart tuura emes bolot dagy
//            isTrue = true bolup kalat
            if (Character.isWhitespace(currentChar)) {
                if (isTrue) {
                    wordCount++;
                    isTrue = false;
                } else {
                    isTrue = true;
                }
            }
        }
//        konsolgo itogtu chygaryp beret
        System.out.println("Word count : " + wordCount);



    }
}