public class GC{

	//First doStuff() method 
	public static GC doStuff(){
		//Make an instance of the GC class
		GC newGC = new GC();	
		//Call the doStuff2() method on the new object
		doStuff2(newGC);
		//Return the new GC object
		return newGC;
	}

	public static void main(String [] args){
		//Make a GC instance variable
		GC gc1;
		//Make a second reference and assign a new object to it 
		GC gc2 = new GC();
		//Make a third reference and assign a new object to it
		GC gc3 = new GC();
		//Make a fourth reference and assign it to the object referenced by the third reference
		GC gc4 = gc3;
		//Assign the object returned the doStuff() method to the first reference variable
		gc1 = doStuff();
	}

	//second doStuff() method
	public static void doStuff2(GC copyGC){
		//Assign the GC object in the argument list to a instance reference
		GC localGC = copyGC;
	}
}