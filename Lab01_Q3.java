
public class Lab01_Q3 {

    public static void main(String[] args) {
 // declaring all variables 
 final double totalEarthArea = 51007200; // the total are of the world 
 final double totalEarthDryLandAreaPerc = 0.292; // The ration of earth dry land 
 double turkeyTotalLandRatio = 6510.42; // how much turkey times the world land 
 int turkeyWaterAreaRatio = 76; // How much times the turkey water area is to the it's land 
 double totalEarthDryLandArea = totalEarthArea * totalEarthDryLandAreaPerc ;
 // earth dry land in integers
 int totalEarthDryLandAreaInt = (int) totalEarthDryLandArea;

 double totalEarthWaterArea = totalEarthArea - totalEarthDryLandArea;
 
 // total earth area in integers 
 int totalEarthWaterAreaInt = (int) totalEarthWaterArea;

 final double turkeyTotalLand = totalEarthArea / turkeyTotalLandRatio;
 final double turkeyWaterArea = turkeyTotalLand / (turkeyWaterAreaRatio + 1);
  // turkey water area in int 
  int turkeyWaterAreaInt= (int) turkeyWaterArea;

 final double turkeyDryLand = turkeyTotalLand - turkeyWaterArea;
 // turkey dry land in int 
 int turkeyDryLandArea= (int) turkeyDryLand;

 final double turkeyInTheWorldDryLandPerc = turkeyDryLand / totalEarthDryLandAreaInt * 100;
 final double waterOutsideTurkeyPerc = (totalEarthWaterAreaInt - turkeyWaterArea) / totalEarthWaterAreaInt * 100;


 System.out.println("Turkey has " + turkeyDryLandArea + " km2 dry land and " + turkeyWaterAreaInt + " km2 water.");
 System.out.println("Earth has " + totalEarthDryLandAreaInt + " km2 dry land and " + totalEarthWaterAreaInt + " km2 water.");
 System.out.println("Turkey has " + turkeyInTheWorldDryLandPerc + " percent of the Earth's dry land.");
 System.out.println("Percentage of Earth water outside Turkey is " + waterOutsideTurkeyPerc + " percent");


    }
}
