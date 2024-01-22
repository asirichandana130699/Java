public class ReverseWord {

    static String checkReverseOfEachWord(String input) {

        String[] stringArray = input.split(" ");
        String reverseString = "";
        for(int i = 0; i < stringArray.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            reverseString += stringBuilder.reverse() + " ";
        }
        return reverseString;
    }
    public static void main(String[] args) {
        System.out.println(checkReverseOfEachWord("Java J2EE Reverse Me"));
    }
}