import java.util.Scanner;

public class User {
    protected String nama, no_hp, email;
    protected int batas_film;

    public String getNama() {
        return nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getEmail() {
        return email;
    }

    public void batasfilm(){
        batas_film = 0;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Username : " );
        nama = input.nextLine();
        System.out.println("No HP : ");
        no_hp = input.nextLine();
        System.out.println("Email : ");
        email = input.nextLine();
    }
}
