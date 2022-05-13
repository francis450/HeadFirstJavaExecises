//import java utities package
import java.util.*;
public class V2Radiator{
	//Make a V2Radiator constructor to take in an ArrayList in as parameters
	V2Radiator(ArrayList list){
		for(int x=0;x<5;x++){
			//Make a new SimUnit object and add it to the construcot in the arguments
			list.add(new SimUnit("V2Radiator"));
		}
	}
}