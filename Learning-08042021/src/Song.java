
public class Song {
	
	static int idx;
	int index;
	
	String track;
	String artist;
	float duration;
	
	// Reference Variables
	Song nextSong;
	Song previousSong;
	
	Song() {}
	
	Song(String track, String artist, float duration) {
		index = idx;
		idx++;
		
		this.track = track;
		this.artist = artist;
		this.duration = duration;
	}
	
	

	@Override
	public String toString() {
		return "Song [index=" + index + ", track=" + track + ", artist=" + artist + ", duration=" + duration
				+ ", nextSong=" + nextSong + ", previousSong=" + previousSong + "]";
	}

	void showSong() {
		System.out.println("-------------------------------");
		System.out.println("["+ index + "] " + track + "\t" + artist + "\t" + duration);
		System.out.println("-------------------------------");
	}
}
