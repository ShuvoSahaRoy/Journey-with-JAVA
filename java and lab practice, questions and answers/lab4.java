 class Date {
	int day;
	int month;
	int year;
	Date(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	void set(){
	
	}
	void get(){
		
	}
	void displayDate(){
		System.out.println(month+"/"+ day + "/" + year);
	}
	
}
public class lab4  {
	public static void main(String args[]){
	Date ob = new Date(13,1,2013);
	ob.displayDate();
}

}
