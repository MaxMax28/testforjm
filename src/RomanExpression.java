public class RomanExpression implements Experssion {
    String first;
    String operation;
    String second;
    RomanExpression(String first, String operation, String second){
        this.first = first;
        this.operation = operation;
        this.second = second;
    }
    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public String getOperation() {
        return operation;
    }

    @Override
    public String getSecond() {
        return second;
    }

    @Override
    public int calculate(Experssion ex) {
        return 0;
    }
    public String calcRoman(Experssion ex) throws OperationExeption{
        String result;
        if (operation.equals("+"))
            result = arabicToRoman(romanToArabic(first) + romanToArabic(second));
        else if (operation.equals("*"))
            result = arabicToRoman(romanToArabic(first) * romanToArabic(second));
        else if (operation.equals("/"))
            result = arabicToRoman(romanToArabic(first) / romanToArabic(second));
        else if (operation.equals("-"))
            result = arabicToRoman(romanToArabic(first) - romanToArabic(second));
        else throw new OperationExeption("Введите правильную арифметическую операцию");




        return result;
    }

    @Override
    public void showRes(Experssion ex) {
        System.out.println(calcRoman(ex));


    }

    public int romanToArabic(String roman){
        int edInt = 0;
        int decInt = 0;
        int sotInt = 0;
        int res;
        String[] ed = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dec = {" ", "X", "XX", "LV", "LXV", "L", "LXXXV", "LX", "LXXX", "XC"};
        String[] sot = {" ", "C"};
        for (int i = 0; i < ed.length; i++){
            if (roman.equals(ed[i])) {
                edInt = i;
            }
        }
        roman = removeChars(roman, ed[edInt]);
        for (int i = 0; i < dec.length; i++){
            if (roman.equals(dec[i]))
                decInt = i*10;
        }
        roman = removeChars(roman, dec[decInt/10]);
        for (int i = 0; i < sot.length; i++){
            if (roman.equals(sot[i]))
                sotInt = i*100;
        }

        res = edInt + decInt + sotInt;
        return res;
    }

    public String arabicToRoman(int arabic){
        int edInt = arabic % 10;
        int decInt = ((arabic % 100) - edInt) / 10;
        int sotInt = ((arabic % 1000) - decInt - edInt) /100;
        String[] ed = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dec = {"", "X", "XX", "LV", "LXV", "LXXV", "LXXXV", "XCV", "LXXX", "XC"};
        String[] sot = {"", "C"};
        String res = sot[sotInt] +
                dec[decInt] +
                ed[edInt];
        return res;

    }

    private static String removeChars(String input, String remove) {
        return input.replaceAll(remove, "");
    }
}
