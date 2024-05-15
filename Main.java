import packageuniversitas.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        try {
            Mahasiswa mhs = new Mahasiswa(" IPIN ", "123456789", "Teknik Informatika");

            // Mengakses atribut menggunakan getter
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jurusan: " + mhs.getJurusan());

            // Mengubah nilai atribut menggunakan setter
            mhs.setNama(" Ucup ");
            mhs.setNim("987654321");
            mhs.setJurusan("Sistem Informasi");

            // Mencetak nilai atribut yang telah diubah
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jurusan: " + mhs.getJurusan());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Eksekusi selesai.");
        }
    }
}
