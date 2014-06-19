package com.smart.location;

import java.util.Comparator;

public class RFClass implements Comparable<RFClass>{


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

    public int compareTo(RFClass ap) {

        if( this.rss < ap.rss )return 1;
        if( this.rss > ap.rss)  return -1;
        return 0;

    }
    public static Comparator<RFClass> RFClassComparator
            = new Comparator<RFClass>() {

        public int compare(RFClass ap1, RFClass ap2) {

            if( ap1.rss < ap2.rss )return 1;
            if( ap1.rss > ap2.rss)  return -1;
            return 0;
        }

    };

    public String toString() {
        return "Mac ID: '" + this.getId() + "',RSSI: '" + this.getRss();
    }

}
