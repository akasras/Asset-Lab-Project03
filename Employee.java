import java.util.ArrayList;

/**
 * 
 * @author Aashka Prajapati
 * @author Iman Anooshehpour
 * 
 *         This is parent class for Manager and SalesPerson
 *
 */
public abstract class Employee {

	/**
	 * Private variable declarations
	 */
	private String position;
	private int accessLevel;
	private int employeeNumber;
	private String userName;
	static private ArrayList<Employee> employeeArray = new ArrayList<>();

	/**
	 * Default Constructor
	 */
	public Employee() {
		this.setEmployeeNumber((int) (Math.random() * 100000));
		this.setUserName(randomUserNameGen());
		employeeArray.add(this);
	}

	public static String randomUserNameGen() {
		String randomUserName = "";
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.random() * 27) + 64;
			char singleChar = (char) randomNumber;
			randomUserName = randomUserName + singleChar;
		}
		return randomUserName;
	}

	/**
	 * To fetch the Position of an Employee
	 * 
	 * @return
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * To set the position of an Employee
	 * 
	 * @param position 
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * To fetch the AccessLevel of an Employee
	 * 
	 * @return	accessLevel
	 */
	public int getAccessLevel() {
		return accessLevel;
	}

	/**
	 * To set the AccessLevel of an Employee
	 * 
	 * @param accessLevel
	 */
	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	/**
	 * To fetch the EmployeeNumber of a Manager
	 * 
	 * @return Number has assigned to this employee when constructing
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * To set the EmployeeNumber of a Manager
	 * 
	 * @param employeeNumber
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the employeeArray
	 */
	public static ArrayList<Employee> getEmployeeArray() {
		return employeeArray;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	protected boolean authentication(String username) {
		for (int i = 0; i < Employee.getEmployeeArray().size(); i++) {
			if (username == Employee.getEmployeeArray().get(i).getUserName()) {
				return true;
			}
		}
		return false;
	}
}
