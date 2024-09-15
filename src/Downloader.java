import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Downloader {
    // will use later for threading
    private boolean isDownloading;

    public Downloader() {
        this.isDownloading = false;
    }


    public void downLoad (String urlToDownload, String downloadPath) throws IOException {
        isDownloading = true;
        URL url = new URL(urlToDownload);
        InputStream inputStream = url.openStream();
        FileOutputStream fileOutputStream = new FileOutputStream(downloadPath);

        // Read File and write into given path
        byte[] bytes = new byte[1024];
        // Keep track of bytes read to not add any extra bytes during the last read
        int bytesRead;
        while ((bytesRead = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, bytesRead);
        }

        inputStream.close();
        fileOutputStream.close();
        System.out.println("Downloaded: " + downloadPath);
        isDownloading = false;
    }
}
