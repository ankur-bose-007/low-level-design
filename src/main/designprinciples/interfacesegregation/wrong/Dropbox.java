package main.designprinciples.interfacesegregation.wrong;

import java.io.File;

public class Dropbox implements CloudProvider{
    @Override
    public void storeFile(String filename) {
        System.out.println("store file" + filename);
    }

    @Override
    public File getFile(String filename) {
        return new File(filename);
    }

    @Override
    public void createServer(String region) {
        System.out.println("functionality not supported");
    }

    @Override
    public void listServers(String region) {
        System.out.println("functionality not supported");
    }

    @Override
    public String getCDNAddress() {
        return "functionality not supported";
    }
}
