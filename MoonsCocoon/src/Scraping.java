import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

class Scraping {
    public static void main(String[] args) {
        String url = "https://example.com"; // URL of the webpage you want to scrape

        try {
            // Fetch and parse the HTML document from the URL
            Document document = Jsoup.connect(url).get();

            // Extract the title of the page
            String title = document.title();
            System.out.println("Title: " + title);

            // Extract the body content of the page
            String bodyText = document.body().text();
            System.out.println("Body Text: " + bodyText);

            // You can also select specific elements by CSS selectors
            Elements links = document.select("a[href]"); // Select all links in the page
            System.out.println("Links on the page:");
            for (Element link : links) {
                System.out.println(link.attr("href") + " - " + link.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}