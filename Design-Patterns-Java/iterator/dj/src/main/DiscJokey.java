package main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJokey {

    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    public DiscJokey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s){

        this.songs70s = newSongs70s;
        this.songs80s = newSongs80s;
        this.songs90s = newSongs90s;

    }

    public void showTheSongs(){

        ArrayList aL70sSongs = songs70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for(int i = 0; i < aL70sSongs.size(); i++){

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());

        }

        SongInfo[] arrays80Songs = songs80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for(int j = 0; j < arrays80Songs.length; j++){

            SongInfo bestSongs = arrays80Songs[j];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();

        System.out.println("Songs of the 90s\n");

        for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements(); ){

            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());

        }

    }

}
