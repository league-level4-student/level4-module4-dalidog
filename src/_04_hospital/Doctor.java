package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList <Patient>patients=new ArrayList<Patient>();

	public Object performsSurgery() {
		// TODO Auto-generated method stub
	return false;
		
	}
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(patients.size()==3) {
			throw new DoctorFullException();
		}
		patients.add(patient);
		
	}
	public ArrayList getPatients() {
		return patients;
		
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for (int j = 0; j < patients.size(); j++) {
			patients.get(j).checkPulse();
		}
		
	}


}
