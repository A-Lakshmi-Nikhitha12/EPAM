//Code that violates LSP
public class BookDelivery {

     String titles;
     Integer userID;

     void getDeliveryLocations() {
           ...
     }
}
public class PosterMapDelivery extends BookDelivery {

     @Override
     void getDeliveryLocations() {
              ...
     }
}
//Now, we extend the existing BookDelivery class with an AudioBookDelivery subclass. 
//But, when we want to override the getDeliveryLocations() method, we realize that audiobooks can’t be delivered to physical locations.

public class AudioBookDelivery extends BookDelivery {

     @Override
     void getDeliveryLocations() {

           /* can't be implemented since

            * Audio book doesn't have

            * a physical location. */

     }

}
//Code that follows LSP
public class BookDelivery {
     String title;
     Integer userID;
}
public class OfflineDelivery extends BookDelivery {
     void getDeliveryLocations() {
          ...
     }
}
public class OnlineDelivery extends BookDelivery {
     void getSoftwareOptions() {
          ...
     }
}
public class PosterMapDelivery extends OfflineDelivery {
	void getDeliveryLocations() {
          ...
     }
}
public class AudioBookDelivery extends OnlineDelivery {     
     void getSoftwareOptions() {
          ...
     }
}