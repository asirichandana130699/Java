package conditionsandloops;

public class PatternProgram {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++) {
            int cols = rows - i - 2;
            for(int j = cols; j >= 0; j--) {
                System.out.print("+ ");
            }
            for(int j = cols; j < rows; j++) {
                System.out.print("- ");
            }
            System.out.println(" ");
        }
    }
}
