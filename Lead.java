import java.util.ArrayList;

/**
 * @author Iman Anooshehpour
 * @author Aashka Prajapati
 * 
 *         This is a Lead class which contains the potential customer's contact
 *         information
 */
public class Lead {
	protected String contactName;
	protected Employee responsibleName;
	static private ArrayList<Lead> leadArray = new ArrayList<>();

	/**
	 * Class Lead constructor
	 * 
	 * @param responsibleName is to make sure each instance of the lead class is
	 *                        belong to a specific Employee
	 */
	protected Lead(Employee responsibleName) {
		this.contactName = randomContactNameGen();
		this.responsibleName = responsibleName;
		/**
		 * Each created lead is being stored in the leadArray array list.
		 */
		leadArray.add(this);
	}

	/**
	 * 
	 * @return a randomly generated full name as a String
	 */
	private String randomContactNameGen() {
		String[] nameArray = { "Jack", "Michael", "Gloria", "Douglas", "Helen", "Victoria", "Diana", "Julie", "Ethen",
				"Jordan" };
		String[] lastNameArray = { "Silva", "Fisher", "Collins", "Greene", "Kelly", "Ortiz", "Morales", "Willis",
				"Cook", "Patal" };
		int randnum1 = (int) (Math.random() * 10);
		int randnum2 = (int) (Math.random() * 10);
		String fullName = nameArray[randnum1] + " " + lastNameArray[randnum2];
		return fullName;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @return the responsibleName
	 */
	public Employee getResponsibleName() {
		return responsibleName;
	}

	/**
	 * @return the leadArray
	 */
	public static ArrayList<Lead> getLeadArray() {
		return leadArray;
	}

}
