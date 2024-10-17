import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math;

public class Website {


 // Put your code here
 
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    

//Default constructor
public Website() {
    domain="codehs";
    topLevelDomain = "com";
    numUsers=0;
}

// Specify website URL
// Register a new website
public Website(String domainName, String topDomain) {
    domain = domainName;
    topLevelDomain = topDomain;
}


// Specify website URL
// Register an old website


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

    // Main method to test the API call
    public static void main(String[] args) {


        // NEVER USE access modifiers inside methods
        // here, every variable is local
        // local variable use Type only
        // reference variables Class type

        
        Website website = new Website("ip-api", "com"); // Create an instance of Website
        website.fetchData("json"); // Call the instance method
        
        Website website2 = new Website("google", "com");
        System.out.println(website2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location:");
        double lat_init = scanner.nextFloat();
        System.out.println("Enter the longitude of the starting location:");
        double long_init = scanner.nextFloat();

        System.out.println("Enter the latitude of the final location:");
        double lat_final = scanner.nextFloat();
        System.out.println("Enter the longitude of the final location:");
        double long_final = scanner.nextFloat();

        scanner.close();

        double distance = Math.pow((Math.pow(lat_final - lat_init, 2) + Math.pow(long_final - long_init, 2)),0.5);

        System.out.println("The distance is " + distance + " miles.");

    }
}
