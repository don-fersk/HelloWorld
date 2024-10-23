import java.util.ArrayList;
import java.util.Scanner;

public class Spotify {
    class Song {
        String title;
        String artist;

        Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        @Override
        public String toString() {
            return "Titel: " + title + ", Artist: " + artist;
        }
    }

    ArrayList<Song> songs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void menu() {
        int choice;
        do {
            System.out.println("\nVelkommen til Spotify! Vælg en mulighed:");
            System.out.println("1. Tilføj sang");
            System.out.println("2. Fjern sang");
            System.out.println("3. Vis sange");
            System.out.println("4. Søg sang");
            System.out.println("5. Rediger sang");
            System.out.println("6. Afslut");
            System.out.print("Dit valg: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addSong(); break;
                case 2: removeSong(); break;
                case 3: showSongs(); break;
                case 4: searchSong(); break;
                case 5: editSong(); break;
                case 6: System.out.println("Farvel!"); break;
                default: System.out.println("Ugyldigt valg.");
            }
        } while (choice != 6);
    }

    void addSong() {
        System.out.print("Titel: ");
        String title = scanner.nextLine();
        System.out.print("Artist: ");
        String artist = scanner.nextLine();
        songs.add(new Song(title, artist));
        System.out.println("Sangen blev tilføjet.");
    }

    void removeSong() {
        System.out.print("Indtast titlen på sangen, du vil fjerne: ");
        String title = scanner.nextLine();
        Song foundSong = findSongByTitle(title);
        if (foundSong != null) {
            songs.remove(foundSong);
            System.out.println("Sangen blev fjernet.");
        } else {
            System.out.println("Sangen blev ikke fundet.");
        }
    }

    void showSongs() {
        if (songs.isEmpty()) {
            System.out.println("Ingen sange tilgængelige.");
        } else {
            System.out.println("Sange:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    void searchSong() {
        System.out.print("Indtast titlen på sangen: ");
        String title = scanner.nextLine();
        Song foundSong = findSongByTitle(title);
        if (foundSong != null) {
            System.out.println("Fundet: " + foundSong);
        } else {
            System.out.println("Sangen blev ikke fundet.");
        }
    }

    void editSong() {
        System.out.print("Indtast titlen på sangen: ");
        String oldTitle = scanner.nextLine();
        Song foundSong = findSongByTitle(oldTitle);
        if (foundSong != null) {
            System.out.print("Ny titel: ");
            foundSong.title = scanner.nextLine();
            System.out.print("Ny artist: ");
            foundSong.artist = scanner.nextLine();
            System.out.println("Sangen blev opdateret.");
        } else {
            System.out.println("Sangen blev ikke fundet.");
        }
    }

    Song findSongByTitle(String title) {
        for (Song song : songs) {
            if (song.title.equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new Spotify().menu();
    }
}
