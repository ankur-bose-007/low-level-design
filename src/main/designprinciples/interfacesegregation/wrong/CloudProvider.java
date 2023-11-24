package main.designprinciples.interfacesegregation.wrong;

import java.io.File;

// The problem with this approach is the interface CloudProvider
// is a generic interface which will be implemented by all the
// cloud providers. Though Amazon supports all the functionalities
// provided by CloudProvider dropzone doesn't support a few. It is
// not practical to implement those operations for Dropzone class.

public interface CloudProvider {
    public void storeFile(String filename);

    public File getFile(String filename);

    public void createServer(String region);

    public void listServers(String region);

    public String getCDNAddress();
}
