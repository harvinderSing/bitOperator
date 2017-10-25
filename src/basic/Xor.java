package basic;

public class Xor {
	public static void main(String[] args) {
		//swap(4,5);
		//get_THe_LonelyBoy( new int[]{ 2,3,4,27,5,6,2,3,4,5,6 } );
		
	}
	
	static void get_THe_LonelyBoy(int[] l) {
		int lonelyBoy=l[0];
		for (int i = 1; i < l.length; i++) {
			lonelyBoy^= l[i]; 
		}
		System.out.println("Lonely Boy "+lonelyBoy);
		
	}
	
	static void swap(int a ,int b) {
		System.out.println("value of a is "+a+" value of b is "+b);
		
		a= a^b;
		b= a^b;
		a= a^b;
		System.out.println("After swap");
		System.out.println("value of a is "+a+" value of b is "+b);
	}
	
	public static long randomLong(long x) {
		System.out.println("x is "+x);
		  x ^= (x << 21);
		  x ^= (x >>> 35);
		  x ^= (x << 4);
		  return x;
		}
	
	
	/*
	 * https://accu.org/index.php/journals/1915
	 * 
	 * Random number generate by xor
	 * Linear feedback shift register
	 * Error detection
	 * RAID data protection
	 * Encryption 
	 * string EncryptDecrypt(string inputMsg,string key)
{
  string outputMsg(inputMsg);

  short unsigned int keyLength = key.length();
  short unsigned int strLength =
     inputMsg.length();

  for(int v=0, k=0;v<strLength;++v)
  {
    outputMsg[v] = inputMsg[v]^key[k];
    ++k;
    k = k % keyLength;
  }
  return outputMsg;
}
	 * 
	 */
	
}
