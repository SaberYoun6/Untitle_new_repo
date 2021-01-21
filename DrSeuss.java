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
		switch (page){
			case  0:
			obj = "One fish, two fish, red fish, blue fish,";
			break;
		case 1:
		       obj = "Black fish, Blue fish, Old fish, New fish.";
		       break;
		case 2:
			obj = "This one has a litle car.";
			break;
		case 3:
		       obj = "This one has a little star.";
		       break;
		case 4:
			obj = "Say! What a lot of fish there are.";
			break;
		case 5:
			obj = "Yes. Some are red and some are blue.";
			break;
		case 6:
			obj = "Some are old and some are new.";
			break;
		case 7:
			obj = "Some are sad, and some are glad.";
			break;
		case 8:
			obj = "And some are very, very bad.";
			break;
		case 9:
			obj = "Why are they sad and glad and bad?";
			break;
		case 10:
			obj = "I do not know, go ask your dad.";
			break;
		case 11: 
			obj = "Some are thin, and some are fat.";
			break;
		
		default: 
			obj = "The End";
			break;
		}

		return obj;
	}
}

    

