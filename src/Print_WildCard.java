import java.util.List;
public class Print_WildCard {
    //This is example of WildCard Interface
    //take a list of vehicle and see bus is extending vehicle and Car class is aslo extending Vehicle
    //public void setprintValues(List<Vehicle> vehicleList){
        //check in main


    //To overcome that problem in Main to access busList making it UpperBound do changes here
    //so we will able to access busList and vehicleList is allowed both allowed parent and its child class
   // public  void setPrintValues(List<? extends Vehicle> vehicleList){
        //now observe in Main pass busList and see



     //Lowerbound here use super keyword and it will be accesssing its parent class
    //means vehicle and above it
    public void setPrintValues(List<? super Vehicle> vehicleList){


    }
}

//main concept of WildCards-
/*Upper bounded wildcard: <? extends UpperBoundClassName> i.e. class Name and below
Lower Bounded wildcard:<? Super LowerBoundedClassName>i.e. class Name and above
Unbounded wildcard<?> only you can read
*/



