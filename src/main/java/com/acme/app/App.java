package com.acme.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public String getCaption() {
        return "Hello World!";
    }

    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( app.getCaption() );
    }
}
