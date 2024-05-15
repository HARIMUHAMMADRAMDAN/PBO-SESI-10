public class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - you are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // Ini akan melempar pengecualian
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
    }
}
