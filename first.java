// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * This is a test class to learn stride
 */
public class first
{
    private int foo = 1;

    /**
     * Constructor for objects of class first
     */
    public first(int test)
    {
        foo = test;
    }

    /**
     * Simple addition
     */
    public int doit(int parm)
    {
        int c = 0;
        while (c <= 100) {
            c = c + 1;
        }
        return parm * foo;
    }

    /**
     * Second method
     */
    public int method2(int foo)
    {
        int b = 0;
        switch (foo) {
            case 1 : {
                b = b + 1;
                break;
            }
            case 0 : {
                b = b * b;
                break;
            }
            default : {
                b = - 1;
            }
        }
        return b;
    }
}
