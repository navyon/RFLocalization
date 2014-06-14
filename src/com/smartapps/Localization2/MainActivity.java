package com.smartapps.Localization2;

import android.app.Activity;
import android.content.IntentFilter;
import android.graphics.*;
import android.net.wifi.ScanResult;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


//import org.apache.commons.math3.stat.descriptive;
import java.util.*;


import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private int time = 20;
    private Timer t;
    private TimerTask task;



    Button btnInitial, btnSenseNewAP, btnSenseNewScan;
    Canvas canvas;
    Bitmap mutableBitmap;

    /**
     * Cell Position Points
     */
    float cellspoints[][] ={{100,595},{100,510},{100,430},{100,380},{240,600},{240,510},{240,440},{240,385},{240,350},{245,280},{240,210},{240,140},{240,80},{240,15},{400,460},{400,143},{400,115}};


    private RssiDataSource datasource;

    private static Map<String, HashMap<Integer, Float>> cell1;
    private static Map<String, HashMap<Integer, Float>> cell2;
    private static Map<String, HashMap<Integer, Float>> cell3;
    private static Map<String, HashMap<Integer, Float>> cell4;
    private static Map<String, HashMap<Integer, Float>> cell5;
    private static Map<String, HashMap<Integer, Float>> cell6;
    private static Map<String, HashMap<Integer, Float>> cell7;
    private static Map<String, HashMap<Integer, Float>> cell8;
    private static Map<String, HashMap<Integer, Float>> cell9;
    private static Map<String, HashMap<Integer, Float>> cell10;
    private static Map<String, HashMap<Integer, Float>> cell11;
    private static Map<String, HashMap<Integer, Float>> cell12;
    private static Map<String, HashMap<Integer, Float>> cell13;
    private static Map<String, HashMap<Integer, Float>> cell14;
    private static Map<String, HashMap<Integer, Float>> cell15;
    private static Map<String, HashMap<Integer, Float>> cell16;
    private static Map<String, HashMap<Integer, Float>> cell17;



    private static final int NR_CELLS = 17;
    //bayesian main variables
    float [] posterior;
    float[] prior;

    private Button btnCollect1,btnCollect2,btnCollect3,btnCollect4,btnCollect5,btnCollect6,btnCollect7,btnCollect8,btnCollect9,btnCollect10,btnCollect11,btnCollect12,btnCollect13,btnCollect14,btnCollect15,btnCollect16,btnCollect17,btnSave;
    private boolean btn1Used, btn2Used, btn3Used, btn4Used, btn5Used, btn6Used, btn7Used, btn8Used, btn9Used, btn10Used, btn11Used,btn12Used, btn13Used, btn14Used, btn15Used, btn16Used, btn17Used;
    private TextView txtviewwifi;
    private List<ScanResult> wifiList;
    private ArrayList<RFClass> rfTestData = new ArrayList<RFClass>();

    //private enum ButtonClicked{
    //    btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17
    //};
    //private ButtonClicked btnClickedIs;

    IntentFilter intentFilter = new IntentFilter();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



        //Initializations (data and bayesian algorithm's variables)
        posterior = new float [NR_CELLS];
        prior =  initiatePrior();

        this.datasource = new RssiDataSource(this);
        this.datasource.open();
        this.cell1 = datasource.getTrainingDataC1();
        this.datasource.close();
        this.datasource.open();
        this.cell2 = datasource.getTrainingDataC2();
        this.datasource.close();
        this.datasource.open();
        this.cell3 = datasource.getTrainingDataC3();
        this.datasource.close();
        this.datasource.open();
        this.cell4 = datasource.getTrainingDataC4();
        this.datasource.close();
        this.datasource.open();
        this.cell5 = datasource.getTrainingDataC5();
        this.datasource.close();
        this.datasource.open();
        this.cell6 = datasource.getTrainingDataC6();
        this.datasource.close();
        this.datasource.open();
        this.cell7 = datasource.getTrainingDataC7();
        this.datasource.close();
        this.datasource.open();
        this.cell8 = datasource.getTrainingDataC8();
        this.datasource.close();
        this.datasource.open();
        this.cell9 = datasource.getTrainingDataC9();
        this.datasource.close();
        this.datasource.open();
        this.cell10 = datasource.getTrainingDataC10();
        this.datasource.close();
        this.datasource.open();
        this.cell11 = datasource.getTrainingDataC11();
        this.datasource.close();
        this.datasource.open();
        this.cell12 = datasource.getTrainingDataC12();
        this.datasource.close();
        this.datasource.open();
        this.cell13 = datasource.getTrainingDataC13();
        this.datasource.close();
        this.datasource.open();
        this.cell14 = datasource.getTrainingDataC14();
        this.datasource.close();
        this.datasource.open();
        this.cell15 = datasource.getTrainingDataC15();
        this.datasource.close();
        this.datasource.open();
        this.cell16 = datasource.getTrainingDataC16();
        this.datasource.close();
        this.datasource.open();
        this.cell17 = datasource.getTrainingDataC17();
        this.datasource.close();



        //  Print data
        /*Iterator entries = cell1.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            String key = (String)thisEntry.getKey();
            HashMap<Integer, Float> value = (HashMap<Integer, Float>)thisEntry.getValue();
            Iterator rssEntries = value.entrySet().iterator();
            System.out.println("Cell 1 - Mac ID " + key);
            while (rssEntries.hasNext()){
                HashMap.Entry leEntry = (HashMap.Entry) rssEntries.next();
                Object key2 = leEntry.getKey();
                Object value2 = leEntry.getValue();
                System.out.println("           Rssi "+ key2 + " PROBABILITY " + value2);
            }
        }*/


        //BUTTONS
