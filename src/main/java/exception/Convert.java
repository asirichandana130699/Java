package exception;

public class Convert {
    public int convertString(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Not an integer");
        }
    }
}
