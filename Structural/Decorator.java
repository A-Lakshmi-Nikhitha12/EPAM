//decorator pattern
//Create a Food interface.
public interface Food {  
    public String prepareFood();  
    public double foodPrice();  
}
//VegFood class that will implements the Food interface and override its all methods.
public class VegFood implements Food {  
    public String prepareFood(){  
         return "Veg Food";  
    }  
  
        public double foodPrice(){  
        return 50.0;  
    }  
}  
// FoodDecorator abstract class that will implements the Food interface and override 
//it's all methods and it has the ability to decorate some more foods.
public abstract class FoodDecorator implements Food{  
    private Food newFood;  
    public FoodDecorator(Food newFood)  {  
        this.newFood=newFood;  
    }  
    @Override  
    public String prepareFood(){  
        return newFood.prepareFood();   
    }  
    public double foodPrice(){  
        return newFood.foodPrice();  
    }  
}
//NonVegFood concrete class that will extend the FoodDecorator class and override it's all methods
public class NonVegFood extends FoodDecorator{    
    public NonVegFood(Food newFood) {  
        super(newFood);  
    }  
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+150.0;  
    }  
}
//ChineeseFood concrete class that will extend the FoodDecorator class and override it's all methods.
public class ChineeseFood extends FoodDecorator{  
  public ChineeseFood(Food newFood)    {  
        super(newFood);  
  }  
    public String prepareFood(){  
        return super.prepareFood() +" With Fried Rice and Manchurian  ";   
    }  
    public double foodPrice()   {  
        return super.foodPrice()+65.0;  
        }  
}  
//Decorator class that will use Food interface to use which type of food customer wants means (Decorates).
public class Decorator {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
        System.out.print("========= Food Menu ============ \n");  
        System.out.print("            1. Vegetarian Food.   \n");  
        System.out.print("            2. Non-Vegetarian Food.\n");  
        System.out.print("            3. Chineese Food.         \n");  
        System.out.print("            4. Exit                        \n");  
        System.out.print("Enter your choice: ");  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
			VegFood vf=new VegFood();  
			System.out.println(vf.prepareFood());  
			System.out.println( vf.foodPrice());  
            }  
            break;  
              
		case 2:{  
			Food f1=new NonVegFood((Food) new VegFood());  
			System.out.println(f1.prepareFood());  
			System.out.println( f1.foodPrice());  
			}  
            break;    
		case 3:{  
            Food f2=new ChineeseFood((Food) new VegFood());  
			System.out.println(f2.prepareFood());  
			System.out.println( f2.foodPrice());  
            }  
            break;    
              
        default:{    
            System.out.println("Other than these no food available");  
			}         
     }//end of switch  
          
	}while(choice!=4);  
    }  
}  