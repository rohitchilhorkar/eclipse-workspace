package ComplaintMgmt;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TimeTakenToSettleComplaint extends ComplaintBook{

	TimeTakenToSettleComplaint(Complaints obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
	void timeForSettlingComplaint(int complaintId) throws ParseException {
		
		
			for(int i=0; i<complaintBook.size() ; i++) {
					
				Complaints row = complaintBook.get(i);
			
				if(row.getComplaintId() == complaintId && row != null) {				
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
				Date firstDate = (Date) sdf.parse(row.getDateReceived());
				Date secondDate = (Date) sdf.parse(row.getDateSent());
				
				long diffInMinutes = Math.abs(secondDate.getTime() - firstDate.getTime());
				long diff = TimeUnit.DAYS.convert(diffInMinutes, TimeUnit.MILLISECONDS);							
				
			}else if(row == null) {
				System.out.println("Null Object in FetchBankName Class!");
			}
		}
	}

	

}
