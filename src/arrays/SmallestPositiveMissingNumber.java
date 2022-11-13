package arrays;
import java.util.*;
public class SmallestPositiveMissingNumber {
	
	static int solve(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
				int temp = nums[nums[i] - 1];
				nums[nums[i] - 1] = nums[i];
				nums[i] = temp;
			}
		}
		for (int i = 0; i < n; i++)
            if (nums[i] != i + 1)
                return (i + 1);
		return (n + 1);
	}

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n;
        n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<n; i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();
        
        System.out.println(solve(nums,n));
	}

}
