package ComplaintMgmt;

import java.util.ArrayList;

public class ComplaintBook extends Complaints {

	public ArrayList<Complaints> complaintBook = new ArrayList<>();
	
	ComplaintBook(Complaints obj){
		if(obj != null) {
			this.complaintBook.add(obj);
		}
		else {
			System.out.println("Object you passed is NULL, \nComplaintsBook -> line 14");
		}

	}
	
//	
	void fetchInfoUsingId(int id) {
		
	}
	
	void fetchInfoUsingYear(String dateReceived) {
		
	}
	public ArrayList<Complaints> getComplaintBook() {
		return complaintBook;
	}

	public void setComplaintBook(ArrayList<Complaints> complaintBook) {
		this.complaintBook = complaintBook;
	}
	
	
}
