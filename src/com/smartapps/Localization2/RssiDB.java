package com.smartapps.Localization2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



/**
 * Created by Maryanne on 22-05-2014.
 */
public class RssiDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2; //update when changing

    public static final String COLUMN_ID="_id";
    private static final String DATABASE_NAME = "rssivalues.db";

    //Table names
    /*
    public static final String TABLE_C1_TEST = "Cell1";
    public static final String TABLE_C2_TEST = "Cell2";
    public static final String TABLE_C3_TEST = "Cell3";
    public static final String TABLE_C4_TEST = "Cell4";
    public static final String TABLE_C5_TEST = "Cell5";
    public static final String TABLE_C6_TEST = "Cell6";
    public static final String TABLE_C7_TEST = "Cell7";
    public static final String TABLE_C8_TEST = "Cell8";
    public static final String TABLE_C9_TEST = "Cell9";
    public static final String TABLE_C10_TEST = "Cell10";
    public static final String TABLE_C11_TEST = "Cell11";
    public static final String TABLE_C12_TEST = "Cell12";
    public static final String TABLE_C13_TEST = "Cell13";
    public static final String TABLE_C14_TEST = "Cell14";
    public static final String TABLE_C15_TEST = "Cell15";
    public static final String TABLE_C16_TEST = "Cell16";
    public static final String TABLE_C17_TEST = "Cell17";
*/
    public static final String TABLE_MAC_VALUES = "MACV";


    public static final String TABLE_C1_TRAINING = "TrainCell1";
    public static final String TABLE_C2_TRAINING = "TrainCell2";
    public static final String TABLE_C3_TRAINING = "TrainCell3";
    public static final String TABLE_C4_TRAINING = "TrainCell4";
    public static final String TABLE_C5_TRAINING = "TrainCell5";
    public static final String TABLE_C6_TRAINING = "TrainCell6";
    public static final String TABLE_C7_TRAINING = "TrainCell7";
    public static final String TABLE_C8_TRAINING = "TrainCell8";
    public static final String TABLE_C9_TRAINING = "TrainCell9";
    public static final String TABLE_C10_TRAINING = "TrainCell10";
    public static final String TABLE_C11_TRAINING = "TrainCell11";
    public static final String TABLE_C12_TRAINING = "TrainCell12";
    public static final String TABLE_C13_TRAINING = "TrainCell13";
    public static final String TABLE_C14_TRAINING = "TrainCell14";
    public static final String TABLE_C15_TRAINING = "TrainCell15";
    public static final String TABLE_C16_TRAINING = "TrainCell16";
    public static final String TABLE_C17_TRAINING = "TrainCell17";


    //Atributtes
    public static final String RSSI_VALUE = "rssiVal";
    public static final String SSID_VALUE = "ssidVal";
    public static final String PROBABILITY = "probVal";


    //Instructions to create tables

    private static final String CREATE_ALL_MAC_VALUES =
            "create table "+ TABLE_MAC_VALUES + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null);";


    /*************************************************************************
     *****************************    TESTING   ******************************
     *************************************************************************/
