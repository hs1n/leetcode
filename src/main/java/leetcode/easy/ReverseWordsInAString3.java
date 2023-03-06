package leetcode.easy;


/**
 * @author hsin
 * @see <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */

public class ReverseWordsInAString3 {

    public String reverseWordsByPrimitiveDataType(String s) {
        char[] words = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        int wordStart = 0;
        while (start < end) {
            // words that tailing ' '
            if (words[start] == ' ') {
                int wordEnd = start - 1;
                reverse(words, wordStart, wordEnd);
                wordStart = start + 1;
            }
            start++;
        }

        // Last word
        reverse(words, wordStart, end);

        return String.valueOf(words);
    }

    private void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            // swap wordArray[start] and wordArray[end]
            charArray[start] ^= charArray[end];
            charArray[end] ^= charArray[start];
            charArray[start] ^= charArray[end];
            start++;
            end--;
        }
    }

    public String reverseWordsByStringBuilder(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder(s.length());
        int end = 0;

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            int start = 0;
            int mid = wordArray.length - 1;
            while (start < mid) {
                // swap wordArray[start] and wordArray[end]
                wordArray[start] ^= wordArray[mid];
                wordArray[mid] ^= wordArray[start];
                wordArray[start] ^= wordArray[mid];
                start++;
                mid--;
            }
            sb.append(wordArray);
            if (end < words.length - 1) {
                sb.append(' ');
            }
            end++;
        }

        return sb.toString();
    }
}