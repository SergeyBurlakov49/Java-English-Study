package FilesParsing;

import java.io.File;

public class FilesParsingTest {
    public static void main(String[] args) {
        for (File file:new File("C:/Users/megas/OneDrive/Рабочий стол/Projects").listFiles()){
            System.out.println(file);
        }
    }
}
