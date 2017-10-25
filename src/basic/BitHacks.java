package basic;

public class BitHacks {
	
	public static void main(String[] args) {
		System.out.println("result "+( 2^2 ));
	}

	static void check_Integer_Even_Odd(int x) {
		if ((x & 1) == 0) {
			  System.out.println("x is even");
			}
		else {
			System.out.println("x is odd");
		}
		/*
		        00101011
			&   00000001   (note: 1 is the same as 00000001)
    			--------
    			00000001
    			
    			
    			01100010
			&   00000001
    			--------
    			00000000	
    			
		 */
	}
	

	static void check_If_Nth_Is_Set(int x,int n) {
		if ( (x & (1<<n))>0  ) {
			  System.out.println("n-th bit is set");
		}
		else {
		  System.out.println("n-th bit is not set");
		}
		
		/*
		 * Lets check bit at 4th location
		   x =  01111010
		   n =  3 
		   
		   first shift 1 bit to 3 position by 1<<3
		   so it is like 00001000
		 
		     	01111010 
			&   00001000  
    			--------
    			00001000  (greater than zero, so n-th bit is set) 
		 
		   lets check it for 3the location
		   x =  01111010
		   n =  3 
		   
		   first shift 1 bit to 3 position by 1<<2
		   so it is like 00000100
		 
		     	01111010 
			&   00000100  
    			--------
    			00000000  (not greater than zero, so n-th bit is not set) 
		
		 */
		
		
	}
	

	static void set_nth_bit(int x,int n) {
		int y = x | (1<<n);
		System.out.println("result after set "+y);
		
		/*
		 * Lets set bit at 4th location
		   x =  01111010
		   n =  3 
		   
		   first shift 1 bit to 3 position by 1<<3
		   so it is like 00001000
		 
		     	01111010 
			|   00001000  
    			--------
    			01111010   
		 
		   lets set it for 3the location
		   x =  01111010
		   n =  3 
		   
		   first shift 1 bit to 3 position by 1<<2
		   so it is like 00000100
		 
		     	01111010 
			|   00000100  
    			--------
    			01111110  
		
		 */
		
	}


	static void unset_nth_bit(int x,int n) {
		System.out.println("after unset result is "+(x & ~(1<<n)));
	}

	static void toggle_nth_bit(int x,int n) {
		System.out.println("after toggle result is "+(x  ^(1<<n)));
	}


	static void turn_off_rightmost_first_bit(int a) {
		System.out.println("result is "+(a&(a-1)));
	}

	

	static void isolate_RightMost_bit(int x) {
		System.out.println("result is "+(x & (-x)));
	}

	static void fillall_rightmost_Zero_to_One(int x) {
		System.out.println("result is "+(x | (x-1)));
		/*
	        10111100  (x)
		|   10111011  (x-1)
    		--------
    		10111111

    		01110111  (x)
		|   01110110  (x-1)
    		--------
    		01110111

    		00000001  (x)
		|   00000000  (x-1)
    		--------
    		00000001

    		10000000  (x = -128)
		|   01111111  (x-1 = 127)
    		--------
    		11111111

    		11111111  (x = -1)
		|   11111110  (x-1 = -2)
    		--------
    		11111111

    		00000000  (x)
		|   11111111  (x-1)
    		--------
    		11111111; 
		  
		
		 */
		
		
	}

	static void isolate_RightMost_zero_bit(int x) {
		System.out.println("result is "+(~x & (x+1)));
		/*
		     	10111100  (x)
    			--------
    			01000011  (~x)
			&   10111101  (x+1)
    			--------
    			00000001

    			01110111  (x)
    			--------
    			10001000  (~x)
			&   01111000  (x+1)
    			--------
    			00001000

    			00000001  (x)
    			--------
    			11111110  (~x)
			&   00000010  (x+1)
    			--------
    			00000010

    			10000000  (x = -128)
    			--------
    			01111111  (~x)
			&   10000001  (x+1)
    			--------
    			00000001

    			11111111  (x = no rightmost 0-bit)
    			--------
    			00000000  (~x)
			&   00000000  (x+1)
    			--------
    			00000000

    			00000000  (x)
    			--------
    			11111111  (~x)
			&   00000001  (x+1)
    			--------
    			00000001 
		 
		 */
	}
	
	static void turn_On_RightMost_Zero_bit(int x) {
		System.out.println("result is "+(x | (x+1)));
		/*
	     	10111100  (x)
		|   10111101  (x+1)
    		--------
    		10111101

    		01110111  (x)
		|   01111000  (x+1)
    		--------
    		01111111

    		00000001  (x)
		|   00000010  (x+1)
    		--------
    		00000011

    		10000000  (x = -128)
		|   10000001  (x+1)
    		--------
    		10000001

    		11111111  (x = no rightmost 0-bit)
		|   00000000  (x+1)
    		--------
    		11111111

    		00000000  (x)
		|   00000001  (x+1)
    		--------
    		00000001
		 */
		
	}


}
