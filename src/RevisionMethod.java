public class RevisionMethod {
    /*
    Find the total number of elements in the array.
Count the total number of odd elements.
Print the index of the first 50 even numbers.
Find the index of the last even number.
Find the index of the second last odd number.
Find how many 3-digit elements are there in the given array.
Find the smallest element from the array.
Find the largest element from the array.
Print the 5th odd element every time, but count all the even elements and print
     */

    public static void main(String[] args) {
        int[] givenArray = {};
        RevisionMethod object = new RevisionMethod();
        // calling
        int totalElementInGivenArray = object.totalElement(givenArray);
        System.out.println("totalElementInGivenArray = " + totalElementInGivenArray);

        int totalOddCount = object.totalOddElements(givenArray);
        System.out.println("totalOddCount = " + totalOddCount);

        int secondLast = object.indexOfSecondLastOddElement(givenArray);
        System.out.println("secondLast = " + secondLast);

    }

    //Print the index of the first N even numbers, N is denoted by limit.
    public static void printNEvenElementIndexs(int[] arr, int limit) {
        int printCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(i + ", ");
                printCount++;
            }
            if (printCount == limit) {
                break;
            }
        }
    }

    //Find the total number of elements in the array.
    public int totalElement(int[] arr) {
        int response = 0;
        response = arr.length;
        return response;
    }

    //Count the total number of odd elements.
    public int totalOddElements(int[] arr) {
        int response = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        response = count;
        return response;
    }

    //Find the index of the last even number.
    public int indexOfLastEvenNUmber(int[] arr) {
        int response = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                response = i;
            }
        }
        // by reverse traversing
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                response = i;
                break;
            }
        }

        return response;
    }

    //Find the index of the second last odd number.
    public int indexOfSecondLastOddElement(int[] arr) {
        int response = 0;
        int lastIndex = -1;
        int secondLast = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                secondLast = lastIndex;
                lastIndex = i;
            }
        }
        response = secondLast;
        int oddCount = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
            if (oddCount == 2) {
                response = i;
                break;
            }
        }
        return response;
    }
}
