import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        String[] enterLine = ReadLine.readStr();
        Experssion expression = null;
        if (Experssion.isArabic(enterLine))
            expression = new ArabicExpression(enterLine[0], enterLine[1], enterLine[2]);
        if (Experssion.isRoman(enterLine))
            expression = new RomanExpression(enterLine[0], enterLine[1], enterLine[2]);
        expression.showRes(expression);
    }

}
