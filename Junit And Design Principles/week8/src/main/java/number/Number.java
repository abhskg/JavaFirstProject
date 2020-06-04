package number;

public class Number {

	public boolean checkPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean checkArmstrong(int num) {
		int sum = 0;
		int tmp = num;
		while (tmp != 0) {
			int digit = tmp % 10;
			tmp /= 10;
			sum += digit * digit * digit;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	public boolean checkPalindrome(int num) {
		int rev = 0, tmp = num;
		while (tmp != 0) {
			int digit = tmp % 10;
			rev *= 10;
			rev += digit;
			tmp /= 10;
		}

		if (rev == num) {
			return true;
		}
		return false;
	}

}