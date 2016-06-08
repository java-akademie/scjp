package ch.scjp.ch7.mailbox;

public class Mailbox
{
	String message = "xxx";
	boolean messageVorhanden;


	String getMessage()
	{
		String m = message;
		messageVorhanden = false;
		return m;
	}


	void setMessage(String message)
	{
		this.message = message;
		messageVorhanden = true;
	}

}
