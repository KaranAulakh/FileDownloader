import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Downloader {
    // will use later for threading
    private boolean isDownloading;

    public Downloader(){
        this.isDownloading = false;
    }


    public void downLoad (String urlToDownload, String downloadPath) throws IOException {
        isDownloading = true;
        URL url = new URL(urlToDownload);
        try (InputStream inputStream = url.openStream()) {
            FileOutputStream fileOutputStream = new FileOutputStream(downloadPath);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != 0){
                fileOutputStream.write(bytes, 0, len);
            }
            fileOutputStream.close();
            System.out.println("Downloaded: " + downloadPath);
        }
        isDownloading = false;
    }
}
