package main;

public class DiscJockeyComposite {

    SongComponent songList;

    public DiscJockeyComposite(SongComponent newSongList){

        this.songList = newSongList;
    }

    public void getSongList() {

        songList.displaySongInfo();
    }

}