/*
    private static final String C1_CREATE_TEST =
            "create table "+ TABLE_C1_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";


    private static final String C2_CREATE_TEST =
            "create table "+ TABLE_C2_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C3_CREATE_TEST =
            "create table "+ TABLE_C3_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C4_CREATE_TEST =
            "create table "+ TABLE_C4_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C5_CREATE_TEST =
            "create table "+ TABLE_C5_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C6_CREATE_TEST =
            "create table "+ TABLE_C6_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C7_CREATE_TEST =
            "create table "+ TABLE_C7_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C8_CREATE_TEST =
            "create table "+ TABLE_C8_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C9_CREATE_TEST =
            "create table "+ TABLE_C9_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C10_CREATE_TEST =
            "create table "+ TABLE_C10_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C11_CREATE_TEST =
            "create table "+ TABLE_C11_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C12_CREATE_TEST =
            "create table "+ TABLE_C12_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C13_CREATE_TEST =
            "create table "+ TABLE_C13_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C14_CREATE_TEST =
            "create table "+ TABLE_C14_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C15_CREATE_TEST =
            "create table "+ TABLE_C15_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C16_CREATE_TEST =
            "create table "+ TABLE_C16_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C17_CREATE_TEST =
            "create table "+ TABLE_C17_TEST + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
                    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";
*/

    /*************************************************************************
     ****************************     TRAINING   *****************************
     *************************************************************************/



    private static final String C1_CREATE_TRAINING =
            "create table "+ TABLE_C1_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null);";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C2_CREATE_TRAINING =
            "create table "+ TABLE_C2_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C3_CREATE_TRAINING =
            "create table "+ TABLE_C3_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C4_CREATE_TRAINING =
            "create table "+ TABLE_C4_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C5_CREATE_TRAINING =
            "create table "+ TABLE_C5_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C6_CREATE_TRAINING =
            "create table "+ TABLE_C6_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C7_CREATE_TRAINING =
            "create table "+ TABLE_C7_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C8_CREATE_TRAINING =
            "create table "+ TABLE_C8_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C9_CREATE_TRAINING =
            "create table "+ TABLE_C9_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C10_CREATE_TRAINING =
            "create table "+ TABLE_C10_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C11_CREATE_TRAINING =
            "create table "+ TABLE_C11_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C12_CREATE_TRAINING =
            "create table "+ TABLE_C12_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C13_CREATE_TRAINING =
            "create table "+ TABLE_C13_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C14_CREATE_TRAINING =
            "create table "+ TABLE_C14_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C15_CREATE_TRAINING =
            "create table "+ TABLE_C15_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C16_CREATE_TRAINING =
            "create table "+ TABLE_C16_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";

    private static final String C17_CREATE_TRAINING =
            "create table "+ TABLE_C17_TRAINING + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    SSID_VALUE + " text not null, "+
                    RSSI_VALUE + " integer not null, " +
                    PROBABILITY + " real not null );";
    //"foreign key ("+SSID_VALUE+") references "+TABLE_MAC_VALUES+"("+SSID_VALUE+"));";





    /*************************************************************************
     *****************************   Le début   ******************************
     *************************************************************************/

    public RssiDB(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    /*
     * Creates all tables
    */
    public void onCreate(SQLiteDatabase database) {
//
//        database.execSQL(C1_CREATE_TEST);
//        database.execSQL(C2_CREATE_TEST);
//        database.execSQL(C3_CREATE_TEST);
//        database.execSQL(C4_CREATE_TEST);
//        database.execSQL(C5_CREATE_TEST);
//        database.execSQL(C6_CREATE_TEST);
//        database.execSQL(C7_CREATE_TEST);
//        database.execSQL(C8_CREATE_TEST);
//        database.execSQL(C9_CREATE_TEST);
//        database.execSQL(C10_CREATE_TEST);
//        database.execSQL(C11_CREATE_TEST);
//        database.execSQL(C12_CREATE_TEST);
//        database.execSQL(C13_CREATE_TEST);
//        database.execSQL(C14_CREATE_TEST);
//        database.execSQL(C15_CREATE_TEST);
//        database.execSQL(C16_CREATE_TEST);
//        database.execSQL(C17_CREATE_TEST);

        database.execSQL(CREATE_ALL_MAC_VALUES);

        database.execSQL(C1_CREATE_TRAINING);
        database.execSQL(C2_CREATE_TRAINING);
        database.execSQL(C3_CREATE_TRAINING);
        database.execSQL(C4_CREATE_TRAINING);
        database.execSQL(C5_CREATE_TRAINING);
        database.execSQL(C6_CREATE_TRAINING);
        database.execSQL(C7_CREATE_TRAINING);
        database.execSQL(C8_CREATE_TRAINING);
        database.execSQL(C9_CREATE_TRAINING);
        database.execSQL(C10_CREATE_TRAINING);
        database.execSQL(C11_CREATE_TRAINING);
        database.execSQL(C12_CREATE_TRAINING);
        database.execSQL(C13_CREATE_TRAINING);
        database.execSQL(C14_CREATE_TRAINING);
        database.execSQL(C15_CREATE_TRAINING);
        database.execSQL(C16_CREATE_TRAINING);
        database.execSQL(C17_CREATE_TRAINING);
        insertData(database);

    }




    /*
     * Drops all tables and create new ones
     */
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.w(RssiDB.class.getName(),
                "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
//
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C1_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C2_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C3_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C4_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C5_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C6_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C7_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C8_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C9_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C10_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C11_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C12_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C13_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C14_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C15_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C16_TEST);
//        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C17_TEST);

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_MAC_VALUES);

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C1_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C2_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C3_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C4_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C5_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C6_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C7_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C8_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C9_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C10_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C11_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C12_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C13_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C14_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C15_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C16_TRAINING);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_C17_TRAINING);

        onCreate(db);

    }

    private void insertTrainingData(SQLiteDatabase db){

        ContentValues values = new ContentValues();

    }



    private void insertData(SQLiteDatabase db){

        ContentValues values = new ContentValues();

        /*
                -40	 1c:aa:07:7b:28:06
                -67	 1c:aa:07:7b:37:d6
                -42	 1c:aa:07:7b:28:04
                -79	 00:1b:90:76:ce:14
                -79	 00:1b:90:76:ce:14
                -79	 00:1b:90:76:ce:14

        values.put(RssiDB.RSSI_VALUE, "-67");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.PROBABILITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);
        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-42");
        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.PROBABILITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);
        values = new ContentValues();

        values.put(RssiDB.RSSI_VALUE, "-83");
        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.PROBABILITY, "1");
        db.insert(RssiDB.TABLE_C1_TEST, null, values);
        values = new ContentValues();
        */


        /******************************************************************************/
        /*****************************   MAC IDs   ************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();


        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();







       // values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

      //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        // values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();




        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();



        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //   values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();



        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();





        //   values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();

        //+  values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        db.insert(RssiDB.TABLE_MAC_VALUES, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*****************************    CELL 1   ************************************/
        /******************************************************************************/
        /******************************************************************************/


        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "5.77168614834282E-07");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "3.28670764303345E-06");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "1.64172853288354E-05");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "7.19322295388541E-05");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "0.000276457006121763");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "0.000931995002098505");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "0.00275601432197968");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "0.00714876894698382");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "0.0162653328460803");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "0.03246209564585");
        db.insert(RssiDB.TABLE_C1_TRAINING, null, values);
        values = new ContentValues();





        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 2  ************************************/
        /******************************************************************************/
        /******************************************************************************/




        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "1.67449051634921E-201");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "8.89324953156251E-195");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "3.62474917816723E-188");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "1.13379656771798E-181");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();


        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "2.72164835136907E-175");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "5.01381818976361E-169");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "7.08834500386842E-163");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "7.69061036819057E-157");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "6.40348603636553E-151");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "4.09177571554974E-145");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "2.00653560344512E-139");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "7.55129811142055E-134");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "2.18090153083667E-128");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "4.83381689024256E-123");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "8.22212411715843E-118");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "1.07329117357779E-112");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "1.07520378195532E-107");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "8.26615804874033E-103");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "4.87704005104847E-98");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "2.20825201526211E-93");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "7.67327291058336E-89");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "2.04622011704604E-84");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "4.18758611657004E-80");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "6.57680323013796E-76");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "7.92694129043897E-72");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "7.33223086465424E-68");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "5.20482720483653E-64");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "2.83541215649399E-60");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "1.18540232322279E-56");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "3.80325151618547E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "9.36448753827578E-50");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "1.76950861346059E-46");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "2.56602593741002E-43");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "2.85567709931923E-40");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "2.43891604961885E-37");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "1.59854291676537E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "8.04065531420966E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "3.10383256932361E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "9.19485368218454E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "2.09040798367082E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "3.64717820586184E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "4.88340348323712E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "5.01796848256259E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "3.95706282768843E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "2.39473608435233E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "1.11219788985202E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "3.96411432657423E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.08430128293802E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "2.27611115911922E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "3.66671082216584E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "4.53314435054653E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "4.30092761060665E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "0.000313158650732021");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "0.00174987243288574");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "0.00750391768923906");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "0.0246950227026518");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "0.0623692460143277");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "0.120884676873259");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "0.179809117695618");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "0.205254109927115");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "0.179809117695618");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "0.120884676873259");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "0.0623692460143277");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "0.0246950227026518");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "0.00750391768923906");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "0.00174987243288574");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "0.000313158650732021");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "4.30092761060665E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "4.53314435054653E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "3.66671082216584E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "2.27611115911922E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "1.08430128293802E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "3.96411432657423E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "1.11219788985202E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "2.39473608435233E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "3.95706282768843E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "5.01796848256259E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "4.88340348323712E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "3.64717820586184E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "2.09040798367082E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "9.19485368218454E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "3.10383256932361E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "8.04065531420966E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "1.59854291676537E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "2.43891604961885E-37");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "3.84797275332402E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "1.38361902734316E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "4.40212441311819E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "1.23927973580301E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "3.08700713622332E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "6.80404485079755E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "1.32696036528911E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "2.28986555258835E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "3.49641734279619E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "4.72386847060607E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "5.64720530738966E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "5.97352391173771E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "5.59099218398222E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "4.63029235370675E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "3.39304164443798E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "2.20004323797933E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "1.26221835580295E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "6.40765346150874E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "2.87822532407639E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "0.00011439625653903");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "0.000402309312139545");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "0.00125189990522711");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "0.00344699280680646");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "0.00839793283439238");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "0.0181036300359832");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "0.034531876894109");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "0.0582822019381398");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "0.0870388146427684");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "0.115014139252234");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "0.134477847342173");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "0.139127029502579");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "0.127360139453218");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "0.103161295750004");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "0.0739369106305819");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "0.0468885778926957");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "0.0263108010746549");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "0.013063583644597");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "0.00573920633640308");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "0.00223101554580351");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "0.000767387292633754");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "0.000233554295599984");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "6.28959041460413E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "1.49871177352887E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "3.15991297853036E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "5.8951298484525E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "9.73134517601641E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "1.4213912207619E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.83702737908571E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "2.10077179855997E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "2.12570687652471E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "1.90322058106379E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "1.50777355741048E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "1.05692548270388E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "6.55562140380616E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "3.5978628929152E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "1.74717579001612E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "7.50740501849608E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "2.85433102882772E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "9.60240634776375E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "2.85836095561938E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "7.52861885093885E-26");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "1.75458656618723E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "3.61822473464124E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "6.60203048986554E-31");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "1.06591055402375E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "1.52273821921356E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "1.92482381470412E-36");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "2.15287080107536E-38");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "2.13062098906616E-40");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "1.86575959463818E-42");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "1.44566083486766E-44");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "9.91147743385468E-47");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "6.01272895241072E-49");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "3.22749892405251E-51");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "1.53292827455787E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "6.44226837009852E-56");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "2.39561508735925E-58");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "7.88236453471102E-61");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "2.29486552180842E-63");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "5.91179295611712E-66");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "1.34754240145139E-68");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "2.71785893902311E-71");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "4.85034504446535E-74");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "7.65913290970553E-77");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "1.07015781289759E-79");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "5.12481021735922E-28");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "2.90776529427042E-26");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "1.43650726961022E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "6.17907156887092E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "2.31422478576585E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "7.54665981922227E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "2.14274714304866E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "5.29729298316592E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "1.14026023814161E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "2.13708051697616E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "3.48742364330554E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "4.9551345082007E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "6.1301782986063E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "6.60324912581598E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "6.19311545840395E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "5.0574033121476E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "3.59594398948299E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "2.22620506396647E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "1.20000852676825E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "5.63210075573118E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "0.000230156591356981");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "0.000818923504571961");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "0.00253705670169526");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "0.00684358914336481");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "0.0160732833828902");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "0.0328694314896471");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "0.058525711396273");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "0.0907335969721921");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "0.122477545015965");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "0.143950021832947");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "0.147310571855378");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "0.131257163157532");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "0.101830770488521");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "0.0687863022742995");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "0.0404568267559391");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "0.0207180361038622");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "0.00923787908060258");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "0.00358643429533541");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "0.00121232874401625");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "0.000356816429949589");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "9.1439996953736E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "2.04030211642591E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "3.96387248509797E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "6.70520079796345E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "9.87576663197001E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "1.26647542644696E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "1.4141309718155E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.37483132443596E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "1.16379401922265E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "8.57767804299682E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "5.50465720981279E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "3.07579747080244E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "1.49641519476109E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "6.3388927120571E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "2.33798441037303E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "7.50821566211674E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "2.09941736016315E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "5.11125734282237E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "1.08348681003823E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "1.99979937319175E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "3.21378000931808E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "4.49689533944165E-31");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "5.47868502046638E-33");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "5.81174838375409E-35");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "5.36789722489965E-37");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "4.31686531144578E-39");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "3.02273255240966E-41");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "1.8428834307376E-43");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "9.7827943830396E-46");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "4.5216287711655E-48");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "1.81967487885812E-50");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "6.37616597447124E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "1.94532579316775E-55");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "5.16763694881449E-58");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "1.19524947696293E-60");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "2.4070884430283E-63");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "4.22077742513205E-66");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "6.44406292015319E-69");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "8.56631443043321E-72");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "9.91505592858657E-75");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "9.99224889303083E-78");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "8.76795346009195E-81");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "6.69884835509366E-84");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "4.45624412996497E-87");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "2.58109935059055E-90");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "5.25297236795298E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "6.72993221943338E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "5.07803460513112E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "2.25662821517831E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "5.9061403582528E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "0.000910388798211057");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "0.00826474462976607");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "0.044188714182433");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "0.139146626599403");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "0.258055661420846");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "0.281860029298847");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "0.181314687592338");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "0.068692903148269");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "0.0153274584805339");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "0.00201422423679578");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "0.000155892376774604");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "7.10593665013076E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "1.90764332076149E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "3.01614636719519E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "2.80858157116796E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "1.54028491646543E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "4.97501592365491E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "9.46383761139202E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "1.06027733097419E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "6.99602035806557E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "2.71870474342997E-28");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "6.22232107559117E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "8.38730007975551E-36");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "6.6584223220127E-40");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "3.1131488458186E-44");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "8.5725065511109E-49");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "1.39025721505495E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "1.32788933085769E-58");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "7.46978320197885E-64");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "2.47476237764086E-69");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "4.82879095673302E-75");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "5.549101853926E-81");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "3.75566096200304E-87");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "1.49702638701948E-93");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "3.51440592812161E-100");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "4.85907701072022E-107");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "3.95671740580816E-114");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "1.89756069778381E-121");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "5.35964113729296E-129");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "8.91569368172878E-137");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "8.73481996207918E-145");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "5.04001894465405E-153");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.71273341892643E-161");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "3.42788912791004E-170");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "4.04057482256026E-179");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "2.80503918196619E-188");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "1.14686976264048E-197");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "2.76165017905779E-207");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "3.91654048078674E-217");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "3.27126680075352E-227");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "1.60919511114624E-237");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "4.66209194949676E-248");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "7.95485663383028E-259");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "7.99398393497051E-270");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "4.73122473004293E-281");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "1.64916183304339E-292");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "3.38557442418298E-304");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "4.09336855920307E-316");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "1.65357585319008E-75");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "4.62129016214831E-73");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "1.17465542479196E-70");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "2.71560046320535E-68");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "5.70991172464793E-66");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "1.09194571587169E-63");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "1.89924432760213E-61");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "3.00447615691162E-59");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "4.32279679061644E-57");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "5.65677641446535E-55");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "6.73257718773683E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "7.28788990935679E-51");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "7.17514035011965E-49");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "6.42491123817276E-47");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "5.23253326975688E-45");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "3.87583249219299E-43");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "2.61111581177904E-41");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "1.59990945422386E-39");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "8.91605645000785E-38");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "4.51916656665273E-36");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "2.083301001903E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "8.73481741459551E-33");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "3.33091671940374E-31");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "1.15526562816954E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "3.64424917964342E-28");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "1.04554423503357E-26");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "2.72825458289534E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "6.47493644119998E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "1.39763658573773E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "2.74385493000817E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "4.89932405954882E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "7.95644969044042E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "1.17519682758184E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "1.57873789793372E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "1.92893499881782E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "2.14354836169986E-14");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "2.16649212208142E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "1.99154019735335E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "1.66505726239234E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "1.26612739454794E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "8.75656492047901E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "5.50805505855886E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "3.15116328973701E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "1.63965198309332E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "7.75962231760062E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "3.33993198544033E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "1.30750331000623E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "4.65539038915285E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "0.000150757021659597");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "0.000444024697342014");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "0.00118944629938441");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "0.00289794865597821");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "0.00642162097400311");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "0.0129421606046245");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "0.0237234057000049");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "0.0395508135774735");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "0.0599710899217687");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "0.0827059199493466");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "0.103738361981523");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "0.118345108016763");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "0.122791800968403");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "0.115876818436669");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "0.0994562065799678");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "0.0776381812636165");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "0.0551222517680198");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "0.0355948102593443");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "0.0209052106824565");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "0.0111668465894276");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "0.00542518666438232");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "0.00239721483088606");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "0.000963401594686228");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "0.000352140438286071");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "0.000117066483941481");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "3.53962605665053E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "9.73397725047049E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "2.43462123117233E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "5.53835280338996E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "1.14587690130203E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "2.15627152054497E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "3.69043077654129E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "5.7445870466101E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "8.13296119961608E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "1.04724120275072E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "1.22645855188798E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "1.30637290859951E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "1.99161360887769E-178");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "2.30576335981799E-172");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "2.09286181324732E-166");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "1.48930122155373E-160");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "8.30884599389989E-155");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "3.63425205430482E-149");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "1.24625109123854E-143");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "3.35052012046399E-138");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");

        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "7.06211980240045E-133");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "1.16700872445652E-127");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "1.51192168706459E-122");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "1.53567976620002E-117");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "1.22289226875362E-112");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "7.6346988017104E-108");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "3.73690269051042E-103");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "1.43399567419809E-98");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "4.3141979216921E-94");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "1.01757976207741E-89");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "1.88171145394258E-85");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "2.7280590564941E-81");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "3.100778031395E-77");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "2.76314554257547E-73");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "1.93042536451501E-69");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "1.05734920052134E-65");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "4.54046193291222E-62");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "1.52861391370808E-58");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "4.03470465500162E-55");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "8.34914228199549E-52");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "1.35452849808166E-48");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "1.72286243899379E-45");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "1.71802401697825E-42");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "1.34314849664261E-39");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "8.23256183936239E-37");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "3.95605339479839E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "1.49040898253621E-31");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "4.40215110512244E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "1.0193905514613E-26");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "1.85068469627944E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "2.63414959529422E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "2.93944005879711E-20");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "2.57160909700068E-18");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "1.7638492714447E-16");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "9.48493061795941E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "3.99873863192228E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "1.3216852709457E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "3.42491071038641E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "6.95803531748417E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.10825621552384E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "1.3839165220572E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "1.35486425329425E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "0.000103991500924765");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "0.000625771932731929");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "0.00295223201496563");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "0.0109194575085643");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "0.0316641483395246");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "0.0719864458574946");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "0.128306844442853");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "0.1792937241116");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "0.196424892284905");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "0.168711284109549");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "0.113607737251247");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "0.0599774311290606");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "0.0248246985298603");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "0.00805557002616345");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "0.00204939061523476");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "0.000408760931956023");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "6.39190320832313E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "7.83622993546569E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "7.53182678204587E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "5.67557213554502E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "3.35301227947575E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "1.55301915254156E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "5.63942273925208E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "1.60549390923451E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "3.58342933969402E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "6.27054371368694E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "8.60256031104689E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "9.25265617069628E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "7.8022757240918E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "5.15813061421019E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "2.67349605904394E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "1.0863829300056E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "3.46100709481627E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "8.64446694125333E-35");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "1.69273945765508E-37");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "6.3933563124762E-263");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "2.18207947850096E-246");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "2.15222680703641E-230");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "6.13453040721007E-215");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "5.05301312254541E-200");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "1.20280533094969E-185");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "8.27401069658683E-172");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "1.64479822001574E-158");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "9.44898135891617E-146");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "1.56867571305452E-133");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "7.52587791106243E-122");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "1.04341477048572E-110");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "4.18054215853298E-100");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "4.84043118362971E-90");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "1.61961320291893E-80");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "1.56608158290166E-71");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "4.37616080156764E-63");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "3.53384890551825E-55");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "8.24666774356583E-48");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "5.56140897516513E-41");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "1.08384451750053E-34");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "6.10414655930096E-29");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "9.93479100050058E-24");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "4.67270467601619E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "6.35117014742598E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "2.49468075747892E-11");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "2.83173117640773E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "9.28891273604655E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "0.00088054906284771");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "0.0241222631580532");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "0.190967014428542");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "0.436892391341146");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "0.2888460413455");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "0.0551866680600278");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "0.00304703711061121");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "4.86180044298481E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "2.24177658986487E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "2.98719343412043E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "1.15029750539691E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "1.28006736490313E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "4.11653003567532E-22");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "3.82565292691922E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "1.02743808804909E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "7.97409804404722E-39");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "1.78847674072819E-45");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "1.15920657932579E-52");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "2.17127181000846E-60");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "1.17528546704303E-68");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "1.83843531348793E-77");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "8.31053832682873E-87");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "1.08563984781722E-96");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "4.09843649214081E-107");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "4.47122432883292E-118");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "1.40964749901294E-129");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "1.28431160305029E-141");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "3.38147439145338E-154");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "2.57286864854031E-167");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "5.65724441911687E-181");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "3.59474498063723E-195");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "6.60095914565563E-210");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "3.5028522506568E-225");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "5.37170815348423E-241");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "2.38055826177469E-257");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "3.04874454323398E-274");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "1.12833763164748E-291");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "1.20679339627311E-309");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "0");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "1.20859028930978E-165");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "9.9894462958414E-160");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "6.43028337035685E-154");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "3.22362998569893E-148");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "1.2585968525967E-142");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "3.8269648682097E-137");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "9.06251396775763E-132");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "1.67135722089723E-126");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "2.40058039295344E-121");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "2.6852801825103E-116");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "2.33931840862502E-111");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "1.58714077641263E-106");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "8.38625261427196E-102");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "3.45101471006361E-97");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "1.10599219010529E-92");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "2.76047418107988E-88");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "5.36588917034133E-84");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "8.12318018386804E-80");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "9.57716245835968E-76");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "8.79374771297552E-72");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "6.28836191439097E-68");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-79");
        values.put(RssiDB.PROBABILITY, "3.50209106715929E-64");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-78");
        values.put(RssiDB.PROBABILITY, "1.51895084939496E-60");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-77");
        values.put(RssiDB.PROBABILITY, "5.13081536395952E-57");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-76");
        values.put(RssiDB.PROBABILITY, "1.34975651229429E-53");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-75");
        values.put(RssiDB.PROBABILITY, "2.76535477492221E-50");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-74");
        values.put(RssiDB.PROBABILITY, "4.41237748729741E-47");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-73");
        values.put(RssiDB.PROBABILITY, "5.48303279694486E-44");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-72");
        values.put(RssiDB.PROBABILITY, "5.30634406957608E-41");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-71");
        values.put(RssiDB.PROBABILITY, "3.99941387850341E-38");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-70");
        values.put(RssiDB.PROBABILITY, "2.34759767898757E-35");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-69");
        values.put(RssiDB.PROBABILITY, "1.07319186783153E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-68");
        values.put(RssiDB.PROBABILITY, "3.8208277057936E-30");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-67");
        values.put(RssiDB.PROBABILITY, "1.05940962675468E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-66");
        values.put(RssiDB.PROBABILITY, "2.2876877952604E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-65");
        values.put(RssiDB.PROBABILITY, "3.84729931335321E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-64");
        values.put(RssiDB.PROBABILITY, "5.03896769715001E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-63");
        values.put(RssiDB.PROBABILITY, "5.13988678583446E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-62");
        values.put(RssiDB.PROBABILITY, "4.08311781583478E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-61");
        values.put(RssiDB.PROBABILITY, "2.52613554176845E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-60");
        values.put(RssiDB.PROBABILITY, "1.21716026651451E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-59");
        values.put(RssiDB.PROBABILITY, "4.5673602041823E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-58");
        values.put(RssiDB.PROBABILITY, "1.33477830738143E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-57");
        values.put(RssiDB.PROBABILITY, "3.03794142491164E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-56");
        values.put(RssiDB.PROBABILITY, "5.38488002127164E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-55");
        values.put(RssiDB.PROBABILITY, "7.43359757367149E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-54");
        values.put(RssiDB.PROBABILITY, "7.99187055345274E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-53");
        values.put(RssiDB.PROBABILITY, "6.69151128824427E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-52");
        values.put(RssiDB.PROBABILITY, "0.00043634134752288");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-51");
        values.put(RssiDB.PROBABILITY, "0.002215924205969");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-50");
        values.put(RssiDB.PROBABILITY, "0.00876415024678427");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-49");
        values.put(RssiDB.PROBABILITY, "0.026995483256594");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-48");
        values.put(RssiDB.PROBABILITY, "0.0647587978329459");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-47");
        values.put(RssiDB.PROBABILITY, "0.120985362259572");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-46");
        values.put(RssiDB.PROBABILITY, "0.17603266338215");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-45");
        values.put(RssiDB.PROBABILITY, "0.199471140200716");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-44");
        values.put(RssiDB.PROBABILITY, "0.17603266338215");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-43");
        values.put(RssiDB.PROBABILITY, "0.120985362259572");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-42");
        values.put(RssiDB.PROBABILITY, "0.0647587978329459");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-41");
        values.put(RssiDB.PROBABILITY, "0.026995483256594");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-40");
        values.put(RssiDB.PROBABILITY, "0.00876415024678427");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-39");
        values.put(RssiDB.PROBABILITY, "0.002215924205969");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-38");
        values.put(RssiDB.PROBABILITY, "0.00043634134752288");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-37");
        values.put(RssiDB.PROBABILITY, "6.69151128824427E-05");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-36");
        values.put(RssiDB.PROBABILITY, "7.99187055345274E-06");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-35");
        values.put(RssiDB.PROBABILITY, "7.43359757367149E-07");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-34");
        values.put(RssiDB.PROBABILITY, "5.38488002127164E-08");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-33");
        values.put(RssiDB.PROBABILITY, "3.03794142491164E-09");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-32");
        values.put(RssiDB.PROBABILITY, "1.33477830738143E-10");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-31");
        values.put(RssiDB.PROBABILITY, "4.5673602041823E-12");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-30");
        values.put(RssiDB.PROBABILITY, "1.21716026651451E-13");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-29");
        values.put(RssiDB.PROBABILITY, "2.52613554176845E-15");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-28");
        values.put(RssiDB.PROBABILITY, "4.08311781583478E-17");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-27");
        values.put(RssiDB.PROBABILITY, "5.13988678583446E-19");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-26");
        values.put(RssiDB.PROBABILITY, "5.03896769715001E-21");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-25");
        values.put(RssiDB.PROBABILITY, "3.84729931335321E-23");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-24");
        values.put(RssiDB.PROBABILITY, "2.2876877952604E-25");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-23");
        values.put(RssiDB.PROBABILITY, "1.05940962675468E-27");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-22");
        values.put(RssiDB.PROBABILITY, "3.8208277057936E-30");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-21");
        values.put(RssiDB.PROBABILITY, "1.07319186783153E-32");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-20");
        values.put(RssiDB.PROBABILITY, "2.34759767898757E-35");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-19");
        values.put(RssiDB.PROBABILITY, "3.99941387850341E-38");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-18");
        values.put(RssiDB.PROBABILITY, "5.30634406957608E-41");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-17");
        values.put(RssiDB.PROBABILITY, "5.48303279694486E-44");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-16");
        values.put(RssiDB.PROBABILITY, "4.41237748729741E-47");
        db.insert(RssiDB.TABLE_C2_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 3  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-100");
        values.put(RssiDB.PROBABILITY, "0.00268151757847585");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-99");
        values.put(RssiDB.PROBABILITY, "0.00356686638194492");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-98");
        values.put(RssiDB.PROBABILITY, "0.00467485631790708");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-97");
        values.put(RssiDB.PROBABILITY, "0.00603705216564929");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-96");
        values.put(RssiDB.PROBABILITY, "0.00768169083760894");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-95");
        values.put(RssiDB.PROBABILITY, "0.00963083526776597");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-94");
        values.put(RssiDB.PROBABILITY, "0.0118972426444088");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-93");
        values.put(RssiDB.PROBABILITY, "0.0144811788805401");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-92");
        values.put(RssiDB.PROBABILITY, "0.0173674777777008");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-91");
        values.put(RssiDB.PROBABILITY, "0.0205231878331541");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-90");
        values.put(RssiDB.PROBABILITY, "0.023896160275041");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-89");
        values.put(RssiDB.PROBABILITY, "0.0274148995859894");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-88");
        values.put(RssiDB.PROBABILITY, "0.0309899182798161");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-87");
        values.put(RssiDB.PROBABILITY, "0.0345167134372006");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-86");
        values.put(RssiDB.PROBABILITY, "0.0378803233419086");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-85");
        values.put(RssiDB.PROBABILITY, "0.0409612453760498");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-84");
        values.put(RssiDB.PROBABILITY, "0.0436423232542575");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-83");
        values.put(RssiDB.PROBABILITY, "0.0458160670441773");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-82");
        values.put(RssiDB.PROBABILITY, "0.0473917759826053");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-81");
        values.put(RssiDB.PROBABILITY, "0.0483018090587768");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE,  "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-80");
        values.put(RssiDB.PROBABILITY, "0.0485064000331196");
        db.insert(RssiDB.TABLE_C3_TRAINING, null, values);



































        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 4  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0674887081414848");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.440081658455375");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.164819155314002");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.125733202899241");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0671521889584274");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-39 ");
        values.put(RssiDB.PROBABILITY, "0.00964124402021214");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0628688083507678");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.0161119333689878");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0953156229493405");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-83 ");
        values.put(RssiDB.PROBABILITY, "0.109235574931191");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-41 ");
        values.put(RssiDB.PROBABILITY, "0.0103828781756131");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0677048705315961");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.566176862709809");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.401838137628205");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "0.566176862709809");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.401838137628205");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.283088431354908");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.200919068814099");
        db.insert(RssiDB.TABLE_C4_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 5  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-43 ");
        values.put(RssiDB.PROBABILITY, "0.0821780931718823");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-46 ");
        values.put(RssiDB.PROBABILITY, "0.0799481615284825");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-38 ");
        values.put(RssiDB.PROBABILITY, "0.0343887247507548");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-47 ");
        values.put(RssiDB.PROBABILITY, "0.0722770957039103");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-49 ");
        values.put(RssiDB.PROBABILITY, "0.0514810295651688");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0219418017774875");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0131804536288911");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.161773568633983");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.135245704215015");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.193504759803444");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-43 ");
        values.put(RssiDB.PROBABILITY, "0.00390203578352077");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-50 ");
        values.put(RssiDB.PROBABILITY, "0.164538818258417");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.172033624582489");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-42 ");
        values.put(RssiDB.PROBABILITY, "0.0957078524280973");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-38 ");
        values.put(RssiDB.PROBABILITY, "0.0621317508006597");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-47 ");
        values.put(RssiDB.PROBABILITY, "0.0449353477515982");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-42 ");
        values.put(RssiDB.PROBABILITY, "0.00983548177003572");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.171056931852423");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-49 ");
        values.put(RssiDB.PROBABILITY, "0.13865605412357");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0427406452237375");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.0648331478154528");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.172795559961008");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.127887855035626");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.114034845711916");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.0690555814877104");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.248478584039162");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.167293919976237");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.254698867513055");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.155333814192676");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0622240310413953");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.319865427934385");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.231938395138661");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.231938395138661");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.08842777206393");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.08842777206393");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.238503179109626");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.166398021757465");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.243930327098594");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0676523870874411");
        db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-89 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C5_TRAINING, null, values);
        values = new ContentValues();

        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 6  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0257990058484605");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.148622408677674");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.109114309531816");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.00798817230650537");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0880550322935652");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-61 ");
        values.put(RssiDB.PROBABILITY, "0.009763321707951");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.107622817247691");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-61 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.009763321707951");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.107622817247691");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0125270187570021");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.125118047943483");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.0993968764276046");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0108376605953937");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.112090922089237");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0906422976695171");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0257990058484606");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.148622408677674");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.109114309531815");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.0124965901593172");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.115133967972004");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.136580596998027");
        db.insert(RssiDB.TABLE_C6_TRAINING, null, values);
        values = new ContentValues();

        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 7  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.00234690471877834");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0242444970850168");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0813915501816734");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0518359604923162");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.00364899516116522");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-89 ");
        values.put(RssiDB.PROBABILITY, "0.012208844044921");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.0648707064147152");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.0718930704715129");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0123684481937593");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.00248924597187368");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0390401488026378");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0294799958650937");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.00221641135392575");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0243121538005085");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0820184013161137");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0625977092933026");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.00215971765837639");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0208252157844464");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-55 ");
        values.put(RssiDB.PROBABILITY, "0.0760300440467769");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0682525577470152");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0336804630352581");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-89 ");
        values.put(RssiDB.PROBABILITY, "0.00365186158322397");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0624883122161045");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.00557956259646925");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.00276887380225473");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0159074100064432");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-55 ");
        values.put(RssiDB.PROBABILITY, "0.0734486383002036");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0578686488494382");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.00482929918246708");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.0504963995274579");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.0567508010114223");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-62 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0511904694436825");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "0.0286429749242141");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0667986187743786");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.00467520163138631");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.660021421636573");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.00467520163138631");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.660021421636573");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.0100632146562348");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.157415162439045");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.591676916074651");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.00311680108759072");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.440014281091051");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-94 ");
        values.put(RssiDB.PROBABILITY, "0.114358553846362");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-83 ");
        values.put(RssiDB.PROBABILITY, "0.00134298436725394");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "0.41931469743666");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-84 ");
        values.put(RssiDB.PROBABILITY, "0.00492427601326441");
        db.insert(RssiDB.TABLE_C7_TRAINING, null, values);
        values = new ContentValues();

        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 8  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.00528591966566884");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0746351136191837");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0586696999855212");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.00264948006867471");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-90 ");
        values.put(RssiDB.PROBABILITY, "0.0494317499086343");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.0448010811842708");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-84 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0213743083386534");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.0395022730686303");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-89 ");
        values.put(RssiDB.PROBABILITY, "0.0342093471036818");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.00453061968356861");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0745417752399734");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0613120207093472");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.00528591966566884");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0746351136191837");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0586696999855212");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-62 ");
        values.put(RssiDB.PROBABILITY, "0.00601294646286811");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.064204550768843");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.0485923993771568");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.00590450816197421");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0793353364507796");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0617613108256052");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.00946014481409698");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.174819560241721");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.200919068814099");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.283088431354908");
        db.insert(RssiDB.TABLE_C8_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 9  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.026288372255881");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0681361339837143");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0997293538306156");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.0353428941249321");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.0675257361444107");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.110997927084142");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-67 ");
        values.put(RssiDB.PROBABILITY, "0.0372139584466147");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0313402989827195");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0487459719939639");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.0823858667751979");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-84 ");
        values.put(RssiDB.PROBABILITY, "0.0389163278831808");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-83 ");
        values.put(RssiDB.PROBABILITY, "0.0165222281371899");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0385200799770896");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0593062640049244");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.0344040332553788");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.0579692636920916");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0976756273910957");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.0344040332553788");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.0579692636920916");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0976756273910957");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.0138179019170671");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0540086113509693");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-62 ");
        values.put(RssiDB.PROBABILITY, "0.0386051330907703");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-49 ");
        values.put(RssiDB.PROBABILITY, "0.0353428941249321");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.0675257361444107");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.110997927084142");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0271532863859063");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.0389638027401062");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0666314376168112");
        db.insert(RssiDB.TABLE_C9_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 10  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0292444232607333");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.136562828142153");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0905430912731827");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0665269218753435");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.102950731782472");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.151339326980355");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0537712721153652");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.0387242826143067");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-44 ");
        values.put(RssiDB.PROBABILITY, "0.0186092949454126");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.0276380542243262");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0274904880429452");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0142974025199242");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0352888528127447");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0727205950950933");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.068708755781769");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-67 ");
        values.put(RssiDB.PROBABILITY, "0.0327805873923202");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.000453580045032354");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0733974806596449");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.064468705128332");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.132591538721048");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.139580727854413");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.0314662990216803");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0576748060598948");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.0220069334458636");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-83 ");
        values.put(RssiDB.PROBABILITY, "0.0527166922961782");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-93 ");
        values.put(RssiDB.PROBABILITY, "0.00508396310063621");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0519857122860729");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.043476442022577");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-44 ");
        values.put(RssiDB.PROBABILITY, "0.0190149028259611");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.0302956003396127");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0234377625608407");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.017960749802048");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.041507698851075");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0432713633682003");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-45 ");
        values.put(RssiDB.PROBABILITY, "0.0206868185383796");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-48 ");
        values.put(RssiDB.PROBABILITY, "0.029137058039448");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0274394727372413");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0165024360810893");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.0407502841857772");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0476340855157852");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0230101781646212");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.0513248711746087");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.0334739337996855");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.0253457828522731");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.031014167295652");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0422877971206765");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-44 ");
        values.put(RssiDB.PROBABILITY, "0.0190003729558753");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-49 ");
        values.put(RssiDB.PROBABILITY, "0.0322799928342544");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0266470312129038");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0162042674275945");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0387682973937213");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.1271354278181");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.000363547020500091");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.117029402795405");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.100947448185234");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.000275793567688961");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0943337898791889");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0716503493032818");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0696049608333176");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "0.00228256001605822");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0521969516338683");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.0364267433731214");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "1.12312992374952");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.00260191024093724");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0802235659821083");
        db.insert(RssiDB.TABLE_C10_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 11  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.316034037466721");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.421054665887373");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0197343345329652");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-50 ");
        values.put(RssiDB.PROBABILITY, "0.043896806375387");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.00307329618227567");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "1.22568105680205");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0185426866869647");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-51 ");
        values.put(RssiDB.PROBABILITY, "0.0144059456637976");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.151348142460964");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.103056620948566");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0460178505714246");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0305413138983544");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0253697975605259");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0518625967824795");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.107790964507864");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.168079728645248");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.0740169822844192");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.202142079940654");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.340694063559665");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-84 ");
        values.put(RssiDB.PROBABILITY, "0.396719106521173");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0167192679423684");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0338266738591499");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.313387403127352");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0156074883850171");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.158779788715498");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.169660152865324");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0966827360810494");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.217259816137618");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.250894702878023");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.0338266738591499");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.313387403127352");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.117758764371588");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0684233312938106");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0695583604294802");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0487774225699536");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.227592979068674");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-57 ");
        values.put(RssiDB.PROBABILITY, "0.197644457071551");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.124952059686147");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0942312552638558");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0591253138747553");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.0375289899975823");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0776635805103001");
        db.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//.insert(RssiDB.TABLE_C11_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 12  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.176061677221963");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.146569693527937");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.0310697077450522");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.025865240034342");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.0188637511309245");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-51 ");
        values.put(RssiDB.PROBABILITY, "0.0157038957351362");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.033011564479118");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0274818175364883");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0754550045236981");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0628155829405449");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.088030838610981");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0732848467639691");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-51 ");
        values.put(RssiDB.PROBABILITY, "0.0240084105302676");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0199867763901733");
        db.insert(RssiDB.TABLE_C12_TRAINING, null, values);
        values = new ContentValues();



        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 13  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0522630347613885");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0152473431907998");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.131657304985392");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-67 ");
        values.put(RssiDB.PROBABILITY, "0.109444739922615");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.131657304985392");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "0.0695636455815349");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0583089153793749");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.0446830121483993");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0116625576740737");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.051067648154387");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.12209449260291");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0716262725084925");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0268986225382205");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "0.0769173707832843");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-58 ");
        values.put(RssiDB.PROBABILITY, "0.0438107822241088");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.0614111261263291");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0874388672172358");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.105191528801548");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.131314371743654");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.053533892290074");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0234172893325442");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0961011224702075");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0253481313023266");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.103603208575773");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0470951366697681");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0166273658012908");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.13589479583692");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-67 ");
        values.put(RssiDB.PROBABILITY, "0.10514279162814");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.141568282669042");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.0690670835192802");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0244359683693846");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.09604030633591");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0156188327069098");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.102997234732677");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.0709348130208");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.0804043640663918");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-90 ");
        values.put(RssiDB.PROBABILITY, "0.156863048551132");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0373212291790463");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.122729163161808");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-84 ");
        values.put(RssiDB.PROBABILITY, "0.0354030687503481");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0719885962178311");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.085964551953918");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0490128199281757");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0678302736682832");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0397923736158292");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0502987989569579");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.0292319022692542");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.04450621052948");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.0432409740801095");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.036065790490666");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0328891955435809");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "0.0316149359382686");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-89 ");
        values.put(RssiDB.PROBABILITY, "0.159098715800871");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.121827241345795");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-93 ");
        values.put(RssiDB.PROBABILITY, "0.0714331632346935");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0131886962028213");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0479740054695253");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.0240726874689054");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0114207651706496");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0433265901606091");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-83 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
