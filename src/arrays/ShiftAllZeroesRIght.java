package arrays;

public class ShiftAllZeroesRIght {
	
	public static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr= {5,6,0,0,0,3,2};
		int i=0,j,n=arr.length;
		while(i<n && arr[i]!=0)i++;
		if(i==n)for(int k=0;k<n;k++)System.out.print(arr[k]+" ");
		j=i;
		//left of index j all are non-zero elements
		//from j to i-1 all are zeroes
		//swap 1st zero(jth index) with 1st non-zero(index i) element in right side
		//move j to ritht(now 1st zero at j+1)
		for(i=j+1; i<n; i++)
		{
			if(arr[i]!=0)
			{
				swap(arr,i,j);
				j++;
			}
		}
		for(int k=0;k<n;k++)System.out.print(arr[k]+" ");

	}

}
