//Import java utilities package
import java.util.*;

public class V3Radiator extends V2Radiator{
	//Make a V3Radiator constructor that takes in an ArrayList in the arguments
	V3Radiator(ArrayList lglist){
		//Pass the ArrayList in the constructor arguments to the superclass constructor(V2Radiator)
		super(lglist);
		for(int i = 0; i < 10; i++){
			//make a new SimUnit object and add  it into the ArrayList in the arguments
			lglist.add(new SimUnit("V3Radiator"));
		}
	}
}