import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the other number: ");
        int secondNumber = sc.nextInt();

        try {
            count(firstNumber, secondNumber);
        } catch (InvalidParametersException exception){
            System.out.println("The first parameter must be bigger than the second one.");
        }
    }

    static void count(int firstNumber, int secondNumber) throws InvalidParametersException {
        if (firstNumber < secondNumber){
            throw new InvalidParametersException();
        }

        int target = firstNumber - secondNumber;
        System.out.println(target);

        for (int i = 1; i <= target; i++) {
            System.out.println("Printing the number " + i + ".");
        }
    }
}
