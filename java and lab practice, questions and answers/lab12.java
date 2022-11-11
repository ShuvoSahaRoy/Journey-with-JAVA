class rectangle{
	int length=1;
	int width=1;
	void get(){
		int area=length*width;
		System.out.println("area= "+area);
		int peremeter=2*width*length;
		System.out.println("peremeter= "+peremeter);
		
	}
	void set(int l,int w)
	{
		
		if(l<=20 && l>0 && w<=20 && w>0)
			{int area=l*w;
		System.out.println("area= "+area);
		int peremeter=l*2*w;
		System.out.println("peremeter= "+peremeter);
			}
		
		else
			get();
			
	
	}
	

}
public class lab12 {
	public static void main(String args[]){
		rectangle ob=new rectangle();
		ob.set(2,22);
	}

}
