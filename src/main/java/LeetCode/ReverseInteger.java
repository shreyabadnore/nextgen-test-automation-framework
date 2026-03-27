package LeetCode;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverse(-123));

	}

	public static int reverse(int x) {
		boolean neg = false;
		if (x < 0) {
			neg = true;
			x = -x;
		}
		long ans = 0;
		while (x != 0) {
			int remainder = x % 10;
			ans = ans * 10 + remainder;
			x = x / 10;

		}
		if (neg) {
			ans = -ans;
		}
		if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) ans;
	}
}

//Question

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
