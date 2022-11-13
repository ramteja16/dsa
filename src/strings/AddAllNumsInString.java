package strings;

public class AddAllNumsInString {

	public static void main(String[] args) {
		int sum=0;
		String str="kjhds23kjnk4565kj";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				sum+=(str.charAt(i)-'0');
			}
		}
		System.out.println("sum is : "+sum);
	}

}
