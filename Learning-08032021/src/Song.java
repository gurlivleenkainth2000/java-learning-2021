
public class Song {
	String track;
	String artist;
	float duration;
	
	// Reference Variables
	Song nextSong;
	Song previousSong;
	
	Song() {}
	
	Song(String track, String artist, float duration) {
		this.track = track;
		this.artist = artist;
		this.duration = duration;
	}
	
	
//	@Override
//	public String toString() {
//		return "Song [track=" + track + ", artist=" + artist + ", duration=" + duration + ", nextSong=" + nextSong
//				+ ", previousSong=" + previousSong  + "]";
//	}

	void showSong() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(track + "\t" + artist + "\t" + duration);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
}
