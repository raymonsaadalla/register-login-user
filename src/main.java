import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import com.userData.userDetails;
import com.userData.userLogic;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int indexofuser = 0;
		boolean temp;
		String exit;
		Vector<userDetails> users = new Vector<userDetails>();
		do {
			System.out.println("input 1 to register as new user, 2 to login ");
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				indexofuser = userLogic.registerUser(users);
			} else if (choice == 2) {
				for (int i=0; i<3; i++){
					boolean status= userLogic.login(users);
					if (i==2){
						System.out.println("!!! you entered  password incorrectly too many times !!! GOODBYE");
						System.exit(0);
					}
					if (status){
						break;
					}
				}
			} else {
				System.out.println("Invalid input");
				System.exit(0);
			}
			while (userLogic.afterLogin(users, indexofuser)) {
				userLogic.afterLogin(users, indexofuser);
			}
			System.out.println("successfully logged out");
			System.out.println("********************************* \n");

		} while (true);

	}
}
