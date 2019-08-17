package builder;

public class Main {
    public static void main(String[] args) {

        Dirctor d = new Dirctor(new TextBuilder());
        d.editDoc();

        System.out.println("--------------");

        d = new Dirctor(new HTMLBuilder());
        d.editDoc();

    }
}
