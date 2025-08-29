public class Calculator {
    static int count;
    public int addition(int number1, int number2){
        greet();
        int response = 0;
        response = number1 + number2;

        return response;
    }

    public static void greet(){
        System.out.println("hello");
        count++;

    }


}
