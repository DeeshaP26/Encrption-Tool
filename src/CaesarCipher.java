package src;

public class CaesarCipher {
    
    // Encrypt function
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) (base + (character - base + shift) % 26));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
    
    // Decrypt function
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);  // Reverse shift for decryption
    }
}
