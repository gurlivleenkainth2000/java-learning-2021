
public class LinkedList {
	Song head;
	Song tail;
	private int length = 0;
//	LinkedList() {
//		head = null;
//		tail = null;
//	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	int getLength() {
		return length;
	}

	void addSong(Song song) {
		length++;
		if(head == null) {
			head = song;
			tail = song;
			
		} else {
			tail.nextSong = song;
			song.previousSong = tail;
			head.previousSong = song;
			tail = song;
			tail.nextSong = head;
			
		}
	}
	
	void addSongInBetween(Song currentSong, Song afterSong) {
		Song tempSong = afterSong.nextSong;
		
		afterSong.nextSong = currentSong;
		currentSong.nextSong = tempSong;
		
		tempSong.previousSong = currentSong;
		currentSong.previousSong = afterSong;
		
		
	}
	
	void printSong() {
		Song song = head;
		while(true) {
			song.showSong();
			song = song.nextSong;
			
			if(song.nextSong == head) {
				song.showSong();	
				break;
			}
		}
	}
	
	void showHeadTail() {
		System.out.println(">>> Head: " + head);
		System.out.println(">>> Tail: " + tail);
		System.out.println();
	}
	
}
