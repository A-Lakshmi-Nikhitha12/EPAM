package loosecoupling;
 class Volume {

   public static void main(String args[]) {

        Cylinder b = new Cylinder(25, 25, 25);

           System.out.println(b.getVolume());

   }

}

final class Cylinder {

    private int volume;

    Cylinder(int length, int width, int height) {

             this.volume = length * width * height;

    }

    public int getVolume() {

             return volume;

    }

}

package tightcoupling;
class Volume {

   public static void main(String args[]) {

        Cylinder b = new Cylinder(15, 15, 15);

           System.out.println(b.volume);

   }}

 class Cylinder {

   public int volume;

   Cylinder(int length, int width, int height) {

           this.volume = length * width * height;  }
}