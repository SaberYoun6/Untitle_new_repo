public class DrSeuss{
	public static void main(String [] args){
		 OneFish obFish = new OneFish();
		 System.out.println(obFish.pageNumber(0));
		 obFish.setPage(1);
		 System.out.println(obFish.pageNumber(obFish.getPage()));
		 obFish.setPage(3); 
		 System.out.println(obFish.pageNumber(obFish.getPage()));

	}
}
class OneFish{
	public  static String cover = "One Fish Two Fish Red Fish, Blue Fish";
	private int page = 0;

	public void setPage(int page){
		this.page = page;
	}
	public int getPage(){
		return page; 
	}
	public String pageNumber(int page){
		String obj = "";
		if (page == 0){
			obj = "One fish, two fish, red fish, blue fish,";
		}else if (page ==1){
		       obj = "Black fish, Blue fish, Old fish, New fish.";
		}else if (page ==2){
			obj = "This one has a litle car.";
		}else if (page == 3){
		       obj = "This one has a little star.";
		} else if (page ==4){
			obj = "Say! What a lot of fish there are.";
		}else if {
			obj = "Yes. Some are red and some are blue.";
		}else if {
			obj = "Some are old and some are new.";
		}
		else if {
			obj = "Some are sad, and some are glad.";
		}else if {
			obj = "And some are very, very bad.";
		}else {
		
		}

		return obj;
	}
}

    

