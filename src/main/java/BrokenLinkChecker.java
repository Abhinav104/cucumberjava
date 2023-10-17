import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinkChecker {
    public static void main(String[] args) {
        try {
            String link = "https://google.com";
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Link is working fine.");
            } else {
                System.out.println("Link is broken (Response Code: " + responseCode + ")");
            }
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
