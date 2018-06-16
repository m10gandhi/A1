package Question3;

import java.util.ArrayList;

public class EmailSend {
	
	ProfitReport repoData = new ProfitReport(); 
	 ArrayList<String> list = repoData.getList();


	public void SendToEmail(String emailAddress)
	{
		try
		{
	    	StringBuilder builder = new StringBuilder();
	    	for (int i = 0; i < list.size(); i++)
	    	{
	    		builder.append(list.get(i) + "\n");
	    	}
	    	EmailSender sender = new EmailSender();
	    	sender.SendEmail(emailAddress, "Profit Report!", builder.toString());
		}
		catch (Exception e)
		{
			System.out.println("Yipes internet must be down!");
		}
	}
}
