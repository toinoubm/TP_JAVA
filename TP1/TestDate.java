

public class TestDate {

	public static void main ( String []args) {
		Date date= new Date();
		date.lire_Date();
		System.out.println(date.toString());
		/*Date tmp= new Date();
		tmp=date;
		
		for(int i=0;i<2;i++) {
			Date date1= new Date();
			date1.lire_Date();
			if(date1.compareToDate(tmp)==-1)
				tmp=date1;
			System.out.println(tmp.toString());
			
		}
	}
	*/
	Date date2=date.dateDeLaVeille();
	System.out.println(date2.toString());
	}
}
