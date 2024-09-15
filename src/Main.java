import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args){
        Downloader downloader = new Downloader();
        try {
            downloader.downLoad("https://www.journaldev.com/sitemap.xml", "/Users/karan.aulakh/Desktop/Karan/Downloader/downloaded_files/test");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}