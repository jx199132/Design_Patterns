package memento;

public class Main {


    public static void main(String[] args) {
        Note note = new Note();

        NoteHistory history = new NoteHistory();

        note.setTxt("1");
        history.push(note);

        note.setTxt("2");
        history.push(note);

        note.setTxt("3");
        history.push(note);

        note.setTxt("4");
        history.push(note);

        note.setTxt("5");
        history.push(note);

        System.out.println(history.getPrev().getTxt());
        System.out.println(history.getPrev().getTxt());
        System.out.println(history.getPrev().getTxt());
        System.out.println(history.getPrev().getTxt());
        System.out.println(history.getPrev().getTxt());
    }
}
