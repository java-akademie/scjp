package ch.scjp.ch7.mailbox;

public class Consumer implements Runnable
{
	Mailbox mailbox;


	Consumer(Mailbox mailbox)
	{
		this.mailbox = mailbox;
	}


	@Override
	public void run()
	{
		String message = "";
		do
		{
			synchronized (mailbox)
			{
				while (!mailbox.messageVorhanden)
				{
					try
					{
						mailbox.wait();
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}

				message = mailbox.getMessage();
				mailbox.notifyAll();

				System.out.println(message);

			}
		}
		while (!message.equals("end-of-message"));

	}
}
