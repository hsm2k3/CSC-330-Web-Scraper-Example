import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ScraperImpl implements Scraper {
    private String fileterBodyForTitle(String responseBody){
        int startOfOpeningTag = responseBody.indexOf("<title>");
        int startOfTitle = startOfOpeningTag + "<title>".length();
        int startOfClosingTag = responseBody.indexOf("</title>");
        return responseBody.substring(startOfTitle,startOfClosingTag);
    }
    @Override
    public String getTitle(String url) throws IOException{
        OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder().url(url).build();

            try (Response response = client.newCall(request).execute()) {
                return fileterBodyForTitle(response.body().string());
            }
    }
}
