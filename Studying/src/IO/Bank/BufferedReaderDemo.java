package IO.Bank;
import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Bankinfo.txt");
        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){
            String userdata;
            for (;;){
                userdata = br.readLine();
                if (userdata == null) break;
                int divider = userdata.indexOf(',');
                String userName = userdata.substring(0, divider);
                String balanceString = userdata.substring(divider + 1);
                float userBalance = Float.parseFloat(balanceString);
                Customer customer = new Customer(userBalance, userName);
                System.out.println(customer);
                System.out.println(customer.balance + 1);
            }
        }
    }
}