//
        btnInitial = (Button) findViewById(R.id.btnInitial);
        btnSenseNewAP = (Button) findViewById(R.id.btnsenseap);
        btnSenseNewScan =(Button) findViewById(R.id.btnsensenew);
        btnSenseNewAP.setOnClickListener(this);
        btnSenseNewScan.setOnClickListener(this);
        btnInitial.setOnClickListener(this);
        txtviewwifi = (TextView) findViewById(R.id.textView);



         rfTestData  = new ArrayList<RFClass>();
         intentFilter.addAction(WifiManager.RSSI_CHANGED_ACTION);


    }
    public void updateProgress(final  int itcount) {
        runOnUiThread(new Runnable() {
            public void run() {
                final int interation =itcount;

                String stringy = "Localizing Iterations: " + interation;

                txtviewwifi.setText(stringy);
            }});
    }
    // This Method draws a point on the specified cell location
    private void drawLocation(float x, float y) {
        BitmapFactory.Options myOptions = new BitmapFactory.Options();
        myOptions.inDither = true;
        myOptions.inScaled = false;
        myOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;// important
        myOptions.inPurgeable = true;

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.floor9, myOptions);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);


        Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
        mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);


        canvas = new Canvas(mutableBitmap);
        canvas.drawCircle(x, y, 10, paint);


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(mutableBitmap);
    }
    private void clearLocationPoints()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.floor9);
        Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
        mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);
        canvas = new Canvas(mutableBitmap);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(mutableBitmap);


    }

    /****************************************************************
     ***********************   BUTTONS stuff   **********************
     ***************************************************************/


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInitial:
                drawLocation(cellspoints[0][0],cellspoints[0][1]);
                //drawLocation(cellspoints[1][0],cellspoints[1][1]);
                //drawLocation(cellspoints[2][0],cellspoints[2][1]);
                // drawLocation(cellspoints[3][0],cellspoints[3][1]);
                //drawLocation(cellspoints[4][0],cellspoints[4][1]);
                // drawLocation(cellspoints[5][0],cellspoints[5][1]);
                //drawLocation(cellspoints[6][0],cellspoints[6][1]);
                //drawLocation(cellspoints[7][0],cellspoints[7][1]);
                // drawLocation(cellspoints[8][0],cellspoints[8][1]);
                //drawLocation(cellspoints[9][0],cellspoints[9][1]);
                //drawLocation(cellspoints[10][0],cellspoints[10][1]);
                // drawLocation(cellspoints[11][0],cellspoints[11][1]);
                //drawLocation(cellspoints[12][0],cellspoints[12][1]);
                // drawLocation(cellspoints[13][0],cellspoints[13][1]);
                //  drawLocation(cellspoints[14][0],cellspoints[14][1]);
                //drawLocation(cellspoints[15][0],cellspoints[15][1]);
                //drawLocation(cellspoints[16][0],cellspoints[16][1]);
                //clearLocationPoints();
                break;

            case R.id.btnsenseap:

                updateProgress(100);
                break;

            case R.id.btnsensenew:
                 clearLocationPoints();
                // registerReceiver(myRssiChangeReceiver, intentFilter);
               // Cell 1
               /* RFClass rftest1 = new RFClass(-89,"00:0e:a6:27:4d:fb");
                RFClass rftest2 = new RFClass(-60,"1c:aa:07:7b:28:06");
                RFClass rftest3 = new RFClass(-49,"1c:aa:07:7b:28:00");
                RFClass rftest4 = new RFClass(-76,"1c:aa:07:7b:37:d6");
                RFClass rftest5 = new RFClass(-65,"1c:aa:07:7b:37:d4");
                RFClass rftest6 = new RFClass(-87,"00:15:70:ad:99:ca");
                RFClass rftest7 = new RFClass(-50,"1c:aa:07:7b:28:04");
                RFClass rftest8 = new RFClass(-77,"1c:aa:07:7b:37:d0");
                rfTestData.add(rftest1);
                rfTestData.add(rftest2);
                rfTestData.add(rftest3);
                rfTestData.add(rftest4);
                rfTestData.add(rftest5);
                rfTestData.add(rftest6);
                rfTestData.add(rftest7);
                rfTestData.add(rftest8);*/
                // Cell 17
                RFClass rftest1 = new RFClass(-62,"00:1b:90:76:d3:f6");
                RFClass rftest2 = new RFClass(-76,"5c:96:9d:65:76:8d");
                RFClass rftest3 = new RFClass(-64,"1c:aa:07:7b:39:10");
                RFClass rftest4 = new RFClass(-65,"1c:aa:07:7b:39:16");
                RFClass rftest5 = new RFClass(-74,"1c:aa:07:6e:31:a6");
                RFClass rftest6 = new RFClass(-69,"1c:aa:07:6e:31:a3");
                RFClass rftest7 = new RFClass(-62,"00:1b:90:76:d3:f0");
                RFClass rftest8 = new RFClass(-80,"20:c9:d0:18:43:f3");
                RFClass rftest9 = new RFClass(-71,"5c:d9:98:e3:e6:c4");
                RFClass rftest10 = new RFClass(-84,"00:25:9c:ca:87:ee");
                RFClass rftest11 = new RFClass(-86,"00:26:5a:a9:99:46");
                RFClass rftest12 = new RFClass(-62,"00:1b:90:76:d3:f0");
                rfTestData.add(rftest1);
                rfTestData.add(rftest2);
                rfTestData.add(rftest3);
                rfTestData.add(rftest4);
                rfTestData.add(rftest5);
                rfTestData.add(rftest6);
                rfTestData.add(rftest7);
                rfTestData.add(rftest8);
                rfTestData.add(rftest9);
                rfTestData.add(rftest10);
                rfTestData.add(rftest11);
                rfTestData.add(rftest12);
                // Cell4
               /* RFClass rftest1 = new RFClass(-52,"1c:aa:07:7b:28:06");
                RFClass rftest2 = new RFClass(-68,"1c:aa:07:7b:37:d6");
                RFClass rftest3 = new RFClass(-39,"1c:aa:07:7b:39:10");
                RFClass rftest4 = new RFClass(-66,"1c:aa:07:7b:37:d4");
                RFClass rftest5 = new RFClass(-91,"00:0e:a6:27:4d:fb");
                RFClass rftest6 = new RFClass(-52,"1c:aa:07:7b:28:03");
                RFClass rftest7 = new RFClass(-41,"1c:aa:07:7b:28:04");
                RFClass rftest8 = new RFClass(-66,"1c:aa:07:7b:37:d0");
                RFClass rftest9 = new RFClass(-85,"00:15:70:ad:99:ca");
                RFClass rftest10 = new RFClass(-89,"00:15:70:ad:99:cb");
                RFClass rftest11 = new RFClass(-52,"1c:aa:07:7b:28:06");
                RFClass rftest12 = new RFClass(-68,"1c:aa:07:7b:37:d6");
                rfTestData.add(rftest1);
                rfTestData.add(rftest2);
                rfTestData.add(rftest3);
                rfTestData.add(rftest4);
                rfTestData.add(rftest5);
                rfTestData.add(rftest6);
                rfTestData.add(rftest7);
                rfTestData.add(rftest8);
                rfTestData.add(rftest9);
                rfTestData.add(rftest10);
                rfTestData.add(rftest11);
                rfTestData.add(rftest12);*/

                // CELL 5
               /* RFClass rftest1 = new RFClass(-43,"1c:aa:07:7b:28:06");
                RFClass rftest2 = new RFClass(-69,"1c:aa:07:7b:37:d6");
                RFClass rftest3 = new RFClass(-43,"1c:aa:07:7b:28:00");
                RFClass rftest4 = new RFClass(-42,"1c:aa:07:7b:28:03");
                RFClass rftest5 = new RFClass(-64,"1c:aa:07:7b:37:d3");
                RFClass rftest6 = new RFClass(-42,"1c:aa:07:7b:28:04");
                RFClass rftest7 = new RFClass(-68,"1c:aa:07:7b:37:d0");
                RFClass rftest8 = new RFClass(-46,"1c:aa:07:7b:28:06");
                RFClass rftest9 = new RFClass(-75,"1c:aa:07:7b:37:d6");
                RFClass rftest10 = new RFClass(-50,"1c:aa:07:7b:28:00");
                RFClass rftest11 = new RFClass(-48,"1c:aa:07:7b:28:04");
                RFClass rftest12 = new RFClass(-68,"1c:aa:07:7b:37:d0");
                rfTestData.add(rftest1);
                rfTestData.add(rftest2);
                rfTestData.add(rftest3);
                rfTestData.add(rftest4);
                rfTestData.add(rftest5);
                rfTestData.add(rftest6);
                rfTestData.add(rftest7);
                rfTestData.add(rftest8);
                rfTestData.add(rftest9);
                rfTestData.add(rftest10);
                rfTestData.add(rftest11);
                rfTestData.add(rftest12);*/
                Thread thread = new Thread()
                {
                    @Override
                    public void run() {
                        try {
                            startBayesian();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();



                break;

            default:
                break;


        }
    }



    /***************************************************************************************
     ********************************* Broadcast Receiver **********************************
     ***************************************************************************************/

    private BroadcastReceiver myRssiChangeReceiver
            = new BroadcastReceiver(){

        @Override
        public void onReceive(Context arg0, Intent arg1) {

            int rssi;
            String  bssid;
            StringBuilder sb = new StringBuilder();
            //int newRssi = arg1.getIntExtra(WifiManager.EXTRA_NEW_RSSI, 0);
            WifiManager w = (WifiManager) arg0.getSystemService(Context.WIFI_SERVICE);

            wifiList = w.getScanResults(); // Returns a <list> of scanResults
            for (ScanResult aWifiList : wifiList) {
                sb.append(Integer.toString(rfTestData.size())).append(".");
                sb.append(aWifiList.BSSID);
                sb.append(aWifiList.level);
                sb.append("\n");
                bssid = aWifiList.BSSID;
                rssi = aWifiList.level;

                RFClass rfData = new RFClass(rssi,bssid);
                rfTestData.add(rfData);
                updateProgress(rfTestData.size());

            }
          //  updateProgress(rfTestData.size());
           /* StringBuilder lsttext =  new StringBuilder();
            lsttext.append(txtviewwifi.getText()).append("\n").append(sb);
            txtviewwifi.setText(lsttext);*/





        }};





    /***************************************************************************************
     *************************************** Timer  ****************************************
     ***************************************************************************************/
  /*  public void startTimer(){
        time = 0;
        t = new Timer();
        task = new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    //Called each time when 1000 milliseconds (1 second) (the period parameter)
                    @Override
                    public void run() {
                        TextView tv = (TextView) findViewById(R.id.timer);

                        time += 1;

                        int seconds = time % 60;
                        int minutes = time / 60;
                        String stringTime = String.format("%02d:%02d", minutes, seconds);
                        tv.setText(stringTime);

                        if(minutes >= 2){
                            stopTime();
                        }
                    }
                });
            }
        };
        t.scheduleAtFixedRate(task, 0, 1000);
        //Second param. - Set how long before to start calling the TimerTask (in milliseconds)
        //Third param. - Set the amount of time between each execution (in milliseconds)
    }


    private void stopTime(){


        System.out.println(fingerprintingData);
        activateButtons();
        switch (this.btnClickedIs){
            case btn1:
                this.dataC1 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn2:
                this.dataC2 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn3:
                this.dataC3 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn4:
                this.dataC4 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn5:
                this.dataC5 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn6:
                this.dataC6 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn7:
                this.dataC7 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn8:
                this.dataC8 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn9:
                this.dataC9 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn10:
                this.dataC10 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn11:
                this.dataC11 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn12:
                this.dataC12 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn13:
                this.dataC13 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn14:
                this.dataC14 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn15:
                this.dataC15 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn16:
                this.dataC16 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
            case btn17:
                this.dataC17 = new ArrayList<RFData>(this.fingerprintingData);
                this.fingerprintingData = new ArrayList<RFData>();
                break;
        }
        task.cancel();
    }
*/







    /***************************************************************************************
     ************************* Buttons - Enable and Disable options*************************
     ***************************************************************************************/

   /* private void disableButtons(){
        this.btnCollect1.setEnabled(false);
        this.btnCollect2.setEnabled(false);
        this.btnCollect3.setEnabled(false);
        this.btnCollect4.setEnabled(false);
        this.btnCollect5.setEnabled(false);
        this.btnCollect6.setEnabled(false);
        this.btnCollect7.setEnabled(false);
        this.btnCollect8.setEnabled(false);
        this.btnCollect9.setEnabled(false);
        this.btnCollect10.setEnabled(false);
        this.btnCollect11.setEnabled(false);
        this.btnCollect12.setEnabled(false);
        this.btnCollect13.setEnabled(false);
        this.btnCollect14.setEnabled(false);
        this.btnCollect15.setEnabled(false);
        this.btnCollect16.setEnabled(false);
        this.btnCollect17.setEnabled(false);
    }

    private void activateButtons(){
        if(!btn1Used)this.btnCollect1.setEnabled(true);
        if(!btn2Used)this.btnCollect2.setEnabled(true);
        if(!btn3Used)this.btnCollect3.setEnabled(true);
        if(!btn4Used)this.btnCollect4.setEnabled(true);
        if(!btn5Used)this.btnCollect5.setEnabled(true);
        if(!btn6Used)this.btnCollect6.setEnabled(true);
        if(!btn7Used)this.btnCollect7.setEnabled(true);
        if(!btn8Used)this.btnCollect8.setEnabled(true);
        if(!btn9Used)this.btnCollect9.setEnabled(true);
        if(!btn10Used)this.btnCollect10.setEnabled(true);
        if(!btn11Used)this.btnCollect11.setEnabled(true);
        if(!btn12Used)this.btnCollect12.setEnabled(true);
        if(!btn13Used)this.btnCollect13.setEnabled(true);
        if(!btn14Used)this.btnCollect14.setEnabled(true);
        if(!btn15Used)this.btnCollect15.setEnabled(true);
        if(!btn16Used)this.btnCollect16.setEnabled(true);
        if(!btn17Used)this.btnCollect17.setEnabled(true);
    }

    private void initializeBoolValues(){
        this.btn1Used = false;
        this.btn2Used = false;
        this.btn3Used = false;
        this.btn4Used = false;
        this.btn5Used = false;
        this.btn6Used = false;
        this.btn7Used = false;
        this.btn8Used = false;
        this.btn9Used = false;
        this.btn10Used = false;
        this.btn11Used = false;
        this.btn12Used = false;
        this.btn13Used = false;
        this.btn14Used = false;
        this.btn15Used = false;
        this.btn16Used = false;
        this.btn17Used = false;
    }
    void saveData()
    {

        ArrayList<ArrayList<RFData>> tempArrayList = new ArrayList<ArrayList<RFData>>();
        tempArrayList.add(0,dataC1);
        tempArrayList.add(1,dataC2);
        tempArrayList.add(2,dataC3);
        tempArrayList.add(3,dataC4);
        tempArrayList.add(4,dataC5);
        tempArrayList.add(5,dataC6);
        tempArrayList.add(6,dataC7);
        tempArrayList.add(7,dataC8);
        tempArrayList.add(8,dataC9);
        tempArrayList.add(9,dataC10);
        tempArrayList.add(10,dataC11);
        tempArrayList.add(11,dataC12);
        tempArrayList.add(12,dataC13);
        tempArrayList.add(13,dataC14);
        tempArrayList.add(14,dataC15);
        tempArrayList.add(15,dataC16);
        tempArrayList.add(16,dataC17);


        try {


            String fullPath = Environment.getExternalStorageDirectory().getAbsolutePath();
            FileOutputStream outStream = new FileOutputStream(fullPath +"/rfdata.txt");
            ObjectOutputStream objectOutStream = new ObjectOutputStream(outStream);
            objectOutStream.writeInt(tempArrayList.size()); // Save size first


            for(int i=0; i<tempArrayList.size(); i++)
            {
                objectOutStream.writeBytes(" Cell Nr " + (i) + "\n");
                ArrayList<RFData> rfDataList = tempArrayList.get(i);
                for(int j=0; j<rfDataList.size(); j++)
                {
                    objectOutStream.writeBytes(rfDataList.get(j).toString() + "\n");
                }
            }
            objectOutStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/





    /***********************************************************************************
     ****************************    BAYESIAN ALGORITHM     ****************************
     **********************************************************************************/

    public void startBayesian(){
        for(int i = 0; i < rfTestData.size(); i++){
            RFClass testPoint1 = rfTestData.get(i);
            float [] tempProb = getProb(testPoint1.getId(), testPoint1.getRss());
            posterior = multProbAndPriorAndNormalize(tempProb, prior);
            //Update prior
            prior = posterior;
        }
    }


    private static float getProbFromCell(Map<String, HashMap<Integer, Float>> cell, String id, int rss){
        if(cell.containsKey(id)){
            if(cell.get(id).containsKey(rss)){

                float p = cell.get(id).get(rss);
                return p;
            }
        }
        return 0;
    }

    private static float[] initiatePrior(){
        float[] prior = new float[NR_CELLS];
        for(int i= 0; i < NR_CELLS; i++){
            prior[i] = (float)1/NR_CELLS;
        }
        return prior;
    }

    private static float[] multProbAndPriorAndNormalize (float[] prob, float[] prior){
        float [] results = new float [NR_CELLS];
        float count = 0;
        for(int i=0; i<prob.length; i++)
        {
            results[i] = prob[i]*prior[i];
            count += results[i];

            System.out.println(i + ". Prob: "+ prob[i] + "  Prior: "+ prior[i] + "  Result: "+ results[i]  + "     Count: " + count);
        }
        System.out.println("\n\n");
        for(int i = 0; i <results.length; i++){
            if(count!= 0)results[i] = results[i]/count;
            System.out.println("Result normalized: "+ results[i]);
        }

        return results;
    }


    /**
     * Get probability of a specific rss of a specific id for all the cells
     * @param id - mac address
     * @param rss - level
     * @return array with the probabilities
     */
    private static float [] getProb(String id, int rss){
        float [] probColumn = new float[NR_CELLS];
        probColumn[0] = getProbFromCell(cell1, id, rss);
        probColumn[1] = getProbFromCell(cell2, id, rss);
        probColumn[2] = getProbFromCell(cell3, id, rss);
        probColumn[3] = getProbFromCell(cell4, id, rss);
        probColumn[4] = getProbFromCell(cell5, id, rss);
        probColumn[5] = getProbFromCell(cell6, id, rss);
        probColumn[6] = getProbFromCell(cell7, id, rss);
        probColumn[7] = getProbFromCell(cell8, id, rss);
        probColumn[8] = getProbFromCell(cell9, id, rss);
        probColumn[9] = getProbFromCell(cell10, id, rss);
        probColumn[10] = getProbFromCell(cell11, id, rss);
        probColumn[11] = getProbFromCell(cell12, id, rss);
        probColumn[12] = getProbFromCell(cell13, id, rss);
        probColumn[13] = getProbFromCell(cell14, id, rss);
        probColumn[14] = getProbFromCell(cell15, id, rss);
        probColumn[15] = getProbFromCell(cell16, id, rss);
        probColumn[16] = getProbFromCell(cell17, id, rss);
        return probColumn;
    }



}
