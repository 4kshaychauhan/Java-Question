import java.util.Scanner;

public class Palindrome {
    public static void main(String arr[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String str2 = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                str2 += str.charAt(i);
            }

            if (str.equals(str2)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}