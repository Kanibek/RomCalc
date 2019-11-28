public class Calc {

    public Integer addition (Integer x , Integer y){
        return x+y;
    }
    public Integer substraction (Integer x, Integer y) {
        return x-y;
    }
    public  Integer division (Integer x, Integer y){
        return x/y;
    }
    public Integer multiplication (Integer x, Integer y)
    {
        return x*y;
    }
    public Integer action (Integer x , Integer y , String operator){
        switch (operator) {
            case "+":
                return  this.addition(x, y);
            case "-":
                return  this.substraction(x, y);
            case "/":
                return this.division(x, y);
            case "*":
                return this.multiplication(x, y);

            default:
                return 0;

        }

    }
}
