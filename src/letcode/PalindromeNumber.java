package letcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String inp = Integer.toString(x);
        for (int j = 0; j < inp.length(); j++) {
            if (inp.charAt(j) != inp.charAt(inp.length() - j - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 1111;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(input);
        System.out.println(result);
    }
}
