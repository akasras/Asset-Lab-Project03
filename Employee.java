/**
 * 
 * @author Aashka Prajapati
 * This is parent class for Manager and SalesPerson
 *
 */
public abstract class Employee {
	
		/**  
		 * Protected variable declarations
		 */
		protected String position;
		protected int accessLevel;
		protected int employeeNumber;
		
		/**
		 * Default Constructor
		 */
		public Employee() {
			
		}
		
		/**
		 * To fetch the Position of an Employee
		 * @return
		 */
		public String getPosition() {
			return position;
		}
		
		/**
		 * To set the position of an Employee
		 * @param position
		 */
		public void setPosition(String position) {
			this.position = position;
		}
		
		/**
		 * To fetch the AccessLevel of an Employee
		 * @return
		 */
		public int getAccessLevel() {
			return accessLevel;
		}

		/**
		 * To set the AccessLevel of an Employee
		 * @param accessLevel
		 */
		public void setAccessLevel(int accessLevel) {
			this.accessLevel = accessLevel;
		}
		
		/**
		 * To fetch the EmployeeNumber of a Manager
		 * @return
		 */
		public int getEmployeeNumber() {
			return employeeNumber;
		}
		
		/**
		 * To set the EmployeeNumber of a Manager
		 * @param employeeNumber
		 */
		public void setEmployeeNumber(int employeeNumber) {
			this.employeeNumber = employeeNumber;
		}
}
