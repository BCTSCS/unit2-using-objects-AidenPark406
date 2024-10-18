import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math;

public class Website {


 // Put your code here
 
    private String domain;
    private String topLevelDomain;
    private long numUsers;
    private GeoLocation geoLocation;
    

//Default constructor
public Website() {
    
    domain="google";
    topLevelDomain="com";
    numUsers=4300000000l;
    geoLocation= new GeoLocation(41.2219, 95.8608);


}

// Specify website URL
// Register a new website
public Website(String domainName, String topDomain) {
    domain=domainName;
    topLevelDomain = topDomain;
    numUsers=4300000000l;
    geoLocation= new GeoLocation(40.935, -74.1176);
}

public Website(String domainName, String topDomain, long numPeople, GeoLocation g) {
    domain=domainName;
    topLevelDomain = topDomain;
    numUsers=numPeople;
    geoLocation= g;
}



public GeoLocation getLocation() {
    return geoLocation;
}


    // Method to fetch data 
public void fetchData(String api)
{
    String urlString=toString()+ "/"+api+"/";

    try {
        // Create the URL from the provided string
        
        URL url = new URL(urlString);
        
        // Open a connection to the API
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // Read the response and print each line
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;

        System.out.println("Response from the API:");

        // Print each line of the response directly
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        
        in.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

// String representation for printing
    // Do not modify this method
public String toString()
{
    
    String res =  "http://" + domain + "." + topLevelDomain;
    // res += " has " + numUsers + " users";
    
    return res;
}

    public static void main(String[] args) {


        // NEVER USE access modifiers inside methods
        // here, every variable is local
        // local variable use Type only
        // reference variables Class type

        Website website1 = new Website("ip-api", "com");
        website1.fetchData("json");

        Website google = new Website();
        Website aws = new Website("aws", "com", 1000000l,new GeoLocation(38.9339, 77.1773));
        Website azure = new Website("azure", "com", 1000000000l,new GeoLocation(36.6646, 78.3897));
        Website meta = new Website("facebook", "com", 3200000000l,new GeoLocation(44.2995, 120.8346));
        
        System.out.println(website1.getLocation());
        System.out.println("Distance between Google and me is " + google.getLocation().distanceFrom(website1.getLocation()) + " miles.");
        System.out.println("Distance between Google and AWS is " + google.getLocation().distanceFrom(aws.getLocation()) + " miles.");
        System.out.println("Distance between Google and Azure is " + google.getLocation().distanceFrom(azure.getLocation()) + " miles.");
        System.out.println("Distance between Google and Meta is " + google.getLocation().distanceFrom(meta.getLocation()) + " miles.");
        System.out.println("Distance between Meta and Amazon is " + meta.getLocation().distanceFrom(aws.getLocation()) + " miles.");
        System.out.println("Distance between Meta and Microsoft is " + meta.getLocation().distanceFrom(azure.getLocation()) + " miles.");



    }
}
