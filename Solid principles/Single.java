//Student class
public class Student  
{  
	public void printDetails();  
	{  
		//functionality of the method  
	}  
	pubic void calculatePercentage();  
	{  
		//functionality of the method  
	}  
	public void addStudent();  
	{  
		//functionality of the method  
	}  
}  
//violates single principle
//modifies as
public class Student  
{  
	public void addStudent();  
	{  
		//functionality of the method  
	}  
}  

public class PrintStudentDetails  
{  
	public void printDetails();  
	{  
		//functionality of the method  
	}  
}

public class Percentage  
{  
	public void calculatePercentage();  
	{  
		//functionality of the method  
	}  
}  