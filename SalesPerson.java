import java.util.ArrayList;

/**
 * @author Aashka Prajapati This class extend Employee class
 *
 */
public class SalesPerson extends Employee {

	/**
	 * Private variable declarations
	 */
	private static int numberOfSPs = 0;
	/**
	 * @author Iman Anooshehpour changed the leadArray type from String to ArrayList
	 *         of Leads.
	 */
	private ArrayList<Lead> leadArray = new ArrayList<>();

	/**
	 * Default Constructor is created
	 */
	public SalesPerson() {
		// Gives each new sales person a new number starting from 1
		this.employeeNumber = ++numberOfSPs;
		this.accessLevel = 1;
		this.position = "SALESPERSON";
	}

	/**
	 * Method to display leads of a SalesPerson only in case of same employeeNumber of higher accessLevel (Manager access)
	 * 
	 * @param accessLevel
	 * @param employeeNumber
	 */
	public void displayLeads(int accessLevel, int employeeNumber) {
		/**
		 * @author Iman Anooshehpour
		 */ 
		if (employeeNumber == this.employeeNumber) {
			System.out.println("employeeNumber "+employeeNumber+", you are in\n"+leadArray);
		} else if (accessLevel == 2) {
			System.out.println("you have accessLevel of "+accessLevel+", you are in\n"+leadArray);
		} else {
			System.out.println("ACCESS DENIED.");
		}

	}
	
	/**
	 * @author Iman Anooshehpour
	 * @param lead which is a Lead instance we pass to the method
	 * @param empolyeeNumber is here to make sure we are assigning the Lead to correct SalesPerson
	 */ 
	public void addLead(Lead lead, int employeeNumber) {
		if (employeeNumber == this.employeeNumber) {
			this.leadArray.add(lead);
		} else {
			System.out.println("UNABLE to ADD THIS LEAD to THIS SALESPERSON");
		}
	}

}
