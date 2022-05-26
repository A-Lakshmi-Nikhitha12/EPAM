//flyweight (intrinsic , extrinsic properties )
interface University
{
	public final String uname = "university_name";
}
class Student implements University
{
	private int id;
	Student(int id)
	{
		this.id = id;
	}
	void display()
	{
		System.out.println(uname + " " + id);
	}
		
}
class Flyweight
{
	public static void main(String args[])
	{
		Student s1= new Student(1);
		Student s1= new Student(1);
		s1.display();
		s2.display();
	}
}