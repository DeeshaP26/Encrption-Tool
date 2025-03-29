package src;

public class VigenereCipher {

    // Encrypt function
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyLength = key.length();
        
        for (int i = 0, j = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = key.charAt(j % keyLength) - 'a'; // Get shift from key
                result.append((char) (base + (character - base + shift) % 26));
                j++; // Move to next key letter
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Decrypt function
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyLength = key.length();
        
        for (int i = 0, j = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = key.charAt(j % keyLength) - 'a';
                result.append((char) (base + (character - base - shift + 26) % 26));
                j++;
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
