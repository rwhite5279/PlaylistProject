
/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to 
 * all available methods
 * 
 * @author Richard White
 * @version 2024-01-19
 */

import java.util.ArrayList;

public class Playlist 
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }
      
    /**
     * Methods-- Remember that you need to be able to complete all of the following:
     * Adding a song
     * 'liking' a song
     * Removing a specific song
     * Examining all Songs (a String return or void print makes sense here)
     * Examining a sublist of all liked songs
     * Determining the total duration of all songs
     * Removing all unliked songs from the playlist (careful with this one!)
     */

    /**
     * The `add` method adds a new song to the playlist
     * @param newSong the song to be added
     */
    public void add(Song newSong)
    {
        playlist.add(newSong);
    }

    public void add(String title, String artist, String duration)
    {
        playlist.add(new Song(title, artist, duration));
    }

    /**
     * Likes a song in the playlist
     * @param newSong the song to "like"
     */
    public void like(Song newSong)
    {
        newSong.like();
    }

    /**
     * Overloads the like method
     * @param title the title of the song to like
     */
    public void like(String title)
    {
        for (Song p : playlist)
        {
            if (p.getName().equals(title))
            {
                p.like();
                return;
            }
        }
        System.out.println("Error--couldnt find song with that title.");
    }

    /**
     * Removes a song from the playlist
     * @param exSong the song to be removed
     */
    public void remove(Song exSong)
    {
        if (!playlist.remove(exSong))
            System.out.println("Error--coun't find song to remove.");
    }

    /**
     * Removes a song from the playlist
     * @param exSong the song to be removed
     */
    public void remove(String title)
    {
        for (Song song : playlist)
        {
            if (song.getName().equals(title))
            {
                playlist.remove(song);
                return;
            }
        }
        System.out.println("Error--couldn't find song to remove.");
    }

    public ArrayList<Song> getAllSongs()
    {
        return playlist;
    }

    public ArrayList<Song> getLikedSongs()
    {
        ArrayList<Song> likedSongs = new ArrayList<Song>();
        for (Song song : playlist)
        {
            if (song.isLiked())
                likedSongs.add(song);
        }
        return likedSongs;
    }

    /**
     * Go backwards through the list and remove elements as
     * we go.
     */
    public void removeUnlikedSongs()
    {
        for (int i = playlist.size() - 1; i >= 0; i--)
        {
            if (!playlist.get(i).isLiked())
                playlist.remove(i);
        }
    }

/**
     * Identifies the total duration of all the songs in the playlist
     * @return a String in the form h:mm:ss
     */
    public String getTotalDuration()
    {
        int totalSeconds = 0;
        for (Song s : playlist)
            totalSeconds += s.getDurationInSeconds();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;
        return hours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);

    }

    /**
     * This helper method looks for a song with the given title and 
     * returns it.
     * @param title the song's title
     * @return the associated Song object with that title
     */
    public Song getSongWithTitle(String title)
    {
        for (Song s : playlist)
        {
            if (s.getName().equals(title))
            {
                return s;
            }
        }
        return null;
    }

}
