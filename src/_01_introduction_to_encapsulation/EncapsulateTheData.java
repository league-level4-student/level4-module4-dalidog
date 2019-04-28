package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	public void setitemsReceived(int itemsReceived) {
		this.itemsReceived=itemsReceived;
		if(itemsReceived<0) {
			this.itemsReceived=0;
		}
	}
	public int getitemsReceived(){
		return this.itemsReceived;
		
	}
	public void setdegreesTurned(float degreesTurned) {
		this.degreesTurned=degreesTurned;
		if(degreesTurned<0.0) {
			this.degreesTurned=(float) 0.0;
		}
		if(degreesTurned>360.0) {
			this.degreesTurned=(float) 360.0;
		}
	}
	public float getdegreesTurned(){
		return this.degreesTurned;
		
	}
	public void setnomenclature(String nomenclature) {
		this.nomenclature=nomenclature;
		if(nomenclature=="") {
			this.nomenclature=" ";
		}
	}
	public String getnomenclature(){
		return this.nomenclature;
		
	}
	public void setmemberObj(Object memberObj) {
		this.memberObj=memberObj;
		if(memberObj instanceof String) {
			this.memberObj=(Object) memberObj;
		}
	}
	public Object getmemberObj(){
		return this.memberObj;
		
	}
	public void testitemsReceived(int itemsReceived) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
