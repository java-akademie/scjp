package ch.scjp.ch7.mailbox;

public class MailboxTest
{

	static Mailbox mailbox = new Mailbox();


	public static void main(String[] args)
	{
		Consumer consumer1 = new Consumer(mailbox);
		Consumer consumer2 = new Consumer(mailbox);
		Producer producer1 = new Producer(mailbox, 1);
		Producer producer2 = new Producer(mailbox, 2);

		new Thread(consumer1).start();
		new Thread(producer1).start();
		new Thread(consumer2).start();
		new Thread(producer2).start();
	}

}
