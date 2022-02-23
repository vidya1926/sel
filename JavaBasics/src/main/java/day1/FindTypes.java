package day1;

import java.util.HashSet;
import java.util.Set;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// Here is the input
		
		String cname= "Paypal";
		//Paypl,Pypl
				
		String str=cname.toLowerCase();
		//paypal yl
		char[] ch=str.toCharArray();

		Set<Character> charSet =new HashSet<Character>();
		 Set<Character> dupcharSet =new HashSet<Character>();

		for (Character eachChar : ch) 
		{
		if(!charSet.add(eachChar))
		{
			dupcharSet.add(eachChar);
		}

		}
		System.out.println(dupcharSet);
		//charSet.retainAll(dupcharSet);

		charSet.removeAll(dupcharSet);

		// yl 

		System.out.println("Charset");

		for (Character eachCh : charSet) {
			if(eachCh!=' ')
				System.out.println(eachCh);
		}


	}

}
