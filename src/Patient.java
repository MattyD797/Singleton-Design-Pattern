/**
 * This is an individualized record for a patient. 
 * @author Matt Duggan
 */
import java.util.ArrayList;

public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<String>();
	
	/**
	 * This is what designates a new patient on a hospital list. 
	 * @param id The place the patient is on a list. 
	 * @param firstName The first name of the patient. 
	 * @param lastName The last name of the patient. 
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Adds a new allergy to the patient. 
	 * @param allergy The new allergy being added. 
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * The output that nicely displays the patients information. 
	 * @return The string with the reformatted patient information. 
	 */
	public String toString() {
		String allergyList = "";
		int newId = id + 1;
		if(allergies.size() != 0) {
			allergyList = "\n Allergies:\n";
			for (int i = 0; i < allergies.size(); i++) {
				allergyList += " " + allergies.get(i);
				if(i != allergies.size() - 1) {
					allergyList += ",";
				}
				else {
					allergyList += "\n\n";
				}
			}
		}
		
		return "Patient " + newId + ": " + firstName + " " + lastName + allergyList;
	}
}
