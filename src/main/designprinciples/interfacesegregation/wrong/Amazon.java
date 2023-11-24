package main.designprinciples.interfacesegregation.wrong;

import java.io.File;

public class Amazon implements CloudProvider{

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
        System.out.println("Create server:" + region);
    }

    @Override
    public void listServers(String region) {
        System.out.println("List of servers");
    }

    @Override
    public String getCDNAddress() {
        return "random cdn";
    }
}
