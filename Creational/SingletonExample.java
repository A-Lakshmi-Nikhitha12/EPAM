// Java program implementing Singleton class using createInstance()


class Singleton {
	private static Singleton single_instance = null;
	public String s;
	private Singleton() // only one instance is created if we try to create other then it generates run time error 
	{
		s = "Hello I am a string part of Singleton class";
	}
	public static Singleton createInstance()
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}

class SingletonExample {
	public static void main(String args[])
	{
		Singleton x = Singleton.createInstance();
		Singleton y = Singleton.createInstance();
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		if (x == y) {
		System.out.println("Same");
		}
		else {
		System.out.println("Different");
		}
	}
}
