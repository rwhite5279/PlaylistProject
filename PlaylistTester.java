/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * 
 * @author Richard White
 * @version 2024-01-18
 */
public class PlaylistTester 
{
    
    public static void main(String[] args) {
        
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist using overloaded .add() method...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.add(new Song("Rock and Roll","Led Zeppelin", "3:40"));
        p.add("Willow", "Taylor Swift", "3:34");
        p.add("Sorry", "Beyonce", "3:52");
        p.add("Killing in the Name","Rage Against the Machine","5:14");
        p.add("Thick as a Brick","Jethro Tull","43:46");
        p.add("Echoes","Pink Floyd","23:29");

        System.out.println("Printing the songs...\n");
        for (Song s : p.getAllSongs())
        {
            System.out.println(s);
        }
        
        System.out.println("\nLiking Willow and Sorry...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.like("Willow");
        Song s = p.getSongWithTitle("Sorry");
        p.like(s);

        System.out.println("Printing only Liked songs...\n");
        for (Song ls : p.getLikedSongs())
        {
            System.out.println(ls);
        }
        
        System.out.println("\nRemoving by title and Song (overloaded remove method)...\n");
        p.remove("Rock and Roll");
        p.remove(s); // Sorry

        System.out.println("Printing remaining songs...\n");
        for (Song ps : p.getAllSongs())
        {
            System.out.println(ps);
        }

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.getTotalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();
        System.out.println("Printing remaining songs...\n");
        for (Song ps : p.getAllSongs())
        {
            System.out.println(ps);
        }

    }
}
