import java.util.*;
public class Palindrome {
	public static void main(String arg[])
	{
		Scanner scan = new Scanner (System.in);
		
		//1
		String s = scan.nextLine();
		System.out.println(s.length());
		
		//2
		s = scan.nextLine();
		System.out.println(s.substring(1,s.length()));
		
		//3
		s = scan.nextLine();
		System.out.println(s.substring(0 , s.length()-1));
		
		//4
		String wordOne = scan.nextLine();
		String wordTwo = scan.nextLine();
		String another = wordOne + wordTwo + wordOne;
		
		System.out.println(another);
		//5
		System.out.println("Print a string with even characters");
		String evenString = scan.nextLine();
		if(evenString.length() < 2) {
		for (int i = 0; i < evenString.length()/2; i++) {
			 System.out.println(evenString.substring(i,i+1));
			
		}
		
		//6
		String a = scan.nextLine();
		String b = scan.nextLine();
		another = a.substring(1)+ b.substring(1);
		
		//7
		
		//8
		a = scan.nextLine();
		String word = "BAD";
		if(a.substring(0,3).equals(word)) {
			System.out.println("HAS BAD");
		}
		//9
		b = scan.nextLine();
		a = scan.nextLine();
		 word = "way";
		if(a.substring(0,3).equals(word)) {
			System.out.println("NO WAY");}
		
		//10
		 b = scan.nextLine();
		 System.out.println(b.substring(1,b.length()-1));
		 
		//11
		String oddstring = scan.nextLine();
		oddstring = "wells";
		int half = (oddstring.length()/2) -1;
		
		System.out.println(oddstring.substring(half, half+4));
		
		//Palindrome checker 
		
		String phrase;
	    
	    System.out.println("Enter a String or write stop to stop");    
	    phrase = scan.nextLine();
	    phrase = phrase.toLowerCase();
	    while (!phrase.equals("stop") )
	            { 
	              
	                
	            

	    String temp = phrase.replace(" ","");
	    temp = temp.toUpperCase();
	    System.out.println(temp);
	    boolean isPalindrome = true;
	    int j = 0;
	    for (int i = phrase.length() -1; i>= 0; i--)
	        {
	        if( temp.charAt(i) != temp.charAt(j))
	        {
	            System.out.println(j);
	            isPalindrome = false;
	            break;
	        }
	        
	        
	        j++;
	    }
	    
	    if (isPalindrome)
	    {
	    System.out.println(phrase +"is a Palindrome");
	    
	    
	    }
	    else 
	    {
	    System.out.println(phrase +" is not a Palindrome");
	    }
	    System.out.println("Enter a String or write stop to stop");    
	    phrase = scan.nextLine();
	    
	   
	}
	System.out.println("Good Bye!");
		
		}
		int arr[] = {4,7,6,3,5,2,4,3};
		System.out.println(arr[arr[2]]);
		String veggies [] = new String [4];
		System.out.println(veggies[0]);
		
		int kts[] = {2,4,5,8,16,2,3,5,9,0,9,12,6};
		System.out.println(Math.abs(-123));
		
		String [] encoded = {"m", "p" ,"a", "a", "r", "i", "k", "n", "e", "t"};
		String s1 ="";
		for (int g =1; g <encoded.length; g+=2) {
			s+=encoded[g];
		}
		System.out.println(s1);
		String [] pets = {"pig", "dog", "cat"};
		System.out.println(pets);
		
		String countries [] = new String [3];
		countries[2] = "Germany";
		System.out.println(Arrays.toString(countries)); 
		
		double mnop[] = new double [5];
		System.out.println(mnop[3] );
		
		String [] strings = {"sandy","Hanna","Daniel","Ruben", "sophie" };
		
		for (int n =0; n < strings.length; n++) {
			System.out.print(strings[strings.length-1-n] + " ");
		}
		System.out.println();
		
		for (int n = strings.length -1; n>=0; n--){
		System.out.print(strings[n]+" ");	
		
		}
		
		int nums[] = new int [100];
		

		for(int i =0; i<nums.length; i++){
		

		nums [i] = (i+1) * (i+1);
		}
		System.out.println(Arrays.toString(nums)); 
		
		double[] values = {2,4,5,8,16,2,3,5,9,0,9,12,6};
		double sum = 0.0;
		for (int i =0; i< values.length; i++) {
			sum++;
		}
		
	}
		
}


