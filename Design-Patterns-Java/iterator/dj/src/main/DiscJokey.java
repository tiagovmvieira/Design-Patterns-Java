package main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJokey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJokey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s){

        this.iter70sSongs = newSongs70s;
        this.iter80sSongs = newSongs80s;
        this.iter90sSongs = newSongs90s;

    }

    public void showTheSongs(){

        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        showTheSongs(songs70s);

        System.out.println("\nSongs of the 80s\n");
        showTheSongs(songs80s);

        System.out.println("\nSongs of the 90s\n");
        showTheSongs(songs90s);
    }

    public void showTheSongs(Iterator iterator){

        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());

        }

    }

}
