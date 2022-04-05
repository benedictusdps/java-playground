import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // Create a playlist with 6 songs
    desertIslandPlaylist.add("Mozart – Eine kleine Nachtmusik");
    desertIslandPlaylist.add("Beethoven – Für Elise");
    desertIslandPlaylist.add("Puccini – 'O mio babbino caro' from Gianni Schicchi");
    desertIslandPlaylist.add("J.S. Bach – Toccata and Fugue in D minor");
    desertIslandPlaylist.add("Beethoven – Symphony No.5 in C minor");
    desertIslandPlaylist.add("Vivaldi – The Four Seasons");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    // Remove a song so that the playlist have only 5 songs
    desertIslandPlaylist.remove("Vivaldi – The Four Seasons");

    // Swap one of the song with another song
    int indexA = desertIslandPlaylist.indexOf("Mozart – Eine kleine Nachtmusik");
    int indexB = desertIslandPlaylist.indexOf("Beethoven – Symphony No.5 in C minor");
    String tempA = "Mozart – Eine kleine Nachtmusik";
    desertIslandPlaylist.set(indexA, "Beethoven – Symphony No.5 in C minor");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());   
  }  
}