package ComplaintMgmt;

public class FetchId extends ComplaintBook {		

		FetchId(Complaints obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		}		
		
		void fetchInfoUsingId(int id) {
		System.out.println("Information of Complaint with id: " + id );
		for(int i=0; i<complaintBook.size() ; i++) {
			Complaints row = complaintBook.get(i);
			
			if(row.getComplaintId() == id && row != null) {
				displayComplaintInDetail(row);
			}else if(row == null) {
				System.out.println("Null Object in FetchId Class!");
			}
		}
	}
}
