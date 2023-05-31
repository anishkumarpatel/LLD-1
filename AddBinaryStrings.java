public class AddBinaryStrings {
	public static void main(String[] args) {
		String a = "1010110111001101101000", b = "1000011011000000111100110";
		System.out.println("addBinary: " + add(a, b)); // 1001110001111010101001110
	}
	static String add(String a, String b) {
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		String ans = "";

		while (i >= 0 || j >= 0 || carry > 0) {
			if (i >= 0 && a.charAt(i) == '1')
				carry++;

			if (j >= 0 && b.charAt(j) == '1')
				carry++;

			ans = carry % 2 + ans;

			carry = carry / 2;
			i--;
			j--;
		}
		return ans;
	}
}
