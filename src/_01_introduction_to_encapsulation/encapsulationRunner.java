package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class encapsulationRunner {
	EncapsulateTheData e = new EncapsulateTheData();
	
	@Test
	public void testitemsReceived() {
		e.setitemsReceived(-1);
	assertEquals(e.getitemsReceived(),0);
	}
	@Test
	public void testdegreesTurned() {
		e.setdegreesTurned((float) -1.1);
	assertEquals(e.getdegreesTurned(),0.0,0);
		e.setdegreesTurned((float) 370.0);
	assertEquals(e.getdegreesTurned(),360.0,0);
	}
	@Test
	public void testnomenclature() {
		e.setnomenclature("");
	assertEquals(e.getnomenclature()," ");
	}
	@Test
	public void testmemberObj() {
		e.setmemberObj((String)"Hi");
	assertEquals(e.getmemberObj(),(Object)"Hi");
	}
}
