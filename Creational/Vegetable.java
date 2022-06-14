//prototype pattern using copy constructor
public class Vegetable  
{  
	private double vprice;  
	private String vname;  
	Vegetable(double vPrice, String vName)  
	{   
		vprice = vPrice;  
		vname = vName;  
	}  
//creating a copy constructor  
	Vegetable(Vegetable vegetable)  
	{  
		System.out.println("\nAfter invoking the Copy Constructor:\n");  
		vprice = vegetable.vprice;  
		vname = vegetable.vname;  
	}  
//creating a method that returns the price of the fruit  
	double showPrice()  
	{  
		return vprice;  
	}  
//creating a method that returns the name of the fruit  
	String showName()  
	{  
		return vname;  
	}  
//class to create student object and print roll number and name of the student  
	public static void main(String args[])  
	{  
		Vegetable v1 = new Vegetable(399, "Carrot");  
		System.out.println("Name of the first vegetable: "+ v1.showName());  
		System.out.println("Price of the first vegetable: "+ v1.showPrice());  
		//passing the parameters to the copy constructor  
		Vegetable v2 = new Vegetable(v1);  
		System.out.println("Name of the second vegetable: "+ v2.showName());  
		System.out.println("Price of the second vegetable: "+ v2.showPrice());  
		System.out.println("Hashcode of x is "+ v1.hashCode());
		System.out.println("Hashcode of y is "+ v2.hashCode());
		if (v1 == v2) {
		System.out.println("Same");
		}
		else {
		System.out.println("Different");
		}
	}  
}  