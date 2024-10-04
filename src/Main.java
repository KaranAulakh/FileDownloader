import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        if (args.length == 1 && (args[0].equals("recipes") || args[0].equals("guitars"))) {
            downloadSet(args[0], downloader);
        } else {
            menu(downloader);
        }
    }

    public static void menu(Downloader downloader) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to File Downloader! Please enter the path of the file you wish to download" +
                " or \"recipes\" or \"guitars\". You may also enter /quit to leave the program");

        while (true) {
            String option = userInput.nextLine();
            if (Objects.equals(option, "/quit")){
                return;
            }
            else if (Objects.equals(option, "guitars")) {
                downloadSet("guitars", downloader);
            }
            else if (Objects.equals(option, "recipes")) {
                downloadSet("recipes", downloader);
            }
            System.out.println("I'll get started on that, what else would you like to download?");
        }
    }

    public static void downloadSet(String option, Downloader downloader){
        final Map.Entry<String, String>[] downloads;
        downloads = Util.getDownloads(option);
        for (Map.Entry<String, String> entry : downloads) {
            try {
                downloader.downLoad(entry.getValue(), "/Users/karan.aulakh/Desktop/Karan/FileDownloader/downloaded_files/" + entry.getKey() + ".pdf");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}