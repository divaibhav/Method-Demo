/*
Write a Java method to determine if a given number is even or odd.
 */
public class CheckEvenOdd {
    public boolean isEven(int number){
        boolean response = false;
        response = number % 2 == 0;
        return response;
    }

    public static void main(String[] args) {
        //object
        CheckEvenOdd object = new CheckEvenOdd();
        boolean result = object.isEven(35);

        if(result){
            System.out.println("Number is even");

        }else {
            System.out.println("Number is odd");
        }
        object.evenOdd(44);
    }

    public void evenOdd(int number){
        if(number % 2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    public int evenOrOdd(int number){
        int response = 0;
        response = number % 2;
        return response;
    }

    public String evenOdd1(int number){
        String response = null;
        if(number % 2 == 0){
            response = "Number is even";
        } else{
            response = "Number is odd";
        }
        return response;
    }
}
