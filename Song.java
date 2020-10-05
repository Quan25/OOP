import java.io.File;
import java.io.FileInputStream;

//import javax.media.*;

import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Song {
   String name;
   String artist;
   String album;
   String url;
   String format;
   // Duration of Song in seconds
   int duration;
   public Song(){

   }
   public Song(String name, String artist, String album, String url,
         String format, int duration) {
      super();
      this.name = name;
      this.artist = artist;
      this.album = album;
      this.url = url;
      this.format = format;
      this.duration = duration;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getArtist() {
      return artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public String getAlbum() {
      return album;
   }

   public void setAlbum(String album) {
      this.album = album;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getFormat() {
      return format;
   }

   public void setFormat(String format) {
      this.format = format;
   }

   public int getDuration() {
      return duration;
   }

   public void setDuration(int duration) {
      this.duration = duration;
   }
   public boolean isLong() {
      return duration>50;
   }
   @Override
   public String toString() {
      return "Name: " + this.getName() + "\t" +
             "Artist:" + this.getArtist() + "\t" +
             "Album:" + this.getAlbum() + "\t" +
             "Format:" + this.getFormat() + "\t" +
             "Duration:" + this.getDuration();
   }

   public void play(){
      try{
         FileInputStream fis = new FileInputStream(this.getUrl());
         Player playMP3 = new javazoom.jl.player.Player(fis);
         playMP3.play();
      }catch(Exception e){
          System.out.println(e);
       }
   }
      //Driver
      public static void main(String[] args){
         System.out.println("Creating Song Object");
         Song song1=new Song("crickets sounds", "Unknown artist",
               "Unknown album", "Songs/Crickets.mp3", "Mp3", 214);
         System.out.println("Playing Song");
         song1.play();

      }
}
