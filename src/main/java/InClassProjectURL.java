
public class InClassProjectURL {
    public static void main (String[] args)throws Exception{
/*        String s = "<head><title>hello</title></head>";
        int startOfOpeningTag = s.indexOf("<title>");
        int startOfTitle = startOfOpeningTag + "<title>".length();
        int startOfClosingTag = s.indexOf("</title>");
        System.out.println(s.substring(startOfTitle,startOfClosingTag));*/

        Scraper scraper = new ScraperImpl();
        String output = scraper.getTitle("https://app.qgenda.com/landingpage/urg");
        System.out.println(output);




    }
}
