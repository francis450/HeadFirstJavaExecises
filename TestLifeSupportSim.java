//import java utilities package
import java.util.*;

class TestLifeSupportSim{
	public static void main(String [] args){
		//Make a SimUnit type ArrayList reference and assign it an actual Arraylist
		ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
		//Make a new V2radiator and assign it a reference v2
		V2Radiator v2 = new V2Radiator(aList);	
		//MAke a new V#Radiator and assign it a reference v3
		V3Radiator v3 = new V3Radiator(aList);

		for(int z = 0; z < 20; z++){
			//Make 20 RetenetionBots' all with the same reference and pass to their constructor an ArrayList
			RetenetionBot ret = new RetenetionBot(aList); 
		}
	}
}