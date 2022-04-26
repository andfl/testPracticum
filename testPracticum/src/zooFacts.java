import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class zooFacts {
    public zooFacts(){
    }
   public void  randomZooFacts(){
       

    try {
        URL url = new URL("https://zoo-animal-api.herokuapp.com/animals/rand");
        

        // Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        // Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");
       
        // This line makes the request
        InputStream responseStream = connection.getInputStream();
        
        // Finally we have the response
        System.out.println(new String(responseStream.readAllBytes(),StandardCharsets.UTF_8));
    } catch (Exception e) {
        //TODO: handle exception
    }  
   }    
}
