import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        hitungSuhu();
        inchMeter();
        konversiWaktu();
        menghitungBmi();
        menghitungJarak();
    }
    static void hitungSuhu() {
        double fahrenheit;
        double celcius;

        Scanner suhu = new Scanner(System.in);
        System.out.println("----Menghitung Suhu----");
        System.out.print("Masukkan nilai Fahrenheit : ");
        fahrenheit = suhu.nextDouble();
        celcius = (fahrenheit-32)*5/9;
        System.out.println(fahrenheit +" F sama dengan "+ celcius + " C");

    }
    static void inchMeter(){
        double inch;
        double meter = 0.0254;

        System.out.println("----Menghitung nilai dalam inch----");
        Scanner Nilaiinch = new Scanner(System.in);
        System.out.print("Masukkan nilai dalam inch : ");
        inch = Nilaiinch.nextDouble();
        meter = inch * meter;
        System.out.println(inch + " inch adalah " + meter + " meter");

    }
    static void konversiWaktu(){
        int menit;

        System.out.println("----Menghitung Konversi Waktu----");
        Scanner konver = new Scanner(System.in);
        System.out.print("Masukkan menit : ");
        menit = konver.nextInt();
        int hari = menit/1440;
        int tahun = hari/365;
        int sisaHari =hari%365;

        System.out.println("hasilnya : " + tahun + " tahun " + sisaHari + " hari");
    }
    static void menghitungBmi(){
        double berat;
        double tinggi;
        double bodymass;

        System.out.println("----Menghitung BMI----");
        Scanner bmi = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan : ");
        berat = bmi.nextDouble();
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = bmi.nextDouble();
        bodymass = berat/tinggi/tinggi*10000;
        System.out.println("BMI adalah : " + bodymass);
    }
    static void menghitungJarak(){
        int jarak, jam, menit, detik;

        System.out.println("----Menghitung Jarak----");
        Scanner kecepatan = new Scanner(System.in);
        System.out.print("Masukkan jarak dalam meter : ");
        jarak = kecepatan.nextInt();
        System.out.print("Masukkan Jam : ");
        jam = kecepatan.nextInt();
        System.out.print("Masukkan Menit : ");
        menit = kecepatan.nextInt();
        System.out.print("Masukkan Detik : ");
        detik = kecepatan.nextInt();

        double totalDetik = (jam*3600)+(menit*60)+(detik);
        double totalJam = (jam) + (menit/60) + (detik/3600);

        double meterSecond = jarak/totalDetik;
        System.out.println("Kecepatan dalam meter/second adalah : " + meterSecond);
        double kmh = (jarak/1000)/totalJam;
        System.out.println("Kecepatan dalam km/h : " + kmh);
        double milh = (jarak/1609)/totalJam;
        System.out.println("Kecepatan dalam mil/h : " + milh);
    }
}