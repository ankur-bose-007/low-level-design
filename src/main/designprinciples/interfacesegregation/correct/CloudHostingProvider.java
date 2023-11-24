package main.designprinciples.interfacesegregation.correct;

public interface CloudHostingProvider {
    public void createServer(String region);

    public void listServers(String region);
}
