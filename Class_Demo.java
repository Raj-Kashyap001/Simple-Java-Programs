class Person {
    String name;
    int age; 
};

class Class_Demo {
     public static void main(String[] args) {
        Person  person1 = new Person();
        person1.name="John";
        person1.age =25;

        System.out.println("Name: " +person1.name); // Name
        System.out.println("Age :" +person1.age );   // Age
    }
}