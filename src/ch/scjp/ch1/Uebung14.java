package ch.scjp.ch1;

class Foo
{

    static int frequ = 10000;
    static int zaehler1;
    static int zaehler2;

    
    {
        if (zaehler1 % frequ == 0)
        {
            System.out.println("new .. " + (zaehler1 + 1)
                    + "   finalize: " + zaehler2);
        }
        zaehler1++;
    }

    int[] ia = new int[100000];

    /**
     * finalize wird immer dann aufgerufen, wenn der Garbage Collector das
     * Object zerst�rt.
     */
    @Override
    protected void finalize()
    {

        if (zaehler2 % frequ == 0)
        {
            System.out.println("finalize: " + (zaehler2 + 1) + "new: "
                    + zaehler1);
        }
        zaehler2++;
    }

}

/**
 * Test Garbage Collector.
 *
 * @author johann
 *
 */
public class Uebung14
{

    public static void main(String[] args)
    {
        long max = (long) Math.pow(10, 6);

        for (long i = 0; i < max; i++)
        {
            new Foo();
        }
    }

}
