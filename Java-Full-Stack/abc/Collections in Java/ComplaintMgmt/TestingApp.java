package ComplaintMgmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestingApp {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner s = new Scanner(new File("C:\\Users\\rdchi\\OneDrive\\Desktop\\complaints.csv"));
//		String line = s.nextLine();
//		String[] data = line.split(",");
//		int id=0;
//		Complaints c= new Complaints();
//		
//		while(s.hasNextLine()) {
//			line = s.nextLine();
//			data = line.split(",");			
//			System.out.println();
//			for(String a : data)
//				System.out.println(a);
//			
//			c.setDateReceived(data[0]);
//			c.setProductName(data[1]);
//			c.setSubProductName(data[2]);
//			c.setIssue(data[3]);
//			c.setSubIssue(data[4]);
//			c.setCompanyName(data[5]);
//			c.setStateName(data[6]);
//			c.setZipCode(data[7]);
//			c.setSubmittedVia(data[8]);
//			c.setDateSent(data[9]);
//			c.setCompanyResponse(data[10]);
//			c.setRespondedInTime(data[11]);
//			c.setConsumerDisputed(data[12]);
//			System.out.println(data[13]);
//			id = Integer.parseInt(data[13]);
//			c.setComplaintId(id);
//			
//			ComplaintBook newComplaintLog = new ComplaintBook(c);	
//		}
//		S.CLOSE();
		
		
		Path p = Path.of("C:\\Users\\rdchi\\OneDrive\\Desktop\\complaints.csv");
		try {
			Stream<String> allcontent = Files.lines(p);
			allcontent.forEach(line -> {
				System.out.println(line);
				});
			allcontent.close();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

