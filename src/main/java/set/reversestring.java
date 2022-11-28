package set;

public class reversestring {
	public static void reverse() {
		String jl = "lol";
		String reverse="";
		for(int i=jl.length()-1;i>=0;i--) {
			reverse=reverse+jl.charAt(i);
	
		}
	if(reverse.equals(jl)) {
		System.out.println("it is a palindrome");
	}
		else {
			System.out.println("it is not palindrome");
		}
		}
	
	
	public static void main(String[] args) {
		 reversestring gh= new reversestring();
		 gh.reverse();
	
	}


	
}
