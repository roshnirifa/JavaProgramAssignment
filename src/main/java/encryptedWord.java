////16. Encrypt word: ROADTOSDET [when A=F]
////Output: WTFIYTXIJY
public class encryptedWord {
    public static void main(String[] args) {
        String word = "ROADTOSDET";
        String encryptedWord = encrypt(word);
        System.out.println("Output: " + encryptedWord);
    }

    public static String encrypt(String word) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            char encryptedChar;
            if (currentChar >= 'A' && currentChar <= 'Z') {
                encryptedChar = (char) ('A' + (currentChar - 'A' + 5) % 26);
            } else {
                encryptedChar = currentChar;
            }
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }
}
