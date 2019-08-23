package memento;

import java.util.Stack;

public class NoteHistory {
    private Stack<Note> stack = new Stack<>();

    public Note getPrev(){
        return stack.pop();
    }

    public void push(Note note){
        Note note1 = new Note();
        note1.setTxt(note.getTxt());
        stack.push(note1);
    }

    public int size(){
        return stack.size();
    }
}
