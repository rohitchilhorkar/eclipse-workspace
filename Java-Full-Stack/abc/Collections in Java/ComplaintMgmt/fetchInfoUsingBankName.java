package ComplaintMgmt;

public class fetchInfoUsingBankName extends ComplaintBook {
	
	fetchInfoUsingBankName(Complaints obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	void fetchUsingBankName(String bankName) {
		for(int i=0; i<complaintBook.size() ; i++) {
			Complaints row = complaintBook.get(i);
			
			if(row.getCompanyName().equals(bankName) && row != null) {
				System.out.println("Information fetched successfully using bank name!");
				displayComplaintInDetail(row);
			}else if(row == null) {
				System.out.println("Null Object in FetchBankName Class!");
			}
		}
	}

}
