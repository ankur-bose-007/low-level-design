package main.designpatterns.proxy.correct;

import java.io.File;
import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLibrary{
    private ThirdPartyYoutubeLibrary service;
    private List<String> videosCache;

    private File video;

    public CachedYoutubeClass(ThirdPartyYoutubeClass thirdPartyYoutubeClass){
        this.service = thirdPartyYoutubeClass;
    }

    @Override
    public List<String> listVideos() {
        if(videosCache == null)
            videosCache = service.listVideos();
        return videosCache;
    }

    @Override
    public String getVideoInfo(int id) {
        return null;
    }

    @Override
    public File downloadVideo(int id) {
        if(video == null)
            video = service.downloadVideo(id);
        return video;
    }
}
