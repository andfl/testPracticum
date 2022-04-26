import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class dogFacts {
    public dogFacts(){
    }
    public void oneDogFact(){
    try {
        URL url1 = new URL("https://dog-facts-api.herokuapp.com/api/v1/resources/dogs?number=1");

        // Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection1 = (HttpURLConnection) url1.openConnection();

        // Now it's "open", we can set the request method, headers etc.
        connection1.setRequestProperty("accept", "application/json");

        // This line makes the request
        InputStream responseStream1 = connection1.getInputStream();

        // Finally we have the response   
        System.out.println(new String(responseStream1.readAllBytes(),StandardCharsets.UTF_8));   
    } catch (Exception e) {
        //TODO: handle exception
    }

    }
}
