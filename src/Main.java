import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1 || (!args[0].equals("recipes") && !args[0].equals("guitars"))) {
            System.out.println("Please enter exactly only one of the following arguments: \"recipes\" or \"pictures\"");
            return;
        }
        Downloader downloader = new Downloader();

        final List<Map.Entry<String, String>> downloads;
        downloads = Util.getDownloads(args[0]);
        for (Map.Entry<String, String> entry : downloads){
            try {
                downloader.downLoad(entry.getValue(), "/Users/karan.aulakh/Desktop/Karan/FileDownloader/downloaded_files/" + entry.getKey() + ".pdf");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
