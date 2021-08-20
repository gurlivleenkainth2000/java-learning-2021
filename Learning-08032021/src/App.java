/*
 * Doubly Circular Linked List
 * Implement with Dynamic Programming
 */


public class App {

	public static void main(String[] args) {
		
		LinkedList playList = new LinkedList();
		
		Song song1 = new Song("1. Sach Keh", "B Praak", 3.44f);
		Song song2 = new Song("2. Don't Look", "Karan Aujla", 3.45f);
		Song song3 = new Song("3. GOAT", "Diljit Dosanjh", 4.20f);
		Song song4 = new Song("4. GOAT", "Diljit Dosanjh", 4.20f);
		Song song5 = new Song("5. GOAT", "Diljit Dosanjh", 4.20f);
		
		System.out.println("is playlist empty: " + playList.isEmpty());
		playList.showHeadTail();
		
		playList.addSong(song1);
		playList.addSong(song2);		
//		playList.addSong(song3);
		playList.addSong(song4);
		playList.addSongInBetween(song3, song1);
		playList.addSong(song5);
		
		playList.printSong();
		
	}

}
