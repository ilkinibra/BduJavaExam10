import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int product = 1;
        System.out.print("Elements divisible by 3: ");

        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
                product *= array[i];
            }
        }

        if (product != 1) {
            System.out.println("\nProduct of elements divisible by 3: " + product);
        }
        else {
            System.out.println("\nNo elements divisible by 3 found.");
        }

        scanner.close();
    }
}
