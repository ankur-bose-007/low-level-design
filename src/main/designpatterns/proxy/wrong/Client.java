package main.designpatterns.proxy.wrong;


// With this process each time the methods of ThirdPartyYoutubeLibrary
// is called an api request is made. This makes redundant calls the hence
// results in a lot of computation and memory inefficiency. This can
// be avoided by introducing a proxy wrapper and caching data.
public class Client {
    public void render(){
        ThirdPartyYoutubeLibrary thirdPartyYoutubeLibrary = new ThirdPartyYoutubeClass();

        thirdPartyYoutubeLibrary.listVideos();
        thirdPartyYoutubeLibrary.getVideoInfo(1);
        thirdPartyYoutubeLibrary.downloadVideo(1);
    }
}
