import java.io.IOException;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        try {
            downloader.downLoad("http://rarerecipes.net/veg_manchurian_recipe.pdf", "/Users/karan.aulakh/Desktop/Karan/Downloader/downloaded_files/test.pdf");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
