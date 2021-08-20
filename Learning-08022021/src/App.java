/*
 * Doubly Circular Linked List
 * Implement with hard-coded values
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song song1 = new Song("Sach Keh ", "B Praak", 3.44f);
		Song song2 = new Song("Don't Look", "Karan Aujla", 3.45f);
		Song song3 = new Song("GOAT", "Diljit Dosanjh", 4.20f);
		
		song1.nextSong = song2;
		song1.previousSong = song3;
		
		song2.nextSong = song3;
		song2.previousSong = song1;
		
		song3.nextSong = song1;
		song3.previousSong = song2;
		
		Song song = song1;
		while (true) {
			song.showSong();
			song = song.nextSong;
			
			if(song.nextSong == song1) {
				song.showSong();
				break;
			}
		}
		
		System.out.println();		
		song = song3;
		while (true) {
			song.showSong();
			song = song.previousSong;
			
			if(song.previousSong == song3) {
				song.showSong();
				break;
			}
		}
		
//		song1.showSong();
//		song2.showSong();
//		song3.showSong();
	}

}
