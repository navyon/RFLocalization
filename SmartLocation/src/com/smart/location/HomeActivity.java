package com.smart.location;

import java.util.*;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.*;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.smart.location.interfaces.HttpResponsecallback;
import com.smart.location.utils.Globals;
import com.smart.location.utils.HttpCallAsyncTask;
import com.smart.location.utils.SharedPrefSettingsUtil;
import com.smart.location.utils.Utilities;

public class HomeActivity extends Activity implements OnClickListener,
		HttpResponsecallback {

	Button notifyBtn;
	Context mContext;
	SharedPrefSettingsUtil sharedPref;
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
    private ArrayList<CellProb> cellProbList = new ArrayList<CellProb>();
    private static int counter = 0;
    boolean isRegistered = false;

    //private enum ButtonClicked{
    //    btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17
    //};
    //private ButtonClicked btnClickedIs;
    @Override
    public void onDestroy(){
        super.onDestroy();
        if (isRegistered) {
            unregisterReceiver(myRssiChangeReceiver);
            isRegistered = false;
        }

    }
    IntentFilter intentFilter = new IntentFilter();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homeactivity_layout);
		mContext = this;
		sharedPref=new SharedPrefSettingsUtil();

		initViews();

        //Initializations (data and bayesian algorithm's variables)
        posterior = new float [NR_CELLS];

        // Get the Training data from the database
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

	private void initViews() {

		notifyBtn = (Button) findViewById(R.id.notifyBtn);
		notifyBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		
		case R.id.notifyBtn:
			notifyLocation();
			break;
            case R.id.btnInitial:
                // Initialize prior to  1 / 17
                prior =  initiatePrior();
                clearLocationPoints();
                rfTestData.clear();
                cellProbList.clear();
                counter=0;
                txtviewwifi.setText("Prior : 0.0588");

                // This data can be used for testing

              /*    RFClass rftest1 = new RFClass(-62,"1c:aa:07:7b:28:00");
                RFClass rftest2 = new RFClass(-62,"1c:aa:07:7b:28:06");
                RFClass rftest3 = new RFClass(-70,"00:1b:90:76:ce:10");
                RFClass rftest4 = new RFClass(-70,"00:1b:90:76:ce:14");
                RFClass rftest5 = new RFClass(-82,"1c:aa:07:7b:37:d6");
               RFClass rftest6 = new RFClass(-82,"00:26:5a:c9:c4:68");
                RFClass rftest7 = new RFClass(-92,"5c:96:9d:65:76:8d");
                RFClass rftest8 = new RFClass(-44,"1c:aa:07:7b:28:04");
                RFClass rftest9 = new RFClass(-91,"98:f5:37:5b:55:36");
                RFClass rftest10 = new RFClass(-93,"00:15:70:ad:99:c9");
                RFClass rftest11 = new RFClass(-70,"1c:aa:07:7b:37:d3");
                RFClass rftest12 = new RFClass(-69,"1c:aa:07:7b:37:d0");
                RFClass rftest13 = new RFClass(-89,"00:15:70:ad:99:c8");*/
              /*  rfTestData.add(rftest1);
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
                rfTestData.add(rftest13);
*/


                break;

            case R.id.btnsenseap:
                // Unregister the RSSI Receiever
                if (isRegistered) {
                    unregisterReceiver(myRssiChangeReceiver);
                    isRegistered = false;
                }

                for(int i=0; i<rfTestData.size(); i++) {
                    System.out.println("Before Sort: " + rfTestData.get(i));
                }
                // Sort the RFData
                Collections.sort(rfTestData);

                for(int i=0; i<rfTestData.size(); i++) {
                    System.out.println("After Sort: " + rfTestData.get(i));
                }

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

            case R.id.btnsensenew:
                // Initialize prior to  1 / 17
                // prior =  initiatePrior();
                clearLocationPoints();
                rfTestData.clear();
                cellProbList.clear();
                registerReceiver(myRssiChangeReceiver, intentFilter);
                isRegistered = true;
                break;

            default:
                break;


        }
    }

   // The notification method.
	private void notifyLocation( ) {
		String userName=sharedPref.getSharedPrefValue(mContext, "username");
		//int cellNumber=Utilities.getCellNumber(mContext);
        int cellNumber =0;
        if(cellProbList.size()>0) {
            CellProb cp = cellProbList.get(0);
            if (cp != null) {
                cellNumber = cp.getId();
            }
        }

		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("message", "Hello. "
				+ userName + " is in Cell number: " + cellNumber));
		
		if(Utilities.checkNetworkStatus(mContext))
		{
		new HttpCallAsyncTask(mContext, nameValuePairs,
				Globals.userSignupMessage, HomeActivity.this,Globals.httpActionSendMessage).execute();
		}
		else
		{
			Utilities.showTostmessage("Internet not connected", mContext);
		}
	}

	@Override
	public void onHttpRequestComplete(JSONObject jsonResonse) {
		
		
		if(jsonResonse!=null)
		{
			Utilities.printLog("send message Resonse", jsonResonse.toString(), mContext);
			Utilities.showTostmessage("Message sent successfully", mContext);
		}

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
    public void updateProgress(final  int itcount) {
        runOnUiThread(new Runnable() {
            public void run() {
                final int interation =itcount;
                String stringy = "RSSI values: " + interation;
                txtviewwifi.setText(stringy);
            }});
    }
    // This Method draws the cell location on the UI
    private void setLocation()
    {   CellProb cp = cellProbList.get(0);
        txtviewwifi.setText(cp.toString());

        switch (cp.getId()) {
            case 0:
                drawLocation(cellspoints[0][0], cellspoints[0][1]);
                break;
            case 1:
                drawLocation(cellspoints[1][0], cellspoints[1][1]);
                break;
            case 2:
                drawLocation(cellspoints[2][0], cellspoints[2][1]);
                break;
            case 3:
                drawLocation(cellspoints[3][0], cellspoints[3][1]);
                break;
            case 4:
                drawLocation(cellspoints[4][0], cellspoints[4][1]);
                break;
            case 5:
                drawLocation(cellspoints[5][0], cellspoints[5][1]);
                break;
            case 6:
                drawLocation(cellspoints[6][0], cellspoints[6][1]);
                break;
            case 7:
                drawLocation(cellspoints[7][0], cellspoints[7][1]);
                break;
            case 8:
                drawLocation(cellspoints[8][0], cellspoints[8][1]);
                break;
            case 9:
                drawLocation(cellspoints[9][0], cellspoints[9][1]);
                break;
            case 10:
                drawLocation(cellspoints[10][0], cellspoints[10][1]);
                break;
            case 11:
                drawLocation(cellspoints[11][0], cellspoints[11][1]);
                break;
            case 12:
                drawLocation(cellspoints[12][0], cellspoints[12][1]);
                break;
            case 13:
                drawLocation(cellspoints[13][0], cellspoints[13][1]);
                break;
            case 14:
                drawLocation(cellspoints[14][0], cellspoints[14][1]);
                break;
            case 15:
                drawLocation(cellspoints[15][0], cellspoints[15][1]);
                break;
            case 16:
                drawLocation(cellspoints[16][0], cellspoints[16][1]);
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
                if(rfTestData.size()>10)
                {
                    if (isRegistered) {
                        unregisterReceiver(myRssiChangeReceiver);
                        isRegistered = false;
                    }
                }

            }
            //  updateProgress(rfTestData.size());
           /* StringBuilder lsttext =  new StringBuilder();
            lsttext.append(txtviewwifi.getText()).append("\n").append(sb);
            txtviewwifi.setText(lsttext);*/





        }};

    /***********************************************************************************
     ****************************    BAYESIAN ALGORITHM     ****************************
     **********************************************************************************/

    public void startBayesian(){
        if(counter < rfTestData.size()) {
            RFClass testPoint1 = rfTestData.get(counter);
            float[] tempProb = getProb(testPoint1.getId(), testPoint1.getRss());
            float maxprob = max(tempProb);

            if(maxprob!=0) {
                posterior = multProbAndPriorAndNormalize(tempProb, prior);
                //Update prior
                prior = posterior;
                // increment counter to next Access point and RSSI value
                counter++;
            }
            else
            {
                counter++;
                this.runOnUiThread(new Runnable() {
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Access point Not Found, Sense New AP", Toast.LENGTH_SHORT).show();
                    }
                });

            }



        }
        else {
            this.runOnUiThread(new Runnable() {
                public void run() {
                    Toast.makeText(getApplicationContext(), "Access point list Exhausted", Toast.LENGTH_SHORT).show();
                }
            });

        }

    }


    private static float getProbFromCell(Map<String, HashMap<Integer, Float>> cell, String id, int rss){
        if(cell.containsKey(id)){
            if(cell.get(id).containsKey(rss)){
                return cell.get(id).get(rss);

            }
        }
        return 0;
    }
    //
    private static float[] initiatePrior(){
        float[] prior = new float[NR_CELLS];
        for(int i= 0; i < NR_CELLS; i++){
            prior[i] = (float)1/NR_CELLS;
        }
        return prior;
    }

    private float[] multProbAndPriorAndNormalize (float[] prob, float[] prior){
        float [] results = new float [NR_CELLS];
        float count = 0;

        for(int i=0; i<prob.length; i++)
        {
            results[i] = prob[i]*prior[i];
            count += results[i];

            System.out.println(i + ". Prob: "+ prob[i] + "  Prior: "+ prior[i] + "  Result: "+ results[i]  + "     Count: " + count);
        }
        System.out.println("\n\n");
        cellProbList = new ArrayList<CellProb>();
        for(int i = 0; i <results.length; i++){
            if(count!= 0)results[i] = results[i]/count;
            System.out.println("Result normalized: "+ results[i]);

            CellProb cTemp = new CellProb(i, results[i]);
            cellProbList.add(cTemp);


        }
        // Sort the list of Cells by Probability
        Collections.sort(cellProbList);
        // Draw the location on Screen
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setLocation();
            }
        });

        for(int i=0; i<cellProbList.size(); i++) {
            System.out.println("After Sort: " + cellProbList.get(i));
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
    // This method returns the maximum value in an array
    public static float max(float[] array) {
        // Validates input
        if (array == null) {
            throw new IllegalArgumentException("The Array must not be null");
        } else if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        // Finds and returns max
        float max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (Float.isNaN(array[j])) {
                return Float.NaN;
            }
            if (array[j] > max) {
                max = array[j];
            }
        }

        return max;
    }

}
