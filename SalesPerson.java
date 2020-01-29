/**
 * @author Aashka Prajapati
 * @author Iman Anooshehpour
 * 
 *         This class extend Employee class
 *
 */
public class SalesPerson extends Employee {

	/**
	 * Default Constructor is created
	 */
	public SalesPerson() {
		/**
		 * Initializing the the accessLevel and position of the sales persons
		 */
		this.setAccessLevel(1);
		this.setPosition("SALESPERSON");
	}

}
