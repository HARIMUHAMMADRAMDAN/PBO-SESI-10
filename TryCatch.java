public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);  // Ini akan melempar pengecualian
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array di luar batas: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Blok 'try catch' selesai dieksekusi.");
        }
    }
}
