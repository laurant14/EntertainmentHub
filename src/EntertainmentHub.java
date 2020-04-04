import java.util.ArrayList;

public class EntertainmentHub {
	Venue venue=new Venue();
	//Movie movie=new Movie();
	
	public EntertainmentHub() {
		
	}
	
	public void getMovies() {
		for(int i=0;i<Movie.movies.size();i++) {
			System.out.println(Movie.movies.get(i));
		}
	}
	
	public void getPlays() {
		for(int i=0;i<Play.plays.size();i++) {
			System.out.println(Play.plays.get(i));
		}
	}
	
	public void getConcerts(){
		for(int i=0;i<Concerts.concerts.size();i++) {
			System.out.println(Concerts.concerts.get(i));
		}
	}

	public ArrayList<Show> getMovieShows(String movieName, Venue venue){
		venue.getShowing(movieName);
		return null;
	}
	public Movie getMovie(String movieName) {
		return null;
	}
}
