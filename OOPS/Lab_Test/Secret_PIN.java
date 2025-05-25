import java.util.Scanner;

public class Secret_PIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part-1: Encryption
        System.out.print("Enter 4-digit PIN: ");
        String pin = sc.next();
        System.out.print("Enter key (1–10): ");
        int key = sc.nextInt();

        char[] encrypted = new char[4];
        for (int i = 0; i < 4; i++) {
            int ascii = (pin.charAt(i) - '0') + 48; // ASCII of digit
            encrypted[i] = (char)(ascii + key);
        }

        System.out.print("Encrypted PIN: ");
        for (char ch : encrypted) System.out.print(ch + " ");
        System.out.println();

        // Part-2: Decryption
        System.out.print("Decrypted PIN: ");
        for (char ch : encrypted) {
            int decryptedAscii = (int)ch - key;
            int digit = decryptedAscii - 48;
            System.out.print(digit);
        }
        System.out.println();
    }
}
