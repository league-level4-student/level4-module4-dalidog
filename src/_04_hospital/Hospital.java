package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList <Doctor>arraydoc = new ArrayList<Doctor>();
	ArrayList <Patient>arraypat = new ArrayList <Patient>();
	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		arraydoc.add(d);
		
	}
	public void addPatient (Patient p) {
		arraypat.add(p);
	}
	public ArrayList getPatients() {
		return arraypat;
	}
	public ArrayList getDoctors() {
		// TODO Auto-generated method stub
		return arraydoc;
		
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		int x = 0;
		for (int i = 0; i < arraypat.size(); i++) {
			arraydoc.get(x).assignPatient(arraypat.get(i));
		if(arraydoc.get(x).getPatients().size()==3) {
			x=x+1;
		}
		}
	}

	

}
