/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String songName;
    private String artist;
    private String duration; // in the format (m)m:ss
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String artist, String duration)
    {
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        liked = false;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return songName;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public String getDuration()
    {
        return duration;
    }
    
    /**
     * Converts the string duration (m)m:ss to seconds
     */
    public double getDurationInSeconds()
    {
        double seconds = 0;
        String minutesPart = duration.substring(0, duration.indexOf(":"));
        seconds += Integer.parseInt(minutesPart) * 60;
        String secondsPart = duration.substring(duration.indexOf(":") + 1);
        seconds += Integer.parseInt(secondsPart);
        return seconds;
    }
    public boolean isLiked()
    {
        return liked;
    }
    
    public void like()
    {
        liked = true;
    }
    
    public void unlike()
    {
        liked = false;
    }
}
