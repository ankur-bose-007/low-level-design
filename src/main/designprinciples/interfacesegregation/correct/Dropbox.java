package main.designprinciples.interfacesegregation.correct;

import java.io.File;

public class Dropbox implements CloudStorageProvider {
    @Override
    public void storeFile(String filename) {
        System.out.println("store file" + filename);
    }

    @Override
    public File getFile(String filename) {
        return new File(filename);
    }
}
