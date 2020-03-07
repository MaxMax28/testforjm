public class ArabicExpression implements Experssion{
    String first;
    String operation;
    String second;
    ArabicExpression(String first, String operation, String second){
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
    public int calculate(Experssion ex) throws OperationExeption{
        int first = Integer.parseInt(ex.getFirst());
        String operation = ex.getOperation();
        int second = Integer.parseInt(ex.getSecond());
        int res =0;
        if (operation.equals("+"))
            res = first + second;
        else if (operation.equals("*"))
            res = first * second;
        else if (operation.equals("/"))
            res = first / second;
        else if (operation.equals("-"))
            res = first - second;
        else throw new OperationExeption("Введите правильную арифметическую операцию");
        return res;

    }
    @Override
    public void showRes(Experssion ex){
        System.out.println(ex.calculate(ex));
    }

}
