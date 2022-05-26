//open for extension closed for modification
public abstract class Shape
{
    public abstract double Area();
}
public class Rectangle extends Shape
{
    public double Width ;
    public double Height ;
	Rectangle(double w,double h)
	{
		Width = w;
		Height = h;
	}
    public double Area()
    {
        return Width*Height;
    }
}

public class Circle extends Shape
{
    public double Radius ;
	Circle(double r)
	{
		Radius = r;
	}
    public double Area()
    {
        return Radius*Radius*Math.PI;
    }
}