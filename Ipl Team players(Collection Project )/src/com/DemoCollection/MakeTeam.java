package com.DemoCollection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MakeTeam {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList ap = new ArrayList();

	public Player makePlayer(int playerId, String name, String role, String Price) {
		return new Player(playerId, name, role, Price);
	}
	
	public void playerAdd() throws Exception {
		
		boolean flag = true;

		while (flag) {
			System.out.println("Player Id: ");
			int id =sc.nextInt();
			
			System.out.println("Player Name: ");
			String name = sc.next();
			
			System.out.println("Player Role: ");
			String role = sc.next();
			
			System.out.println("Player Salary: ");
			String salary = sc.next();

			Player sp = makePlayer(id, name, role, salary);
			MakeTeam ms =new MakeTeam();
			ms.insertData("insert into player values(id,'name','role','salary')");
			ap.add(sp);

			System.out.println(ap);
			
			System.out.println("If you want to add player again Then select y otherwise select n: ");
			String msg = sc.next();

			if (msg.equals("y")) {
				flag = true;
			} 
			else {
				flag = false;
				System.out.println("Data inserted Sucessfully");
			}

		}
		
	}
	public void insertData(String sp) throws Exception {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/democollection", "root", "Prajwal@123");
		
			Statement st = con.createStatement();
			
			st.executeUpdate(sp);
	}
	

	public static void main(String[] args) throws Exception {
		
		

		MakeTeam mk = new MakeTeam();
		mk.playerAdd();
		
		
	}

}
