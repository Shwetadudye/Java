
import java.lang.*;
import java.util.Locale;

public class Localization {
    public static  void main(String[] args) {

        Locale l1 = new Locale("hi","IN");
        Locale l2 = new Locale("en","US");
        Locale l3 = new Locale("fr","FR");

        System.out.println("india" +l1);
        System.out.println("france"+l3);
        System.out.println("usa" +l2);
        System.out.println("default values" +l1.getDefault());

        System.out.println("language" + l1.getLanguage());
        System.out.println("language" +l2.getLanguage());
        System.out.println("Country" + l1.getCountry());

        System.out.println("Get Default" +l1.getDisplayName());
        System.out.println("Get Default" +l2.getDisplayName());
        System.out.println("Get Default" +l3.getDisplayName());

    }
}
