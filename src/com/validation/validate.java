package com.validation;

import java.util.Vector;

import com.userData.userDetails;

public class validate {
	public static int validateCred(Vector<userDetails> users, String userid, String pass){
		System.out.println("Please wait while validating......");
		//System.out.println(userid +" "+pass);
		for (int i=0; i<users.size(); i++){
			//System.out.println( users.get(i).getUserId().trim()+ " at index : " + i +userid);
			if(users.get(i).getUserId().trim().equals(userid.trim())){
				//System.out.println("correct username at index : " + i);
				if(users.get(i).getPwd().trim().equals(pass.trim())){
					//System.out.println("successfully logged in and index num is" + i);
					return i;
				}
				else{
					System.out.println("invalid credintials");
					}
			}

		}
		return 9999; // what to return in that case?
		
	}
} 
