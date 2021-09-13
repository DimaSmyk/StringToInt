package transformation;

public class ConvertStringToInt {

    public static void main(String[] args) {

        String s = "+1234";
        StringToInt(s);

    }

    public static void StringToInt(String s) throws NumberFormatException {

        if (s.isEmpty()) {
            throw new NumberFormatException("null");
        }
        char firstChar = s.charAt(0);
        int num = 0;
        if (firstChar == '+') {
            for (int i = 1; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 48) && ((int) s.charAt(i) <= 59)) {
                    num = num * 10 + ((int) s.charAt(i) - 48);
                } else {
                    throw new NumberFormatException();
                }
            }
            System.out.println(num);

        } else if (firstChar == '-') {
            for (int i = 1; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 48) && ((int) s.charAt(i) <= 59)) {
                    num = num * 10 + ((int) s.charAt(i) - 48);
                } else {
                    throw new NumberFormatException();
                }

            }
            System.out.println("-" + num);

        } else {
            for (int i = 0; i < s.length(); i++) {
                if (((int) s.charAt(i) >= 48) && ((int) s.charAt(i) <= 59)) {
                    num = num * 10 + ((int) s.charAt(i) - 48);
                } else {
                    throw new NumberFormatException();
                }

            }
            System.out.println(num);
        }

    }
}
