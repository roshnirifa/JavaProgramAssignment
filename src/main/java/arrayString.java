//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
//Output:
//Number of words: 4
//Number of chars without spaces: 17
//Number of vowels: 7
//Number of consonant: 10

public class arrayString {
    public static void main(String[] args) {
        String str = "I live in Bangladesh";

        int totalWord = numberOfWords(str);
        int totalCharWithoutSpace = CharactersWithoutSpaces(str);
        int totalVowel = countVowels(str);
        int totalConsonent = countConsonants(str);

        System.out.println("Number of words: " + totalWord);
        System.out.println("Number of characters without spaces: " + totalCharWithoutSpace);
        System.out.println("Number of vowels: " + totalVowel);
        System.out.println("Number of consonants: " + totalConsonent);
    }

    //Number of words
    public static int numberOfWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    //Number of characters without space
    public static int CharactersWithoutSpaces(String str) {
        String stringWithoutSpaces = str.replace(" ", "");
        return stringWithoutSpaces.length();
    }


    //NUmber of vowels
    public static int countVowels(String str) {
        int vowelCount = 0;
        String lowercaseStr = str.toLowerCase();

        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }


    //    Number of total consonent
    public static int countConsonants(String str) {
        int consonantCount = 0;
        String lowercaseStr = str.toLowerCase();

        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            if (Character.isLetter(ch) && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                consonantCount++;
            }
        }

        return consonantCount;

    }
}
