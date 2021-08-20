
public class LinkedList {
	Song head;
	Song tail;
	private int length = 0;

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
	
	Song getSong(int index) {
		Song toBeFoundSong = null;
		Song song = head;
		
		while(true) {
			if(song.index == index) {
				toBeFoundSong = song;
				break;
			}
			
			if(index > length) {
				break;
			}
			
			song = song.nextSong;
		}
		
		return toBeFoundSong;
	}
	
	void removeFirst() {
		Song toBeRemoved = head;
		head = toBeRemoved.nextSong;
		tail.nextSong = head;
		head.previousSong = tail;
		
	}
	
	void removeLast() {
		Song toBeRemoved = tail;
		tail = toBeRemoved.previousSong;
		head.previousSong = tail;
		tail.nextSong = head;
	}
	
	void remove(int index) {
		
	}
	
	void insertAtIndex(int index) {
		
	}
	
	void bubbleSort() {
		
	}
	
	void forwardIterate() {
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
	
	void backwardIterate() {
		Song song = tail;
		while(true) {
			song.showSong();
			song = song.previousSong;
			
			if(song.previousSong == tail) {
				song.showSong();	
				break;
			}
		}
	}
}
