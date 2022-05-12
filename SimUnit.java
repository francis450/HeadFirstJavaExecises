public class SimUnit{
	//A string for the type of bot in use
	String botType;

	//A constructor that takes in a string
	SimUnit(String type){
		//pass the string into the botType string
		botType = type;
	}

	//An int variable for powerUse
	int powerUse(){
		//Check if the botType is equal to 'Retention'
		if("Retention".equals(botType)){
			//Return 2 if botType is equal to 'Retension'
			return 2;
		}else{
			//Return 4 if botType is not equal to 'Retens'
			return 4;
		}
	}
}