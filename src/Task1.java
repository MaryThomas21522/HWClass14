import java.util.Scanner;
public class Task1 {
    void language (String country) {
        if (country.equalsIgnoreCase("Philippines")) {
            System.out.println("Mabuhay");
        }
        if (country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");
        }
        if (country.equalsIgnoreCase("Mexico")) {
            System.out.println("Hola");
        }
        if (country.equalsIgnoreCase("Japan")) {
            System.out.println("Konnichiwa");
        }
        if (country.equalsIgnoreCase("Italy")) {
            System.out.println("Ciao");
        }
    }

    public static void main(String[] args) {
        Task1 hw=new Task1();
        String languageHello="Philippines";
        hw.language(languageHello);

        Task1 hw1=new Task1();
        String languageHello1="Japan";
        hw.language(languageHello1);

    }
}

 /* Create a method that will say Hello in different language
    based on the country that will passed when method is executed.
     */

