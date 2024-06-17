import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int shiftFactor;

        if (scanner.hasNextInt()) {
            shiftFactor = scanner.nextInt();
        } else {
            shiftFactor = 0;
        }

        System.out.println(caeserCipher(string, shiftFactor));
    }

    static String caeserCipher(String string, int shiftFactor) {
        StringBuilder resultString = new StringBuilder();
        int n = string.length();
        int baseAscii;
        int modifiedAscii;

        for (int i = 0; i < n; i++) {
            if ('a' <= string.charAt(i) && string.charAt(i) <= 'z') {
                baseAscii = 'a';
            } else if ('A' <= string.charAt(i) && string.charAt(i) <= 'Z') {
                baseAscii = 'A';
            } else {
                resultString.append(string.charAt(i));
                continue;
            }

            int charAscii = string.charAt(i);

            if (shiftFactor < 0) {
                baseAscii += 25;
            }

            modifiedAscii = (charAscii - baseAscii + shiftFactor) % 26 + baseAscii;
            resultString.append((char) modifiedAscii);
        }

        return resultString.toString();
    }
}
