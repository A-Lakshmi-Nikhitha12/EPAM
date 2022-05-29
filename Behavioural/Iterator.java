//Iterator Pattern (iterating through collection of names)
public interface IteratorInterface {  
    public boolean hasNext();  
    public Object next();  
}  
public interface Container {  
    public Iterator getIterator();  
}
public class CollectionofNames implements Container
{  
public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};   

    public IteratorInterface getIterator() {  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements IteratorInterface{  
        int i;  
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }  
        @Override  
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }    
	} 	 
}
public class Iterator {  
    public static void main(String[] args) {  
          CollectionofNames cmpnyRepository = new CollectionofNames();  
            
          for(IteratorInterface iter = cmpnyRepository.getIterator(); iter.hasNext();){  
              String name = (String)iter.next();  
              System.out.println("Name : " + name);  
           }      
    }  
}    