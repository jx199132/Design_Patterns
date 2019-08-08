package template;

public class Main {
    public static void main(String[] args) {
        GameAbs football = new FootGame();
        football.play();
        System.out.println();
        GameAbs basketball = new Basketball();
        basketball.play();
    }
}
