package main.designpatterns.proxy.correct;


// With this process each time the methods of ThirdPartyYoutubeLibrary
// is called an api request is made. This makes redundant calls the hence
// results in a lot of computation and memory inefficiency. This can
// be avoided by introducing a proxy wrapper and caching data.
public class Client {
    public void render(){
        ThirdPartyYoutubeLibrary thirdPartyYoutubeLibraryProxy = new CachedYoutubeClass(new ThirdPartyYoutubeClass());

        thirdPartyYoutubeLibraryProxy.listVideos();
        thirdPartyYoutubeLibraryProxy.getVideoInfo(1);
        thirdPartyYoutubeLibraryProxy.downloadVideo(1);
    }
}
