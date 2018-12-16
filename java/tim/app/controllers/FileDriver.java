package tim.app.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileDriver {

    public void move(String from, String to) throws IOException {
        Files.move(new File(from).toPath(), new File(to).toPath());
    }

    public byte[] read(String adr) throws IOException {
        return Files.readAllBytes(new File(adr).toPath());
    }

    public boolean copy(String from, String to) throws IOException {
        return write(to, read(from));
    }

    public boolean write(String adr, byte[] data) throws IOException {
        return
                Files.write(new File(adr).toPath()
                , data).toFile().isFile();}

    public boolean delete(String adr){
        return new File(adr).delete();
    }

    public String[] listNames(String adr){
        ArrayList<String> res = new ArrayList<>();
        for (File f : listFiles(adr) ) {
            res.add(f.getName());}
        return res.toArray(new String[0]);
    }

    public File[] listFiles(String adr){
        return new File(adr).listFiles();
    }
}
