interface Experssion {

    String getFirst();
    String getOperation();
    String getSecond();
    int calculate(Experssion ex);
    void showRes(Experssion ex);




    static boolean isArabic (String... line){
        String arabicEx = "123456789010";
        if (arabicEx.contains(line[0]) ^ (arabicEx.contains(line[2])))
            throw new ArabicExeption("Ошибка ввода");

        return  ((arabicEx.contains(line[0])) && (arabicEx.contains(line[2])));

    }
    static boolean isRoman (String... line) throws RomanExeption {
        String romanEx = "IIIIIIIVVVIVIIVIIIIXX";
        if ((romanEx.contains(line[0])) ^ (romanEx.contains(line[2])))
            throw new RomanExeption("Ошибка ввода");
        return  ((romanEx.contains(line[0])) && (romanEx.contains(line[2])));
    }
}
