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
}