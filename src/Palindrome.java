import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        StringBuilder reversedInput = new StringBuilder(input);
        reversedInput.reverse();


        char[] inputInCharArray = new char[input.length()];
        char[] reversedInputInCharArray = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            inputInCharArray[i] = input.charAt(i);
            reversedInputInCharArray[i] = reversedInput.charAt(i);
        }

        int which = 0;
        for (int i = 0; i < input.length(); i++){
            if(inputInCharArray[i] == reversedInputInCharArray[i]){
                which = 1;
            } else {
                which = 0;
            }

        }
        if (which == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
