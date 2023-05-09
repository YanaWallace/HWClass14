package HWClass14;

public class Task002 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Snow";
        String emailType = "gmail.com";
        System.out.println(createEmail(firstName, lastName, emailType));
    }

    public static String createEmail(String firstName, String lastName, String emailType) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + emailType;
    }
}
