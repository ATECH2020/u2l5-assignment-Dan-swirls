import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

       // variable inits
       System.out.println("Enter the latitude of the starting location: "); 
       double startLat = input.nextDouble();
       System.out.println("Enter the longitude of the starting location: "); 
       double startLong = input.nextDouble();
       System.out.println("Enter the latitude of the ending location: "); 
       double endLat = input.nextDouble();
       System.out.println("Enter the longitude of the ending location: "); 
       double endLong = input.nextDouble();

      // sets the two GeoLocation objects up (point one and point two)
      GeoLocation one = new GeoLocation(startLat , startLong);
      GeoLocation two = new GeoLocation(endLat , endLong);
      
      // outputs the distance between the two points
      System.out.println(one.distanceFrom(two));
    }
}