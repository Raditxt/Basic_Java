public class ConversionExample {
    public static void main(String[] args) {
        // Contoh menggabungkan Widening dan Narrowing Casting dalam satu baris kode
        byte myByte = 10;
        // Widening Casting: byte -> int -> double, lalu Narrowing Casting: double -> short -> byte
        byte result = (byte) (short) (double) (int) myByte;

        System.out.println("Nilai awal (byte): " + myByte);
        System.out.println("Nilai setelah konversi (byte -> int -> double -> short -> byte): " + result);
    }
}
