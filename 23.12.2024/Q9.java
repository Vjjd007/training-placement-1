public class Largest {
    public static void main(String[] args) {
        int a = 45, b = 78, c = 32;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest Number: " + largest);
    }
}
