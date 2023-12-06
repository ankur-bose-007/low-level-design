package main.designpatterns.proxy.correct;


// With this process we introduce lazy loading as well as
// caching of the video data. Now if the videos or the list
// doesn't exist the api call will be made else will be returned
// from the cache. Thereby reducing a lot of overhead calls.
public class Client {
    public void render(){
        ThirdPartyYoutubeLibrary thirdPartyYoutubeLibraryProxy = new CachedYoutubeClass(new ThirdPartyYoutubeClass());

        thirdPartyYoutubeLibraryProxy.listVideos();
        thirdPartyYoutubeLibraryProxy.getVideoInfo(1);
        thirdPartyYoutubeLibraryProxy.downloadVideo(1);
    }
}
