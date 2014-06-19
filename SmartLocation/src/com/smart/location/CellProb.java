package com.smart.location;

import java.util.Comparator;

public class CellProb implements Comparable<CellProb>{


    /**********************************************************************
     ******************     CellProb Class for  highest probability     ******************
     *********************************************************************/


    private int id;
    private float probability;

    public CellProb(int id, float probability){
        this.id = id;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public float getProbability() {
        return probability;
    }


    public int compareTo(CellProb cell) {

        if( this.probability < cell.probability )return 1;
        if( this.probability > cell.probability)  return -1;
        return 0;

    }
    public static Comparator<CellProb> CellProbComparator
            = new Comparator<CellProb>() {

        public int compare(CellProb c1, CellProb c2) {

            if( c1.probability < c2.probability )return 1;
            if( c1.probability > c2.probability)  return -1;
            return 0;
        }

    };
    public String toString() {
        return "Cell: '" + this.getId()+ "',Probability: '" + this.probability;
    }
}
