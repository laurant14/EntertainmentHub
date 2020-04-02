import java.util.ArrayList;


public class Theater extends Show{
	
	public Theater(String showType, String showName, String showTime1, String showTime2, String description, String ratings) {
		super(showType, showName, showTime1, showTime2, description, ratings);
		// TODO Auto-generated constructor stub
	}


	ArrayList<Show> showList=new ArrayList<Show>();
	
	
	public Show getShows() {
		for(int i=0;i<showList.size();i++) {
			return showList.get(i);//why isn't it returning type show when the arrayList is of type show?
		}
		return getShows();
	}
	
	

}
