import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        
        // Creating LinkedList for playlist
        LinkedList<String> playlist = new LinkedList<>();

        // Adding songs
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Perfect");
        playlist.add("Faded");
        playlist.add("Levitating");

        // Display full playlist
        System.out.println("Full Playlist:");
        System.out.println(playlist);

        // Play first song (remove from front)
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying First Song: " + firstSong);

        // Display updated playlist
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        // Skip last song (remove from end)
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipping Last Song: " + lastSong);

        // Display updated playlist
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
