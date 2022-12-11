import java.io.File;

public class Utils {
    public static String checkName(String name, File path, char symbol){
        File [] filesList = path.listFiles();
        boolean isSimilarName;
        do {
           isSimilarName = false;
           for (File file:filesList){
               System.out.println(file);
               if (file.getName().equals(name)) isSimilarName = true;
           }
           name = (name + symbol);
        }
        while (isSimilarName);
        return name;
    }

    public static String checkName(String name, File path){
        return checkName(name, path, '-');
    }
}
