package json;

import play.api.Logger;
import play.libs.Json;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DisplayResults {

//    private String url;

    public DisplayResults() {
//        this.url = url;
    }

    public static String returnContent() {
        try {
            URLConnection connection = new URL("http://coddisapi01.gudev.gnl:8900/discussion-api/discussion//p/36a3y").openConnection();
            String result = connection.toString();
            InputStream stream =  connection.getInputStream();
            BufferedReader r = new BufferedReader(new InputStreamReader(stream));
            StringBuilder s = new StringBuilder();
            String line;
            while((line = r.readLine()) != null) {
                s.append(line);
            }
            return s.toString();
        }
        catch (Exception e) {
            //TO DO - figure out how to make a log message.
            System.out.println("Unable to make connection with URL" + e.getMessage());
        }
        return null;
    }


}
