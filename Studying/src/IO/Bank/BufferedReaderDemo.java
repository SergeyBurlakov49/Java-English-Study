package IO.Bank;
import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Java-English-Study/Bankinfo.txt");
        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){
            String userdata = "?";
            while (userdata != null){
                userdata = br.readLine();
                int divider = userdata.indexOf(',');
                String userName = userdata.substring(0, divider - 1);
                String balanceString = userdata.substring(divider + 1);
                double userBalance = Double.parseDouble(balanceString);
                Customer customer = new Customer(userBalance, userName);
                System.out.println(customer.toString());
            }
        }
    }
}
