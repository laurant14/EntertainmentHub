import java.util.ArrayList;


public class Theater extends Show{
	
	ArrayList<Show> showList=new ArrayList<Show>();
	
	
	public Show getShows() {
		for(int i=0;i<showList.size();i++) {
			return showList.get(i);//why isn't it returning type show when the arrayList is of type show?
		}
		return getShows();
	}
	
	

}
