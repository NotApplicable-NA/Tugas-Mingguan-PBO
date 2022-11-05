public class SciFi extends Film {
    @Override
    public void setGenre() {
        this.genre = "Sci-Fi";
    }

    @Override
    public void input() {
        System.out.println("Film Genre Sci-Fi");
        super.input();
    }
}
