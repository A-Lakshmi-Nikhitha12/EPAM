//AbstractFactoryPatternDemo.java
public interface Shape {
   void draw();
}
public class RoundedRectangle implements Shape {
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
   }
}
public class RoundedSquare implements Shape {
   public void draw() {
      System.out.println("Inside RoundedSquare::draw() method.");
   }
}
public class Rectangle implements Shape {
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
public class Square implements Shape {
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
public abstract class AbstractFactory {
   abstract Shape getShape(String shapeType) ;
}
public class ShapeFactory extends AbstractFactory {
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }	 
      return null;
   }
}
public class RoundedShapeFactory extends AbstractFactory {
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }	 
      return null;
   }
}
public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
}
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      shape1.draw();
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      shape3.draw();
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      shape4.draw();
      
   }
}