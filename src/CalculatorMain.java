public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Calculator.count = " + Calculator.count);
        Calculator.greet();
        Calculator object = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int sum = object.addition(num1, num2);
        System.out.println("sum = " + sum);
        object.greet();

        System.out.println("How many times greet executed = " + Calculator.count);
    }
}
