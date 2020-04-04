import java.util.ArrayList;


public class Theater extends Show{
	
<<<<<<< HEAD
	public Theater(String username, int stars, String comment) {
		super(username, stars, comment);
=======
	public Theater(String showType, String showName, String showTime1, String showTime2, String description, String ratings) {
		super(showType, showName, showTime1, showTime2, description, ratings);
>>>>>>> 7fc234a1c2192554a1739d78f71deddc6ce6dd3f
		// TODO Auto-generated constructor stub
	}


	ArrayList<Show> showList=new ArrayList<Show>();
	
	
	public Show getShows() {
		for(int i=0;i<showList.size();i++) {
			return showList.get(i);//why isn't it returning type show when the arrayList is of type show?
		}
		return getShows();
	}
	
	public ArrayList<Show> getShows(String movieName) {
		ArrayList<Show> shows=new ArrayList<Show>();
		 {
			for(int i=0;i<showList.size();i++) {
				if(showList.get(i).getEvent().getName().equals(movieName)) {
					shows.add(showList.get(i));
			}
		}
		return shows;
	}
	
	

}
}
