package com.userData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import com.validation.validate;

public class userLogic {
	static Scanner sc = new Scanner(System.in);

	public static int registerUser(Vector<userDetails> users) {
		userDetails userInfo = new userDetails();
		System.out.println("Enter the following details \n");
		System.out.println("First Name: ");
		userInfo.setFirstName(sc.nextLine());
		System.out.println("Last Name: ");
		userInfo.setLastName(sc.nextLine());
		System.out.println("Age: ");
		userInfo.setAge(sc.nextLine());
		System.out.println("Gender: ");
		userInfo.setGender(sc.nextLine());
		System.out.println("userID: ");
		userInfo.setUserId(sc.nextLine());
		System.out.println("pwd: ");
		userInfo.setPwd(sc.nextLine());

		users.add(userInfo);
		System.out
				.println("**************you have successfully registerd****************");
		// System.out.print("index of user is");
		System.out.println(users.size() - 1);
		return users.size() - 1;
	}

	public static boolean login(Vector<userDetails> users) {
		System.out.println("userID: ");
		String userid = sc.nextLine();
		System.out.println("pwd: ");
		String pass = sc.nextLine();
		int index = validate.validateCred(users, userid, pass);
		boolean successLogin;
		if (index != 9999) {
			System.out.println("*********successfully logged in as "
					+ users.get(index).getUserId());
			successLogin = true;
		} else {
			System.out.println("*********Failed to login- Try Again**********");
			successLogin = false;
		}
		return successLogin;
	}

	public static void viewDetails(Vector<userDetails> users, int indexOfUser) {

		System.out.println("Displaying user details : ");
		System.out.println("First Name : "
				+ users.get(indexOfUser).getFirstName());
		System.out.println("Last Name : "
				+ users.get(indexOfUser).getLastName());
		System.out.println("Age : " + users.get(indexOfUser).getAge());
		System.out.println("Gender : " + users.get(indexOfUser).getGender());
		System.out.println("userID : " + users.get(indexOfUser).getUserId());
		System.out.println("*****************************************");

	}

	public static void updatePwd(Vector<userDetails> users, int indexOfUser) {

		System.out.println("Enter your old password : ");
		String oldPwd = sc.nextLine();
		if (oldPwd.equals(users.get(indexOfUser).getPwd())) {
			System.out.println("Enter your new password : ");
			String newPwd = sc.nextLine();
			users.get(indexOfUser).setPwd(newPwd);
			System.out.println("Your password has been updated");
			System.out.println("*****************************************");
		} else {
			System.out.println("!!! INCORRECT PASSWORD !!!");
		}

	}

	public static void updateDetails(Vector<userDetails> users, int indexOfUser) {

		System.out.println("Select which information you want to update: ");
		System.out.println("\t 1- First Name \n" + "\t 2- Last Name \n"
				+ "\t 3- Age \n" + "\t 4- Gender");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			users.get(indexOfUser).setFirstName(sc.nextLine());
			break;
		case 2:
			users.get(indexOfUser).setLastName(sc.nextLine());
			break;
		case 3:
			users.get(indexOfUser).setAge(sc.nextLine());
			break;
		case 4:
			users.get(indexOfUser).setGender(sc.nextLine());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("*****************************************");
	}

	public static boolean afterLogin(Vector<userDetails> users, int indexOfUser) {
		System.out.println("select what you want to do: \n"
				+ "\t 1 to Update Pwd \n" + "\t 2 to view details \n"
				+ "\t 3 to update details \n" + "\t 4 to logout");
		int choice = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		switch (choice) {
		case 1:
			userLogic.updatePwd(users, indexOfUser);
			flag = true;
			break;
		case 2:
			userLogic.viewDetails(users, indexOfUser);
			flag = true;
			break;
		case 3:
			userLogic.updateDetails(users, indexOfUser);
			flag = true;
			break;
		case 4:
			// System.exit(0);
			flag = false;
			break;
		default:
			flag = false;
			break;
		}
		return flag;
	}
}
