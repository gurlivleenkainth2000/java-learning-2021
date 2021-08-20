
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList playList = new LinkedList();
		
		Song song1 = new Song("some song1", "john", 3.44f);
		Song song2 = new Song("some song2", "fionna", 3.45f);
		Song song3 = new Song("some song3", "kim", 2.66f);
		Song song4 = new Song("some song4", "jack", 4.55f);
		Song song5 = new Song("some song5", "dave", 3.47f);
		
		playList.addSong(song1);
		playList.addSong(song2);
		playList.addSong(song3);
		playList.addSong(song4);
		playList.addSong(song5);
		
		playList.forwardIterate();
		
//		System.out.println(">>> Looking for Song");
//		Song resultSong = playList.getSong(2);
//		if(resultSong != null) {
//			resultSong.showSong();
//		} else {
//			System.err.println("No Song Found");
//		}
		
//		System.out.println();
//		System.out.println(">>> Removing First Element");
//		playList.removeFirst();
//		playList.forwardIterate();
		
		System.out.println();
		System.out.println(">>> Removing Last Element");
		playList.removeLast();
		playList.forwardIterate();
	}

}
