import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.*;


public class HelloWorld {


    public static void main(String[] args) throws Exception {
        String directoryPath = "/home/local/ZOHOCORP/karthi-con1062/HelloWorld";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        List<File> filesList = new ArrayList<>();
        for (File file : files) {
            if (!file.isFile() || !file.getName().endsWith(".csv")) {
                continue;
            }
            filesList.add(file);
        }
        System.out.println("----------------Available Files - start-----------------");
        for (int i = 0; i < filesList.size(); i++) {
            System.out.println("Files " + i + " => " + filesList.get(i).getName() + " File count : " + Files.lines(filesList.get(i).toPath()).count());
        }
        System.out.println("----------------Available Files - end -----------------");
        
    }

}

