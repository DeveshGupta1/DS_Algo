class Knapsack 
{
	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	public static int knapSack(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is
		// more than Knapsack capacity W,
		// then this item cannot be included
		// in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return Math.max(val[n-1] + knapSack(W - wt[n-1], wt, val, n-1),
					knapSack(W, wt, val, n - 1));
	}

	// Driver code
	public static void main(String args[])
	{
		int val[] = new int[] {15, 14, 10, 45, 30};
		int wt[] = new int[] {2, 5, 1, 3, 4};
		int W = 7;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}

