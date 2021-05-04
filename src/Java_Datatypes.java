import java.util.Scanner;

public class Java_Datatypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();


        for (int i = 1; i <= numberOfInputs; i++) {

            try {
                long input = scanner.nextLong();
                System.out.println(input + " can be fitted in:");
                if (input >= -128 && input <= 127) {
                    System.out.println("* byte");
                }
                if (input >= -32768 && input <= 32767) {
                    System.out.println("* short");
                }
                if (input >= -2147483648 && input <= 2147483647) {
                    System.out.println("* int");
                }
                if (input >= -9223372036854775808L && input <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can`t be fitted anywhere");
            }
        }
    }
}
