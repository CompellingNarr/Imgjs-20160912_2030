package com.cn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String xmlPathname = "/data/xml/cn_rss_raw-news.washpost.world-20160913.0037.13.xml";
        System.out.println( "Hello World!" );

        StaxXMLParser sxp = new StaxXMLParser(xmlPathname);
    }
}
