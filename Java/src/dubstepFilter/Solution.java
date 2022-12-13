package dubstepFilter;

public class Solution {
	  public static String SongDecoder(String song)
	  {
	     return song.replace("(WUB)+", " ").trim();
	  }
	  
	  public static void main(String[] args) {
		System.out.println(SongDecoder("RWUBWUBWUBLWUB"));  
	  }
}
