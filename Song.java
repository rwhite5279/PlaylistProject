/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String songName;
    private String artist;
    private double duration;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String songName, String artist, double duration)
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
    
    public double getDuration()
    {
        return duration;
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
