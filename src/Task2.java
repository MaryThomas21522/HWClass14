public class Task2 {

    String createEmail (String name1, String name2, String email) {

        return name1+name2+email;
    }

    public static void main(String[] args) {

        Task2 address1 = new Task2();
        String name1 = "Duncan";
        String name2 = "Booty";
        String email = "@ymail.com";
        String newEmail = address1.createEmail(name1, name2, email);
        System.out.println(newEmail);

        }
    }

    /*
Create a method createEmail(). Based on values of users firstName, lastName and email type,
your method should return complete email Address. Example:
createEmail(John, Snow, gmail) → johnsnow@gmail.com

     */
