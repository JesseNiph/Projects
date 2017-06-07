package designer;

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
public String toString(){
	return name+" "+abilityQ+" "+abilityW+" "+abilityE+" "+abilityR;
	
}

}
