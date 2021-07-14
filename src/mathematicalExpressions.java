public class mathematicalExpressions {
    public static void main (String[] args) {


        // declare variable

        int result;
        int operand1;
        int operand2;
        int operand3;
        int operand4;

        // now result has the value of 0

        result = 0;

        // initialize the operands
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;

        // addition

        result = 42 + 53;
        result = operand1 + operand2;
        result = 1 + operand1;
        result = 1 + operand1 + operand2 + operand3;
        result = 2;
        result += 4;
        result += operand1;
        result = 9 - 5;
        result = operand1 - operand2;
        result = 15 - operand1;
        result = 0;
        result = 2;

        //  substraction
        result -= 4;
        result -= operand1;
        result -= operand1 - operand2 - operand3;

        // multiplication

        result = 0;
        result = operand1 * operand2 * operand3;
        result *= 2;

        // division and modulus
        result /= 2;
        result /= 2;
        result /= operand1;
        result /= 3;
        result /= 3;
        // this variable turn integer 2 but if use float it turn 2.6

        result = operand1 % operand2;
        result = 100 % 7;

        // postfix and prefix operators

        operand1 = 10; // it changes variable from 5 to 10
        result = ++operand1;

        System.out.println(result);
    }
}
