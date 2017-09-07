public class CoinChange {

	/**
	  You are given coins of different denominations and a total amount of money.
	  Write a function to compute the number of combinations that make up that amount. 
	 */
	
	public static void main(String[] args) {
		System.out.println(change(13,new int[]{1,2,5}));
	}
	
	/**
	Uses Dynamic programming to solve the Coin Change Problem.
	Uncomment the prints for more detail.
	
	@param amount Total amount of money 
	@param coins Coins used to find different denominations
	*/
	
	public static int change(int amount, int[] coins){
		int[] combinations = new int[amount + 1];
		
		combinations[0] = 1;
		
		for(int coin : coins){
			for(int i = 1; i < combinations.length; i++){
				if(i >= coin){
					combinations[i] += combinations[i - coin];
					//printAmount(combinations);
				}
			}
			//System.out.println();
		}
		
		return combinations[amount];
	}
	
	/**
	Prints out the current state of the combinations array.
	
	@param arr Combinations Array to be printed out
	*/
	
	public static void printAmount(int[] arr){
		for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}