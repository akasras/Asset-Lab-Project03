import java.util.Scanner;

/**
 * 
 * @author Iman Anooshehpour Here is our main application, the glue to all the
 *         defined classes.
 *
 */
public class MainApp {
	/**
	 * Will display the identity menu when get called.
	 */
	public static void displayIdentityMenu() {
		System.out.println("Who are you defining yourself as system user?\n1.Sales person\t2.Manager\t3.EXIT");
	}

	/**
	 * Will display the sales person menu when get called.
	 */
	public static void displaySalesPersonMenu() {
		System.out.println("Please Choose:\n1.Display Leads\t2.Add Leads");
	}

	public static void main(String[] args) {
		/**
		 * Pre-processing part of the app creating 1 manager and 2 salesperson assigning
		 * 2 lead to each sales person
		 */
		Manager manager = new Manager();
		SalesPerson SP1 = new SalesPerson();
		SalesPerson SP2 = new SalesPerson();
		new Lead(SP1);
		new Lead(SP1);
		new Lead(SP2);
		new Lead(SP2);
		Scanner userInput = new Scanner(System.in);
		System.out.println("--------------- Pre-existing data ---------------");
		System.out.println("Sole Manager\t\t|Employee Number: " + manager.getEmployeeNumber() + "\t|Username: "
				+ manager.getUserName());
		System.out.println("Sales person NO.1\t|Employee Number: " + SP1.getEmployeeNumber() + "\t|Username: "
				+ SP1.getUserName());
		System.out.println("Sales person NO.2\t|Employee Number: " + SP2.getEmployeeNumber() + "\t|Username: "
				+ SP2.getUserName());
		System.out.println("\n--------------- Program Starts Here ---------------");
		int user = 0;

		int employeenumber;
		int state = -1;
		/**
		 * unless user chooses 3 (EXIT) program will be alive. 1 is to go to sales
		 * person access and 2 is to go to manager access. P.S. Authentication will
		 * happen in the next stage.
		 */
		while (user != 3) {
			displayIdentityMenu();
			user = userInput.nextInt();
			switch (user) {
			case 1:
				System.out.println("Please enter your Employee Number:");
				employeenumber = userInput.nextInt();

				for (int i = 0; i < Employee.getEmployeeArray().size(); i++) {
					/**
					 * Authentication happens here by the factor of employeenumber.
					 */
					if (Employee.getEmployeeArray().get(i).getEmployeeNumber() == employeenumber) {
						System.out.println("Hello, Username:" + Employee.getEmployeeArray().get(i).getUserName());
						/**
						 * Here we enter to a sales person's access
						 */
						displaySalesPersonMenu();
						int option = userInput.nextInt();
						switch (option) {
						/**
						 * Displaying the sales person's own leads.
						 */
						case 1:
							for (int j = 0; j < Lead.getLeadArray().size(); j++) {
								if (Lead.getLeadArray().get(j).getResponsibleName() == Employee.getEmployeeArray()
										.get(i)) {
									state = j;
									System.out.println(Lead.getLeadArray().get(j).contactName);
								}
							}
							break;
						/**
						 * generating new lead for the logged in sales person
						 */
						case 2:
							/**
							 * In state variable we keep the position of the instance if display function
							 * has been called earlier.
							 */
							if (state == -1) {
								System.out.println("Please enter your Employee Number:");
								employeenumber = userInput.nextInt();
								for (int k = 0; k < Employee.getEmployeeArray().size(); k++) {
									if (Employee.getEmployeeArray().get(k).getEmployeeNumber() == employeenumber) {
										new Lead(Employee.getEmployeeArray().get(k));
									}
								}
							} else {
								new Lead(Employee.getEmployeeArray().get(state));
							}
							break;
						}
					}
				}
				break;
			case 2:
				/**
				 * Here we enter to the manager access
				 */
				System.out.println("Please enter your Employee Number:");
				employeenumber = userInput.nextInt();
				for (int i = 0; i < Employee.getEmployeeArray().size(); i++) {
					if (Employee.getEmployeeArray().get(i).getEmployeeNumber() == employeenumber) {
						System.out.println("Hello, Username:" + Employee.getEmployeeArray().get(i).getUserName());
						System.out.println("Please choose:\n1.Display Leads\t2.Exit");
						int option = userInput.nextInt();
						switch (option) {
						case 1:
							for (int j = 0; j < Lead.getLeadArray().size(); j++) {
								System.out.println("Lead Contact:" + Lead.getLeadArray().get(j).contactName
										+ "\t|Responsible Username:"
										+ Lead.getLeadArray().get(j).getResponsibleName().getUserName()
										+ "\t|Responsible Employee Number:"
										+ Lead.getLeadArray().get(j).getResponsibleName().getEmployeeNumber());

							}
							break;
						case 2:
							user = 3;
							break;
						}
					}
				}
				break;
			case 3:
				user = 3;
				break;
			}
		}
		userInput.close();
	}
}
