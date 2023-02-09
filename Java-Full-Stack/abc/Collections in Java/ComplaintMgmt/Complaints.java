package ComplaintMgmt;

public class Complaints {

	private String dateReceived;
	private String productName;
	private String subProductName;
	private String issue;
	private String subIssue;
	private String companyName;
	private String stateName;
	private String zipCode;
	private String submittedVia;
	private String dateSent;
	private String companyResponse;
	private String respondedInTime;
	private String consumerDisputed;
	private int complaintId;
	
//	Default Constructor
	Complaints(){
		
	}
	
//	Parameterized Constructor
	public Complaints(String dateReceived, String productName, String subProductName, String issue, String subIssue,
			String companyName, String stateName, String zipCode, String submittedVia, String dateSent,
			String companyResponse, String respondedInTime, String consumerDisputed, int complaintId) {
		super();
		this.dateReceived = dateReceived;
		this.productName = productName;
		this.subProductName = subProductName;
		this.issue = issue;
		this.subIssue = subIssue;
		this.companyName = companyName;
		this.stateName = stateName;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSent = dateSent;
		this.companyResponse = companyResponse;
		this.respondedInTime = respondedInTime;
		this.consumerDisputed = consumerDisputed;
		this.complaintId = complaintId;
	}
	
	public void displayComplaintInDetail(Complaints obj) {
		
		System.out.println("Product Name: " + obj.getProductName());
		System.out.println("Company Name: " + obj.getCompanyName());
		System.out.println("State Name: " + obj.getStateName());
		System.out.println("Company Response: " + obj.getCompanyResponse());
		System.out.println("Issue: " + obj.getIssue());
		
	}
	public String getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSubProductName() {
		return subProductName;
	}
	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSubmittedVia() {
		return submittedVia;
	}
	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}
	public String getDateSent() {
		return dateSent;
	}
	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}
	public String getCompanyResponse() {
		return companyResponse;
	}
	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}
	public String isRespondedInTime() {
		return respondedInTime;
	}
	public void setRespondedInTime(String respondedInTime) {
		this.respondedInTime = respondedInTime;
	}
	public String isConsumerDisputed() {
		return consumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	
	
	
	
}
