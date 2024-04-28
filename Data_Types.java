import java.util.Arrays;

class Data_Types {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 10.56f;
        double doubleValue = 10.789456;
        boolean booleanValue = true;
        char charValue = 'A';

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Char Value: " + charValue);

        // Reference Data Types
        String stringValue = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("String Value: " + stringValue);
        System.out.println("Int Array: " + Arrays.toString(intArray));

        // User Defined Data Types
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        Person person = new Person("John Doe", 25);
        System.out.println("Person Object: " + person.name + ", " + person.age);
    }
}