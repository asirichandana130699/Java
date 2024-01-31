package functionalinterface;

public class CaseConverter {

    public static String convertCase(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder convertedString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                convertedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                convertedString.append(Character.toUpperCase(ch));
            } else {
                convertedString.append(ch);
            }
        }

        return convertedString.toString();
    }
}