//values.put(RssiDB.PROBABILITY, "NaN");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0685245910238975");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.259959540963655");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.0293676818673846");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.111411231841566");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0411147546143385");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.155975724578193");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:03");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
//values.put(RssiDB.PROBABILITY, "NaN");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0961664517534092");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.145874582584769");
        db.insert(RssiDB.TABLE_C13_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 14  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0752640848992974");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.0368449050266375");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.128601354778075");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0899849441886458");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.273350124459991");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.628972046154988");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.00369320700994838");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.314486023077494");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.00369320700994838");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-70 ");
        values.put(RssiDB.PROBABILITY, "0.314486023077494");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.00946014481409701");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.174819560241721");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.00100831989299155");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0627080070735324");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-93 ");
        values.put(RssiDB.PROBABILITY, "0.0235278483861854");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0597786723126291");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0606002575392265");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0479268361410873");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0327176687805573");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.0463511206526914");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-53 ");
        values.put(RssiDB.PROBABILITY, "0.025671826246926");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.0136866836049231");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0490007851330318");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.0267667268802003");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "0.173314993343076");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-67 ");
        values.put(RssiDB.PROBABILITY, "0.0593636530903292");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-62 ");
        values.put(RssiDB.PROBABILITY, "0.133526831010264");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.00465007170467072");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.238503179109626");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:13");
        values.put(RssiDB.RSSI_VALUE,  "-55 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.00465007170467072");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-69 ");
        values.put(RssiDB.PROBABILITY, "0.238503179109626");
        db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-95 ");
        values.put(RssiDB.PROBABILITY, "NaN");
        //db.insert(RssiDB.TABLE_C14_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 15  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.329543467100791");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:25:9c:ca:87:ee");
        values.put(RssiDB.RSSI_VALUE,  "-86 ");
        values.put(RssiDB.PROBABILITY, "0.155665311532724");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:04");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.659086934201581");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:00");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "0.311330623065448");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.659086934201581");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:28:06");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.311330623065448");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.219695644733861");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:10");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.103776874355149");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.219695644733861");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:16");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.103776874355149");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:0e:a6:27:4d:fb");
        values.put(RssiDB.RSSI_VALUE,  "-87 ");
        values.put(RssiDB.PROBABILITY, "NaN");
