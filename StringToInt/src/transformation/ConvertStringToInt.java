package transformation;

public class ConvertStringToInt {

    static int num;
    public static void main(String[] args) {

        String input = "";
        if(input.length() >= 2 && input.length() <= Math.pow(2,32) ){
            stringToInt(input);
        }


    }

    public static void stringToInt(String input) throws NumberFormatException {

        if (input.isEmpty()) {
            throw new NumberFormatException("null");
        }
        char firstChar = input.charAt(0);
        if (firstChar == '+' | firstChar == '-') {
            transformationCycle(1, input);
            if (firstChar == '+') {
                System.out.println(num);
            } else {
                System.out.println("-" + num);
            }
        } else {
            transformationCycle(0, input);
            System.out.println(num);
        }
    }

    public static int transformationCycle(int a, String input) {

        for (int i= a; i < input.length(); i++) {
            if ((input.charAt(i) >= 48) && (input.charAt(i) <= 59)) {
                num = num * 10 + (input.charAt(i) - 48);
            } else {
                throw new NumberFormatException();
            }
        }
        return num;
    }
}
