import java.util.*;
public class Main {
    public static void main(String[] args) {
        String pilih;
        Scanner pil = new Scanner(System.in);
        Free free = new Free();
        free.input();
        Berlangganan berbayar = new Berlangganan();
        Action action = new Action();
        SciFi scifi = new SciFi();
        action.input();
        System.out.flush();
        free.input();
        System.out.println("Ingin Berlangganan? (y/n)");
        pilih = pil.next();
        if(pilih == "n"){
            System.out.println("Hello " + free.getNama());
            System.out.println("Berikut daftar film yang tersedia");
            System.out.println("Anda terdaftar sebagai user free");
            System.out.println("Batas film yang bisa ditonton : " + free.batas_film);
            System.out.println("Berikut daftar film yang bisa ditonton : ");
                System.out.println(action.getNama_film());
                System.out.println(action.getTahun_rilis());
                System.out.println(action.getDurasi());
                System.out.println(" ");
            System.out.println(scifi.getNama_film());
            System.out.println(scifi.getTahun_rilis());
            System.out.println(scifi.getDurasi());
            System.out.println(" ");

        }else if(pilih == "y"){
            berbayar.nama = free.nama;
            berbayar.no_hp = free.no_hp;
            berbayar.email = free.email;
            System.out.println("Hello " + berbayar.getNama());
            System.out.println("Berikut daftar film yang tersedia");
            System.out.println("Anda terdaftar sebagai user free");
            System.out.println("Batas film yang bisa ditonton : " + berbayar.batas_film);
            System.out.println(action.getNama_film());
            System.out.println(action.getTahun_rilis());
            System.out.println(action.getDurasi());
            System.out.println(" ");
            System.out.println(scifi.getNama_film());
            System.out.println(scifi.getTahun_rilis());
            System.out.println(scifi.getDurasi());
            System.out.println(" ");
        }
        pilih = pil.next();
        System.out.flush();

    }
}