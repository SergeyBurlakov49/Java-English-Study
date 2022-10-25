package Strings;

public class Strings {
    public static void main(String[] args) {
        String str = "Строка";
        String same_str = "Строка";
        String big_str = "Большая строка";
        String small_str = "стрк";
        String multi_str = str + same_str;
        System.out.println(str.equals(same_str));
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.compareTo(same_str));
        System.out.println(str.compareTo(big_str));
        System.out.println(str.compareTo(small_str));
        System.out.println(str.indexOf("ок"));
        System.out.println(str.indexOf("бебра"));
        System.out.println(big_str.indexOf("о"));
        System.out.println(big_str.lastIndexOf("о"));
        System.out.println(multi_str);
    }
}
