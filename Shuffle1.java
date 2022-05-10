class Shuffle1{

	//An exercise on conditional statements
	public static void main(String [] args){
		//make an int and initialise it to 3
		int x = 3;

		//execute the curly braces if x greater than two
		if( x > 2){
			//Print out 'a'
			System.out.print("a");
			//Decrement x
			x = x - 1;	
			//Print out hyphen
			System.out.print("-");
		}

		//execute the curly braces if x is equal to two
		if(x == 2){
			//Print out 'b c' to match the books pattern
			System.out.print("b  c");
			//Decrement x to prevent infinite looping
			x = x - 1;
			//Print out a hyphen
			System.out.print("-");
		}

		//Do not enter through the curly braces unless x is greater than 0
		while(x > 0){

		}
	}

}