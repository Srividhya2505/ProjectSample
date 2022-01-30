package org.emp1;
import org.company1.*;
import org.client.*;
import org.project.*;

public class Employee {
	
	private void emp1Name() {
		// TODO Auto-generated method stub
    System.out.println("Employee name is Sri");
	}
	public static void main(String[] args) {
	 
	Employee E = new Employee();
	E.emp1Name();
	
	Company C = new Company();
	C.company1Name();
	
	Client t =new Client();
	t.ClientName();
	
	Project p1 =new Project();
	p1.ProjectName();
	}

}
