public class Decimal {

	public Decimal() {

	}


	public static String decimalConvertToBinary(int decimalInteger) {

		int binary[] = new int[100];
		int counter = 0;
		String binaryString = "";

		
			while (decimalInteger > 0) {
				binary[counter] = decimalInteger % 2;
				decimalInteger = decimalInteger/2;
				counter ++;
			}
			for (int index = counter - 1; index >= 0; index--) {
				binaryString = binaryString + binary[index];
			}

		 

		return binaryString;
	}
	public static String decimalConvertToHexadecimal(int decimalInteger) {
		char hexaDecimalArray[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		int remainder = 0;
		String hexaDecimal = "";

		while (decimalInteger > 0) {

			remainder = decimalInteger % 16;
			hexaDecimal = hexaDecimalArray[remainder] + hexaDecimal;	
			decimalInteger = decimalInteger /16;
			
		}

		return hexaDecimal;
	}
}
