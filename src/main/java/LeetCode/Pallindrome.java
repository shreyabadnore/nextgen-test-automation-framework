package LeetCode;

public class Pallindrome {
	
	public static void main (String[]args) {
		System.out.println(isPalindrome(0));
		
	}

	    public static boolean isPalindrome(int x) {

	        // Negative numbers are not palindrome
	        if (x < 0) return false;

	        int original_number = x;
	        int reverse = 0;

	        while (x != 0) {
	            int remainder = x % 10;
	            reverse = reverse * 10 + remainder;
	            x = x / 10;
	        }

	        return reverse == original_number;
	    }
	

}
