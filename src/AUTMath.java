/**
 * This class is used to perform simple mathematical
 * operations.
 */
public class AUTMath {
    /**
     * addition operator
     * @param num1 operand
     * @param num2 operand
     * @return the sum of two operands
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * subtraction operator
     * @param num1 operand
     * @param num2 operand
     * @return the result of subtracting the second parameter from the first.
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * multiplication operator
     * @param num1 multiplicant
     * @param num2 multiplier
     * @return the multiplication of the parameters
     */
    public static int multiply(int num1, int num2) {
        int result = 0;
        int sign = 1;

        if(num1<0) {
            num1 = -num1;
            sign = sign * (-1);
        }
        if(num2<0) {
            num2 = -num2;
            sign = sign * (-1);
        }

        for (int i = 0; i < num2; i++) {
           result += num1;
        }
        return result * (sign);
    }

    /**
     * Division operator
     * @param num1 divided
     * @param num2 divisor
     * @return The result of dividing the first parameters by the second parameter
     */
    public static int divide(int num1, int num2) {
        if(num2 == 0) {
            num2=1;
        }
        return num1 / num2;
    }

    /**
     * Factorial operator
     * @param number operand
     * @return the factorial of the passed in parameter
     */
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }

    /**
     * power operand
     * @param base the base operator
     * @param power the power operator
     * @return the result of raising the first parameter to the power of the second parameter.
     */
    public static int pow(int base, int power) {
        return base * pow(base, power - 1);
    }
}
