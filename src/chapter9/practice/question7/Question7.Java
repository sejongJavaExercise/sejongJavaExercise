import java.util.Scanner;

public class FirstDigitSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int result = -1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) { 
                int digit = Character.getNumericValue(c); 
                result = digit * digit; 
                break; 
            }
        }

        System.out.println(result);
    }
}
