package ch.scjp.ch7.mailbox;

public class Producer implements Runnable
{
	Mailbox mailbox;
	int nummernKreis;


	Producer(Mailbox mailbox, int nummernKreis)
	{
		this.mailbox = mailbox;
		this.nummernKreis = nummernKreis;
	}


	@Override
	public void run()
	{

		for (int i = 1; i <= 100; i++)
		{
			synchronized (mailbox)
			{
				while (mailbox.messageVorhanden)
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

				mailbox.setMessage("message_" + nummernKreis + i);
				mailbox.notifyAll();
			}
		}

		synchronized (mailbox)
		{
			while (mailbox.messageVorhanden)
			{
				try
				{
					mailbox.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}


				mailbox.setMessage("end-of-message");
				mailbox.notifyAll();
			}
		}
	}
}
