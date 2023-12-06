package main.designpatterns.proxy.correct;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLibrary {

    @Override
    public List<String> listVideos() {
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(int id) {
        return "";
    }

    @Override
    public File downloadVideo(int id) {
        return new File("id");
    }
}
