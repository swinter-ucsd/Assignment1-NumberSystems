
public class Hexadecimal {

	public Hexadecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public static String hexadecimalConvertToBinary(String binaryString) {
		String hexadecimalString = "";
		
		
		int length = binaryString.length();
		byte[] output = new byte [length / 2];
		int lastIndex = 0;
		
		for (int index = 0; index < length; index = index + 2)
        {
			lastIndex = index + 2;
            if (lastIndex > length)
            	lastIndex = length - 1;
            output[index / 2] = (byte) Integer.parseInt(binaryString.substring(index, lastIndex), 16);
        }
		
		
		
		
		return hexadecimalString;
	}
	
	
	public static int hexadecimalConvertToDecimal(String hexadecimalString) {
		hexadecimalString = hexadecimalString.toUpperCase();
		String hexString = "0123456789ABCDEF";
		int dec_val = 0;

		for (int index = 0; index < hexadecimalString.length(); index++) {
			char hexChar = hexadecimalString.charAt(index);
			int hexInt = hexString.indexOf(hexChar);
			dec_val = 16 * dec_val + hexInt;
		}	
		return dec_val;
	}
}
