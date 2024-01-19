
/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to 
 * all available methods
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
     * Removes a song from the playlist
     * @param exSong the song to be removed
     */
    public void remove(Song exSong)
    {
        playlist.remove(exSong);
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
                playlist.remove(song);
        }
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




}
