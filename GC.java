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
	}
}