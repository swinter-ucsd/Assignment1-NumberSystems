public class Binary {

	public Binary() {
		
	}
	public static String binaryConvertToHexadecimal(String binaryString) {
		String thisHex = "";
		char[] hexadecimal = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
				'b', 'c', 'd', 'e', 'f' };

		if ((binaryString != null) && (!binaryString.isEmpty())) {
			int decimal = binaryConvertToDecimal(binaryString);
			while (decimal > 0) {
				thisHex = hexadecimal[decimal % 16] + thisHex;
				decimal /= 16;
			}

		}

		return thisHex;
	}

	public static int binaryConvertToDecimal(String binaryString) {
		int binaryInt = Integer.parseInt(binaryString);
		int thisDecimal = 0;
		int counter = 0;
		while (true) {
			if (binaryInt == 0) {
				break;
			} else {
				int temp = binaryInt%10;
				thisDecimal += temp*Math.pow(2, counter);
				binaryInt = binaryInt/10;
				counter++;
			}
		}
		return thisDecimal;
	}
}
