package FunctionalProblem;



	public class ThreeSum 
	{
	    public static void main(String[] args)
	    {
	        int[] arr = { -1, 0, 1, 2, -1, -4 };
	        int n = arr.length;
	        int count = 0;

	        for (int i = 0; i < n - 2; i++) {
	            for (int j = i + 1; j < n - 1; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    if (arr[i] + arr[j] + arr[k] == 0) {
	                        System.out.println("Triplets: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
	                        count++;
	                    }
	                }
	            }
	        }

	        System.out.println("Number of distinct triplets: " + count);
	    }
	}

