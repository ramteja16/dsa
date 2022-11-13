package strings;
import java.util.*;
class CharIntPair {
	char ch;
	int num;
	CharIntPair(char ch,int num){
		this.num=num;
		this.ch=ch;
	}
	char getChar() {
		return ch;
	}
	int getCount() {
		return num;
	}
}
public class MaxRepeatCharInString {

	static CharIntPair mostFrequent(String str, int n) {
		Map<Character, Integer> hp =new HashMap<Character, Integer>();
		for(int i = 0; i < n; i++)
        {
            char key = str.charAt(i);
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                hp.put(key, ++freq);
            }
            else hp.put(key, 1);
        }
		int max_count = 0;
		char max_repeated_element='-';
        
        for(Map.Entry<Character, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
            	max_repeated_element = val.getKey();
                max_count = val.getValue();
            }
        }
        CharIntPair p=new CharIntPair(max_repeated_element,max_count);
        return p;
	}
	
	public static void main(String[] args) {
		String str="fdhlkjnlml";
        int n = str.length();
        CharIntPair obj=mostFrequent(str, n);
        if(n>0)System.out.println("most repeated element is: "+ obj.getChar()+" && count is :"+obj.getCount());
        else System.out.println("String is null");

	}
}
