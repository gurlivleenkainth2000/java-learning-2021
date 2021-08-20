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
	
	
	@Override
	public String toString() {
		return "[track=" + track + ", artist=" + artist + ", duration=" + duration + "]";
	}	

	void showSong() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(track + "\t" + artist + "\t" + duration);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}

}
