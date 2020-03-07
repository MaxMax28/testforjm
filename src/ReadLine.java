import java.util.Scanner;

public class ReadLine {

    public static String[] readStr() throws ArabicExeption {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        return inputArr;
    }



}
