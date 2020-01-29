/**
 * 
 * @author Aashka Prajapati
 * @author Iman Anooshehpour
 * 
 *         This class extend Employee class
 *
 */
public class Manager extends Employee {

	/**
	 * Default Constructor
	 */
	public Manager() {
		/**
		 * Initializing the the accessLevel and position of the manager
		 */
		this.setAccessLevel(2);
		this.setPosition("MANAGER");

	}

}
