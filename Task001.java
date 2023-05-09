package HWClass14;

public class Task001 {

        public static void main(String[] args) {
            System.out.println(sayHello("France"));
            System.out.println(sayHello("Germany"));
            System.out.println(sayHello("Spain"));
        }

        public static String sayHello(String country) {
            switch (country) {
                case "France":
                    return "Bonjour";
                case "Germany":
                    return "Hallo";
                case "Spain":
                    return "Hola";
                default:
                    return "Hello";
            }
        }
    }

