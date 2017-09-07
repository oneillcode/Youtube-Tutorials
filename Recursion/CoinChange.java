
public class CoinChange {

	/*
	 * You are given coins of different denominations and a total amount of money.
	 * Write a function to compute the number of combinations that make up that amount.
	 * 
	 */
	
	public static int[] coins = {1,2};
	public static int amount = 4;
	
	public static void main(String[] args) {
		System.out.println(combo(4,0));
	}
	
	public static int combo(int amount, int currentCoin){
		
		if( amount == 0)
			return 1;
		
		if( amount < 0)
			return 0;
		
		int nCombos = 0;
		for( int coin = currentCoin; coin < coins.length; coin++){
			nCombos += combo(amount - coins[coin],coin);
		}
		
		return nCombos;
	}
}
