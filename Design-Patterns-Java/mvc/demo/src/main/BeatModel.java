package main;

import java.util.ArrayList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.*;

public class BeatModel implements BeatModelInterface, Runnable{
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    @Override
    public void initialize() {

        try{
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));

        } catch(Exception ex){
            System.out.println("Error: Can't load clip");
            System.out.println(ex);
        }

    }

    @Override
    public void on() {

        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {

        stopBeat();
        stop = true;
    }

    @Override
    public void run() {

        while (!stop){
            playBeat();
            notifyBeatObservers();
            try{
                Thread.sleep(60000/getBPM());
            } catch (Exception e){

            }
        }

    }

    @Override
    public void setBPM(int bpm) {

        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {

        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {

        int i = beatObservers.indexOf(o);
        if (i >= 0){
            beatObservers.remove(i);
        }
    }

    public void notifyBeatObservers(){
        for (int i = 0; i < beatObservers.size(); i++){
            BeatObserver observer = (BeatObserver) beatObservers.get(i);
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {

        int i = bpmObservers.indexOf(o);
        if (i >= 0){
            bpmObservers.remove(o);
        }
    }

    public void notifyBPMObservers(){
        for (int i = 0; i < bpmObservers.size(); i++){
            BPMObserver observer = (BPMObserver) bpmObservers.get(i);
            observer.updateBPM();
        }
    }

    public void playBeat(){

        clip.setFramePosition(0);
        clip.start();
    }

    public void stopBeat(){

        clip.setFramePosition(0);
        clip.stop();
    }

}
