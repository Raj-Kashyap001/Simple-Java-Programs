class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus
        System.out.println("a++   = " + (a++));   // Increment Post
        System.out.println("++a   = " + (++a));   // Increment Pre
        System.out.println("b--   = " + (b--));   // Decrement Post
        System.out.println("--b   = " + (--b));   // Decrement Pre

        // Relational Operators
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a!= b = " + (a!= b));

        // Logical Operators
        System.out.println("true && false = " + (true && false));
        System.out.println("true || false = " + (true || false));
        System.out.println("!true         = " + (!true));

        // Bitwise Operators
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a   = " + (~a));   // Bitwise Complement
        System.out.println("a << 2 = " + (a << 2)); // Bitwise Left Shift
        System.out.println("b >> 2 = " + (b >> 2)); // Bitwise Right Shift
        System.out.println("c >>> 2 = " + (c >>> 2)); // Bitwise Unsigned Right Shift

        // Assignment Operators
        a += 5; // Same as a = a + 5
        System.out.println("a += 5 = " + a);
        a -= 5; // Same as a = a - 5
        System.out.println("a -= 5 = " + a);
        a *= 5; // Same as a = a * 5
        System.out.println("a *= 5 = " + a);
        a /= 5; // Same as a = a / 5
        System.out.println("a /= 5 = " + a);
        a %= 5; // Same as a = a % 5
        System.out.println("a %= 5 = " + a);

        // Ternary Operator
        int max = (a > b)? a : b;
        System.out.println("Max of a and b is " + max);
    }
}