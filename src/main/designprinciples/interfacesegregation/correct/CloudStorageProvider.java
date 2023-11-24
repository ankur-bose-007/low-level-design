package main.designprinciples.interfacesegregation.correct;

import java.io.File;

// By applying Interface segregation principle we have
// divided one fat interface into granular ones which makes
// it easier for the classes to implement the specific interface
// which suits their requirement. Since amazon provides all the
// features it implements all the 3 interfaces. While, in case
// of Dropbox since it is just a cloud storage provider it
// implements the CloudStorageProvider interface.

public interface CloudStorageProvider {
    public void storeFile(String filename);

    public File getFile(String filename);
}
