package co.edu.escuelaing.arep.sparkprimer;

import co.edu.escuelaing.arep.sparkprimer.cache.Cache;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class HttpConnection {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.alphavantage.co/query?function=%s&symbol=%s&apikey=M5YQXIJS8FS5S4F2";
    //private static final String GET_URL_TEST = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=IBM&apikey=M5YQXIJS8FS5S4F2";

    public static String alphaTimeSeriesDaily(Request request) throws IOException {

        Cache cache = Cache.getInstance();
        String responseStr = "None";

        if (cache.cacheContainer.containsKey(request.queryParams("symbol")) ){
            responseStr = cache.cacheContainer.get(request.queryParams("symbol"));
        }else {
        
            String finalURL = String.format(GET_URL, request.queryParams("time"), request.queryParams("symbol"));
            System.out.println(finalURL);
            
            URL obj = new URL(finalURL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            
            //The following invocation perform the connection implicitly before getting the code
            int responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);
            StringBuffer response = new StringBuffer();
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                //System.out.println(response.toString() + "AQUI ES JSON");
                in.close();
                responseStr = response.toString();
                
                cache.cacheContainer.put(request.queryParams("symbol") , responseStr);
                    
                } else {
                    System.out.println("GET request not worked");
                }
                System.out.println("GET DONE");
                
        }
        return responseStr;
    }

} 
     