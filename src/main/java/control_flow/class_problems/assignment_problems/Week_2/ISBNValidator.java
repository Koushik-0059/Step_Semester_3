package control_flow.class_problems.assignment_problems.Week_2;

public class ISBNValidator {

    static String normalizeCode(String raw) {

        String code = raw.trim();

        String firstThree = code.substring(0, 3).toUpperCase();
        String remaining = code.substring(3);

        return firstThree + remaining;
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        return "[" + publisher + "] YEAR: " + year
                + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        String raw = " pen2026004251 ";

        String code = normalizeCode(raw);

        System.out.println(validateAndFormat(code));
    }
}