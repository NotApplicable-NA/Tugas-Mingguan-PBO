import java.util.Scanner;

public class Film {
    protected String nama_film, tahun_rilis, genre;
    protected int durasi;

    public String getNama_film() {
        return nama_film;
    }

    public String getTahun_rilis() {
        return tahun_rilis;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setGenre(){
        this.genre = "-";
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Film : " );
        nama_film = input.nextLine();
        System.out.println("Tahun Rilis : ");
        tahun_rilis = input.nextLine();
        System.out.println("Durasi : ");
        durasi = input.nextInt();
    }
}
