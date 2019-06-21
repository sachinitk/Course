import java.util.Scanner;
class Main
{ 

	static int MAX_CHAR = 26; 
  
  	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
      	String s1 = sc.next();
      String result = sortCharacters(s1);
      System.out.println(result);
        } 
 

	static String sortCharacters(String s1) 
	{ 
		
		int charCount[] = new int[MAX_CHAR]; 

		
		for (int i = 0; i < s1.length(); i++) 
		{ 
			
			
			charCount[s1.charAt(i) - 'a']++; 
		} 

		// Traverse the hash array and print 
		// characters 
      String s2 = "";
		for (int i = MAX_CHAR - 1; i >= 0; i--) 
		{ 
			for (int j = 0; j < charCount[i]; j++) 
			{ 
					s2 += (char) ('a' + i); 
			} 
		} 
      return s2;
	} 
}
