package com.smartapps.Localization2;

/**
 * Created by Maryanne on 03-06-2014.
 */
public class RFClass {


    /**********************************************************************
     ******************     RFClass for data to test     ******************
     *********************************************************************/


    private int rss;
    private String id;

    public RFClass(int rss, String id){
        this.rss = rss;
        this.id = id;
    }

    public int getRss() {
        return rss;
    }

    public void setRss(int rss) {
        this.rss = rss;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
