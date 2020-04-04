import java.util.ArrayList;

public class Play extends Event{
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	
	public static ArrayList<Play> plays=new ArrayList<Play>();
	
	DataLoader dL=new DataLoader();
	
	Event event;
	
	public Play(String name, String time1, String time2, String description,String ratings){
		this.name=name;
		this.time1=time1;
		this.time2=time2;
		this.description=description;
		this.ratings=ratings;
	}
		
	
	
	public ArrayList<Play> getPlayList(){
		
		//dL.loadShows();
		for(int i=0;i<dL.SHOWLIST.length();i++) {
			if(DataConstants.SHOWLIST_TYPE.equalsIgnoreCase("play")) {
				plays.add(new Play(dL.SHOWLIST_NAME, dL.SHOWLIST_TIME1, dL.SHOWLIST_TIME2, dL.SHOWLIST_DESCRIPTION, dL.SHOWLIST_RATINGS));
			}
		
		}
		return plays;
	}

}
