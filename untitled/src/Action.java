public class Action extends Film{
    @Override
    public void setGenre() {
        this.genre = "Action";
    }

    @Override
    public void input() {
        System.out.println("Film Genre Action");
        super.input();
    }

}
