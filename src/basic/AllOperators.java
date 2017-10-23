package basic;

public class AllOperators {
	public static void main(String[] args) {
		/*
		 * AND
		1  1 = 1
		0  1 = 0
		1  0 = 0
		0  0 = 0
		*/
		System.out.println("1010 AND 1110 = "+(10&14)+" (1010)");
		
		/*
		 * OR
		1  1 = 0
		0  1 = 1
		1  0 = 1
		0  0 = 1
		*/
		System.out.println("1010 OR 1110 = "+(10|14)+" (1110)");
		
		/*
		 * XOR
		1  1 = 0
		0  1 = 1
		1  0 = 1
		0  0 = 0
		*/
		System.out.println("1010 XOR 1110 = "+(10^14)+" (0100)");
		
		/*
		 * NOT
		1 = 0
		0 = 1
		*/
		System.out.println("1010 AND 1110 = "+(~10)+" ");
		
		//Bit shifting
		System.out.println();
		System.out.println("Bit shifting");
		System.out.println("0010 left  shift 1 = "+(2<<1)+" (0100)");
		System.out.println("0010 right shift 1 = "+(2>>1)+" (0001)");
		
	}
}
