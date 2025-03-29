package src;

import java.util.Scanner;

public class EncryptionTool {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose Encryption Method:");
        System.out.println("1. Caesar Cipher");
        System.out.println("2. Vigenère Cipher");
        System.out.println("3. AES Encryption");
        System.out.print("Enter choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        switch (choice) {
            case 1:
                System.out.print("Enter message: ");
                String caesarMessage = scanner.nextLine();
                System.out.print("Enter shift key: ");
                int shift = scanner.nextInt();
                String caesarEncrypted = CaesarCipher.encrypt(caesarMessage, shift);
                System.out.println("Encrypted: " + caesarEncrypted);
                System.out.println("Decrypted: " + CaesarCipher.decrypt(caesarEncrypted, shift));
                break;

            case 2:
                System.out.print("Enter message: ");
                String vigenereMessage = scanner.nextLine();
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                String vigenereEncrypted = VigenereCipher.encrypt(vigenereMessage, key);
                System.out.println("Encrypted: " + vigenereEncrypted);
                System.out.println("Decrypted: " + VigenereCipher.decrypt(vigenereEncrypted, key));
                break;

            case 3:
                AESEncryption.generateKey();
                System.out.print("Enter message: ");
                String aesMessage = scanner.nextLine();
                String aesEncrypted = AESEncryption.encrypt(aesMessage);
                System.out.println("Encrypted: " + aesEncrypted);
                System.out.println("Decrypted: " + AESEncryption.decrypt(aesEncrypted));
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

