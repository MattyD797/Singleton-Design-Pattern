/**
 * This is a static list of patients who are registered within a hospital. 
 * @author Matt Duggan
 */
import java.util.ArrayList;

public class HospitalSystem {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private static HospitalSystem hospitalSystem;
	
	private HospitalSystem() {}
	
	/**
	 * Creates a list for a hospital or gives the hospital list already made. 
	 * @return The hospital list. 
	 */
	public static HospitalSystem getInstance() {
		if (hospitalSystem == null) {
			hospitalSystem = new HospitalSystem();
		}
		return hospitalSystem;
	}
	
	/**
	 * This adds a new patient to the hospital list. 
	 * @param firstName The first name of the patient. 
	 * @param lastName The last name of the patient. 
	 * @return The place the patient is in the list -1.  
	 */
	public int addPatient(String firstName, String lastName) {
		Patient newPatient = new Patient(patients.size(), firstName, lastName);
		patients.add(newPatient);
		return patients.indexOf(newPatient);
	}
	
	/**
	 * This grabs the id of a patient. 
	 * @param id The number the patient is assigned upon being added in a list. 
	 * @return The id of the patient. 
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * This adds an allergy to the patient's record designated by the patient's Id. 
	 * @param id The designated patient id in the hospital's list.
	 * @param allergy The new allergy being added to the record. 
	 */
	public void addAllergy(int id, String allergy) {
		patients.get(id).addAllergy(allergy);
	}
	
	/**
	 * This grabs and displays all the data from a patient. 
	 * @return The patient's information including name, id, and allergies. 
	 */
	public String getAllPatientsData() {
		String tempPatientList = "";
		for(int i = 0; i < patients.size(); i++) {
			tempPatientList += patients.get(i).toString();
		}
		return tempPatientList;
	}
}
