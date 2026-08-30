import java.util.Arrays;

public class MainIII {
    public static void main(String args[]) {
        System.out.println("Hello String Basic.");

        /************* Starting Calling String Basic Method ********** */
        /* Find Length */

        /* Reverse Each Word */
        reverseEachWord("Hello World");
    }

    /************* Starting String Basic Question Method ************ */
    /* 1. Find Length of String */
    public static int findLength(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }

    /* 2. Count character in a Strnig */
    public static int countCharacter(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    /* 3. Count vowels in a String */
    public static int countVowels(String str) {
        int vowelcount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowelcount++;
            }
        }
        return vowelcount;
    }

    /* 4. Count consonant in a String */
    public static int countConsonant(String str) {
        int consonantCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
                    && ch != 'O' && ch != 'U') {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    /* 5. Reverse a String */
    public static String reverseString(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }

    /* 6. Palindrome String */
    public static boolean isPalindrome(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        if (sb.toString().equals(str)) {
            return true;
        }
        return false;
    }

    /* 7. Count words in a String */
    public static int countWords(String str) {
        int n = str.length();
        if (n == 0)
            return 0;

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                count++;
        }
        return count;
    }

    /* 8. Count occurance of a Character */
    public static int countCharacter(String str, char target) {
        int n = str.length();

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }

    /* 9. Remove space from a String */
    public static String removeSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /* 10. Convert String to Uppercase */
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    /* 11. Convert String to Lowercase */
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    /* 12. Count Digits in a String */
    public static int countDigits(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        return count;
    }

    /* 13. Count Letters in a String */
    public static int countLetter(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            }
        }
        return count;
    }

    /* 14. Count Special Character in a String */
    public static int countSpecialCharacter(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (!((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z') ||
                    (ch >= '0' && ch <= '9') ||
                    ch == ' ')) {
                count++;
            }
        }
        return count;
    }

    /* 15. Remove Duplicate Characters from a String */
    public static String removeDuplicates(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            boolean isVisible = false;
            char ch1 = str.charAt(i);
            for (int j = 0; j < i; j++) {
                if (ch1 == str.charAt(j)) {
                    isVisible = true;
                    break;
                }
            }
            if (isVisible)
                continue;

            sb.append(ch1);
        }
        return sb.toString();
    }

    /* 16. Find First Non-Repeating Character */
    public static char firstNonRepeatingCharacter(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDup = true;
                }
            }

            if (!isDup) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    /* 17. Find First Repeating Character */
    public static char firstRepeatingCharacter(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }
        return '\0';
    }

    /* 18. Check Whether Two Strings are Anagrams */
    public static boolean isAnagram(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        if (n != m) {
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length && i < ch2.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    /* 19. Check if String Contains Only Digits */
    public static boolean containsOnlyDigits(String str) {
        int n = str.length();

        for (char ch : str.toCharArray()) {
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    /* 20. Check if String Contains Only Alphabets */
    public static boolean containsOnlyAlphabets(String str) {
        int n = str.length();

        for (char ch : str.toCharArray()) {
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

    /* 21. Toggle Case of Each Character */
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
                sb.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /* 22. Reverse Each Word in a String */
    public static String reverseEachWord(String str) {
        String strarr[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : strarr) {
            StringBuilder wordsb = new StringBuilder(word);
            sb.append(wordsb.reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    /* 23. Remove All Duplicate Characters */
    public static String removeAllDuplicateCharacters(String str) {
        int n = str.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            boolean isVisible = false;
            boolean isDup = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isVisible = true;
                    break;
                }
            }

            if (isVisible)
                continue;

            for (int k = i + 1; k < n; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    isDup = true;
                }
            }

            if (!isDup) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    /* 24. Count Frequency of Each Character */
    public static void countCharacterFrequency(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 1;
            boolean isVisible = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isVisible = true;
                    break;
                }
            }

            if (isVisible)
                continue;

            for (int k = i + 1; k < n; k++) {
                if (str.charAt(i) == str.charAt(k))
                    count++;
            }

            System.out.print(str.charAt(i) + " = " + count + "," + " ");
        }
    }

    /* 25. Find the Maximum Occurring Character */
    public static char maxOccurringCharacter(String str){
        char ch[] = str.toCharArray();
        int max = 0;
        char res = ' ';

        if(res==' '){
            return '\0';
        }

        for(int i=0;i<ch.length;i++){
            
            int count = 1;
            
            // Handle Duplicate
            boolean isVisible = false;
            for(int j=0;j<i;j++){
                if(ch[i]==ch[j]){
                    isVisible = true;
                    break;
                }
            }

            if(isVisible) continue;
        
            // Duplicate Count
            for(int k=i+1;k<ch.length;k++){
                if(ch[i]==ch[k]){
                    count++;
                    if(count>max){
                        max = count;
                        res = ch[i];
                    }
                }
            }
        }

        // Check if max == 0 the print first index element
        if(max == 0){
            return ch[0];
        }

        return res;
    }

    /* 26. Check if Two Strings are Equal Without Using equals() */
    public static boolean areStringsEqual(String str1, String str2){
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int n = ch1.length;
        int m = ch2.length;

        //Base Case
        if(n!=m){
            return false;
        }

        for(int i=0;i<n&&i<m;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }

        return true;
    }

    /* 27. Find Length of the Longest Word */
    public static int longestWordLength(String str){
        int n = str.length();

        // Edge Case
        if(n<1){
            return 0;
        }

        int count = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                }
                count = 0;
            }
        }

        if(count>max){
            max = count;
        }

        return max;
    }

    /* 28. Reverse the Entire String Without Using StringBuilder.reverse() */
    public static String reverseString1(String str){
        int n = str.length();
        String rev = "";

        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            rev += ch;
        }

        return rev;
    }

    /* 29. Check Palindrome Without Reversing the String */
    public static boolean isPalindrome1(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);

            if(ch1!=ch2){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    /* 30 Count Occurrences of Each Word */
    public static void countWordFrequency(String str){

        if(str.length()==0){
            System.out.println("No Output");
            return;
        }

        String arr[] = str.split(" ");
        int n = arr.length;

        for(int i=0;i<n;i++){
            int count = 1;
            boolean isVisible = false;
            for(int j=0;j<i;j++){
                if(arr[i].equals(arr[j])){
                    isVisible = true;
                    break;
                }
            }

            if(isVisible) continue;

            for(int k=i+1;k<n;k++){
                if(arr[i].equals(arr[k])){
                    count++;
                }
            }

            System.out.print(arr[i] + " = " + count + "," + " ");
            
        }
    }
}