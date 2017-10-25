package basic;

public class Masking {
	public static void main(String[] args) {
		/* Masking contain two thing mask and value
		 * like 0001 is the value
		 * 0100 is the mask
		 * then after the masking
		 * resultant is 0101
		 * 
		 * note mask must contain only single 1 bit if work with multiple masking
		 */
		
		// first mask 0001 with mask 0010
		int value=1;
		int mask=2;
		//masking
		int aftermask=masking(value,mask);
		System.out.println("after mask   "+aftermask);// result 3 (0011)
		
		//demasking
		int demasking= demasking(aftermask, mask);
		System.out.println("after demask "+demasking);// result 1 (0001)
		
		/*
		 * 
		 * 
		 * 			Lets work with REAL EXAMPLE
		 * 
		 * 
		 */
		
		int PLAYER = 1;
		int ENEMY  = 0;
		
		int RUN    = 4;
		int SHOOT  = 8;
		
		// PLAYER can RUN
		int PLAYER_RUN = masking(PLAYER,RUN);
		System.out.println("PLAYER can RUN "+PLAYER_RUN);// 5 (0101)
		
		// PLAYER can RUN and SHOOT
		int PLAYER_RUN_SHOOT = masking(PLAYER_RUN,SHOOT);// Also equal to PLAYER|RUN|SHOOT
		System.out.println("PLAYER can RUN and SHOOT "+PLAYER_RUN_SHOOT);//13 (1101)
		
		/*
		 * If we want our player to shoot only
		 * we have remove/demask RUN in our PLAYER_RUN_SHOOT
		 * 
		 */
		
		// PLAYER can SHOOT only not RUN
		int PLAYER_SHOOT = demasking(PLAYER_RUN_SHOOT,RUN);
		System.out.println("PLAYER can SHOOT "+PLAYER_SHOOT);//9 (1001)
		
		
	}
	
	static int masking(int value,int mask) {
		return value|mask;
	}
	
	static int demasking(int aftermask,int mask) {
		//return aftermask&~mask;
		return aftermask^mask;
	}
	
}
