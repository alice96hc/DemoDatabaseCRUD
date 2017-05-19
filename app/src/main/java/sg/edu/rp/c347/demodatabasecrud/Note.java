package sg.edu.rp.c347.demodatabasecrud;

/**
 * Created by 15017199 on 19/5/2017.
 */

public class Note {
    private int id;
    private String noteContent;

    public Note(int id,String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

}
