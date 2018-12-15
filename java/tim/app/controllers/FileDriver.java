package tim.app.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileDriver {

    public void move(){};
    public void read(){};
    public void coppy(){};
    public boolean write(String adr, byte[] data) throws IOException {
        return Files.write(new File(adr).toPath()
                , data).toFile().isFile();};
    public boolean delete(String adr){
        return new File(adr).delete();
    };
    public String[] listNames(String adr){
        ArrayList<String> res = new ArrayList<String>();
        for (File f : listFiles(adr) ) {
            res.add(f.getName());}
        return res.toArray(new String[0]);
    };
    public File[] listFiles(String adr){
        return new File(adr).listFiles();
    };
}
