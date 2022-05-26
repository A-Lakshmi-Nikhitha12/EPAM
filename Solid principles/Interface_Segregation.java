//Interface Segregation
public interface Conversion  
{  
	public void intToDouble();  
	public void intToChar();  
	public void charToString();  
}  

public interface ConvertIntToDouble  
{  
	public void intToDouble();  
}   
public interface ConvertIntToChar  
{  
	public void intToChar();  
}  
public interface ConvertCharToString   
{  
	public void charToString();  
}  