//db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.329543467100791");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d6");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.155665311532724");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.659086934201588");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:14");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.311330623065442");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.329543467100791");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:ce:13");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.155665311532724");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.659086934201588");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d4");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.311330623065442");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.219695644733861");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:d0");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.103776874355149");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.659086934201588");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.311330623065442");
        db.insert(RssiDB.TABLE_C15_TRAINING, null, values);
        values = new ContentValues();


        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 16  ************************************/
        /******************************************************************************/
        /******************************************************************************/

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.028435272260461");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-55 ");
        values.put(RssiDB.PROBABILITY, "0.0155933796846462");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0341350010311213");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f6");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0262630505472625");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0245207976449099");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0180589464892513");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f4");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0377986326636289");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0247757072517107");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-55 ");
        values.put(RssiDB.PROBABILITY, "0.0164836753066766");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.034020712854817");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-77 ");
        values.put(RssiDB.PROBABILITY, "0.0278811197294432");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.0175999876643767");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f3");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.035925506777854");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.0133629265369571");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:26:5a:a9:99:46");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0329589212046871");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-90 ");
        values.put(RssiDB.PROBABILITY, "0.0261622352047682");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0341486294291467");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-88 ");
        values.put(RssiDB.PROBABILITY, "0.034649784327989");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-81 ");
        values.put(RssiDB.PROBABILITY, "0.0405973457138996");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "0.0473925286437482");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-90 ");
        values.put(RssiDB.PROBABILITY, "0.0259049703546093");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0383317612317518");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0139028579976802");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-56 ");
        values.put(RssiDB.PROBABILITY, "0.206946379341553");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.277030162286098");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-54 ");
        values.put(RssiDB.PROBABILITY, "0.0827785517366215");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-59 ");
        values.put(RssiDB.PROBABILITY, "0.110812064914439");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-63 ");
        values.put(RssiDB.PROBABILITY, "0.0827785517366213");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-68 ");
        values.put(RssiDB.PROBABILITY, "0.110812064914439");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.13796425289437");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.184686774857397");
        db.insert(RssiDB.TABLE_C16_TRAINING, null, values);
        values = new ContentValues();



        /******************************************************************************/
        /******************************************************************************/
        /*******************************   CELL 17  ************************************/
        /******************************************************************************/
        /******************************************************************************/


        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-76 ");
        values.put(RssiDB.PROBABILITY, "0.097064899616607");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-82 ");
        values.put(RssiDB.PROBABILITY, "0.0610015301736447");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:96:9d:65:76:8d");
        values.put(RssiDB.RSSI_VALUE,  "-73 ");
        values.put(RssiDB.PROBABILITY, "0.0374570158164189");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-64 ");
        values.put(RssiDB.PROBABILITY, "0.0325292505247575");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:10");
        values.put(RssiDB.RSSI_VALUE,  "-50 ");
        values.put(RssiDB.PROBABILITY, "0.0366053811759752");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-65 ");
        values.put(RssiDB.PROBABILITY, "0.0313007727080495");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-50 ");
        values.put(RssiDB.PROBABILITY, "0.0331733967882336");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:39:16");
        values.put(RssiDB.RSSI_VALUE,  "-52 ");
        values.put(RssiDB.PROBABILITY, "0.0420389769889784");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-74 ");
        values.put(RssiDB.PROBABILITY, "0.0489635404774032");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.0661744284378843");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:6e:31:a6");
        values.put(RssiDB.RSSI_VALUE,  "-60 ");
        values.put(RssiDB.PROBABILITY, "0.0154556583735951");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-62 ");
        values.put(RssiDB.PROBABILITY, "0.0681391125536148");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:1b:90:76:d3:f0");
        values.put(RssiDB.RSSI_VALUE,  "-79 ");
        values.put(RssiDB.PROBABILITY, "0.00171295175506974");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-80 ");
        values.put(RssiDB.PROBABILITY, "0.23167298268229");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "20:c9:d0:18:43:f3");
        values.put(RssiDB.RSSI_VALUE,  "-85 ");
        values.put(RssiDB.PROBABILITY, "0.00582403596723717");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-71 ");
        values.put(RssiDB.PROBABILITY, "0.0979270809548065");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-75 ");
        values.put(RssiDB.PROBABILITY, "0.132348856875769");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "5c:d9:98:e3:e6:c4");
        values.put(RssiDB.RSSI_VALUE,  "-78 ");
        values.put(RssiDB.PROBABILITY, "0.0309113167471901");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-92 ");
        values.put(RssiDB.PROBABILITY, "1.15836491341144");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "00:22:f7:20:a1:98");
        values.put(RssiDB.RSSI_VALUE,  "-91 ");
        values.put(RssiDB.PROBABILITY, "0.0291201798361873");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-72 ");
        values.put(RssiDB.PROBABILITY, "0.138642135185226");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

        values.put(RssiDB.SSID_VALUE, "1c:aa:07:7b:37:06");
        values.put(RssiDB.RSSI_VALUE,  "-66 ");
        values.put(RssiDB.PROBABILITY, "0.027792138392811");
        db.insert(RssiDB.TABLE_C17_TRAINING, null, values);
        values = new ContentValues();

    }

}

