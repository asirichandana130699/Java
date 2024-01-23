package string;

public class ReverseWord {

    public String checkReverseOfEachWord(String input) {

        String[] stringArray = input.split(" ");
        String reverseString = "";
        for(int i = 0; i < stringArray.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            if(i != stringArray.length - 1)
                reverseString += stringBuilder.reverse() + " ";
            else reverseString += stringBuilder.reverse();
        }
        return reverseString;
    }
}