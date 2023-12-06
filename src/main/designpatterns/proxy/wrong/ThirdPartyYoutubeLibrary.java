package main.designpatterns.proxy.wrong;

import java.io.File;
import java.util.List;

public interface ThirdPartyYoutubeLibrary {
    public List<String> listVideos();

    public String getVideoInfo(int id);

    public File downloadVideo(int id);
}
