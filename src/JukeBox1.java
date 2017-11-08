
import java.io.*;
import java.util.*;

public class JukeBox1 {
    ArrayList <String> songList = new ArrayList <>();

    public void main(String[] args) {
        new JukeBox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("songList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line=null;
            while ((line = reader.readLine())!=null) {
                addSong(line);
            }
        } catch (Exception ex) {}
    }
    void addSong(String lineToParse) {
        String[] tokens=lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
