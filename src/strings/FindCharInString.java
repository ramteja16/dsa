package strings;
import java.util.*;

public class FindCharInString {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter String");
		String s=input.nextLine();
		System.out.println("Enter char");
		char ch=input.next().charAt(0);
		input.close();

		int i=0;
		for(;i<s.length();i++) {
			if(s.charAt(i)==ch)
			{
				System.out.println("found");
				break;
			}
		}
		if(i==s.length())System.out.println("not found");
		
	}

}