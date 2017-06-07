package designer;

/**
 * 
 * @author Jesse
 *Class used to create a lolChar object
 */
public class lolChar{
String name;
String abilityQ;
String qStats1;
String qStats2;
String qStats3;
String qStats4;
String qStats5;
String abilityW;
String wStats1;
String wStats2;
String wStats3;
String wStats4;
String wStats5;
String abilityE;
String eStats1;
String eStats2;
String eStats3;
String eStats4;
String eStats5;
String abilityR;
String rStats1;
String rStats2;
String rStats3;
String qValue;
String eValue;
String wValue;
String rValue;

/**
 * 
 * @param _name
 * @param _abilityQ
 * @param _qStats1
 * @param _qStats2
 * @param _qStats3
 * @param _qStats4
 * @param _qStats5
 * @param _abilityW
 * @param _wStats1
 * @param _wStats2
 * @param _wStats3
 * @param _wStats4
 * @param _wStats5
 * @param _abilityE
 * @param _eStats1
 * @param _eStats2
 * @param _eStats3
 * @param _eStats4
 * @param _eStats5
 * @param _abilityR
 * @param _rStats1
 * @param _rStats2
 * @param _rStats3
 * object used to store all of the abilities that the hashmap will be using
 */

	public lolChar(String _name,String _abilityQ,String _qStats1,String _qStats2,String _qStats3,String _qStats4,String _qStats5, 
			String _abilityW,String _wStats1,String _wStats2,String _wStats3,String _wStats4,String _wStats5,
			String _abilityE,String _eStats1,String _eStats2,String _eStats3,String _eStats4,String _eStats5,
			String _abilityR,String _rStats1,String _rStats2,String _rStats3) {
		name=_name;
		abilityQ=_abilityQ;
		qStats1=_qStats1;
		qStats2=_qStats2;
		qStats3=_qStats3;
		qStats4=_qStats4;
		qStats5=_qStats5;
		abilityW=_abilityW;
		wStats1=_wStats1;
		wStats2=_wStats2;
		wStats3=_wStats3;
		wStats4=_wStats4;
		wStats5=_wStats5;
		abilityE=_abilityE;
		eStats1=_eStats1;
		eStats2=_eStats2;
		eStats3=_eStats3;
		eStats4=_eStats4;
		eStats5=_eStats5;
		abilityR=_abilityR;
		rStats1=_rStats1;
		rStats2=_rStats2;
		rStats3=_rStats3;
		
		
		
		
		
		
	}
	
	
	/**
	 * 
	 * @param qIn
	 * Uses the local variable qIn to decide which qStat to use in the hashmap
	 */
public void setqStat( String qIn){
	if(qIn == "1"){
		
		qValue = qStats1;
	}
	if(qIn == "2"){
		qValue= qStats2;
	}
	if(qIn == "3"){
		qValue= qStats3;
	}
	if(qIn == "4"){
		qValue= qStats4;
	}
	if(qIn == "5"){
		qValue= qStats5;
	}
	
	
	
}

/**
 * 
 * @param wIn
 * uses the local variable wIn to decide which wStat to use in the hashmap
 */
public void setwStat(String wIn){
	if(wIn == "1"){
		wValue= wStats1;
	}
	if(wIn == "2"){
		wValue= wStats2;
	}
	if(wIn == "3"){
		wValue= wStats3;
	}
	if(wIn == "4"){
		wValue= wStats4;
	}
	if(wIn == "5"){
		wValue= wStats5;
	}
	

	
}

/**
 * 
 * @param eIn
 * uses the local variable eIn to decide which eStat to use in the hashmap
 */
public void seteStat(String eIn){
	if(eIn == "1"){
		eValue= eStats1;
	}
	if(eIn == "2"){
		eValue= eStats2;
	}
	if(eIn == "3"){
		eValue= eStats3;
	}
	if(eIn == "4"){
		eValue= eStats4;
	}
	if(eIn == "5"){
		eValue= eStats5;
	}
	
	
	
}

/**
 * 
 * @param rIn
 * uses the local variable rIn to decide which rStat to use in the hashmap
 */
public void setrStat(String rIn){
	if(rIn == "1"){
		rValue= rStats1;
	}
	if(rIn == "2"){
		rValue= rStats2;
	}
	if(rIn == "3"){
		rValue= rStats3;
	}
	
	

	
}


/**
 * Blank constructor used to instantiate
 */
public lolChar() {
		// TODO Auto-generated constructor stub
	}
/**
 * toString method used to overwrite the original toString into a nicer format
 */
public String toString(){
	return name+" "+abilityQ+ "Base Damage:"+ qValue+ " "+abilityW+ "Base Damage:" + wValue + abilityE+"Base Damage:" + eValue+" "+abilityR+"Base Damage:" +rValue;
	
}

}
