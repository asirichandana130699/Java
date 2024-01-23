package string;

public class VowelCount {

    public int countVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (char character : inputString.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                count++;
            }
        }

        return count;
    }
}