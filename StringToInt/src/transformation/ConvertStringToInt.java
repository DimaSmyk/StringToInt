package transformation;

import java.util.Scanner;

public class ConvertStringToInt {

    static int num;
    public static void main(String[] args) {
        scScanner();
    }
    public static void stringToInt(String input) throws NumberFormatException {

        char firstChar = input.charAt(0);
        if (firstChar == '+' | firstChar == '-') {
            transformationCycle(1, input);
            if (firstChar == '+') {
                System.out.println(num );
            } else {
                System.out.println( "-" + num);
            }
        } else {
            transformationCycle(0, input);
            System.out.println( num);
        }
    }

    public static void transformationCycle(int a, String input) {

        for (int i= a; i < input.length(); i++) {
            if ((input.charAt(i) >= 48) && (input.charAt(i) <= 59)) {
                num = num * 10 + (input.charAt(i) - 48);
            } else {
                throw new NumberFormatException();
            }
        }
    }

    public static void scScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = sc.nextLine();
        double maxLimit = Math.pow(2,32) - 1;

        while (true) {
            if (input.length() >= 2 && input.length() <= maxLimit || input.equals("0")) {
                stringToInt(input);
                break;
            }
            else {
                System.out.println("If you need to enter numbers [1-9]. Add '+' or '-' at the beginning");
                System.out.println("Repeat enter");
                input = sc.nextLine();
            }
        }
    }

}
