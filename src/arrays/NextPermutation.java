package arrays;

import java.util.*;

public class NextPermutation {
	
	static int convertToInt(List<Integer> arr) {
		long number=0;
		int index=0;
		while(index<arr.size()) {
			number*=10;
			number+=(long)arr.get(index++);
		}
		if(number<=Integer.MAX_VALUE)return (int)number;
		return -1;
	}
	
	static void reversePartOfArray(List<Integer> arr,int left,int right) {
		while(left<right) {
			Collections.swap(arr, left, right);
			left++;
			right--;
		}
	}
	
	static int solve(List<Integer> arr) {
		int left=arr.size()-2 ,right=arr.size()-1;
		while(left>=0 && arr.get(left)>=arr.get(right)) {
			left--;
			right--;
		}
		if(left<0)return -1;
		right=arr.size()-1;
		
		while(arr.get(left)>=arr.get(right))right--;
		Collections.swap(arr, left, right);
		
		reversePartOfArray(arr,left+1,arr.size()-1);
		return convertToInt(arr);
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number;
		number=sc.nextInt();
		sc.close();
		//34===3*10^0 +2*10^1
		List<Integer> arr = new ArrayList<Integer>();
		while(number>0) {
			arr.add(number%10);
			number/=10;
		}
		Collections.reverse(arr);
		
		
        System.out.println("OUTPUT: "+solve(arr));
        
	}

}
