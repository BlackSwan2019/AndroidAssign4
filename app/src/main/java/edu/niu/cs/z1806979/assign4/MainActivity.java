/**
 *    Program:        Traffic light and RGB color mixer.
 *
 *    Purpose:        In part 1, User clicks a button to cycle through traffic light sequence.
 *                    In part 2, User inputs RGB values to obtain a single color to display.
 *
 *    Programmers:    Ben Lane    z1806979
 *                    Jinhong Yao z1785700
 *
 *    Due Date:       November 16, 2018
 */

package edu.niu.cs.z1806979.assign4;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 *    Class:  MainActivity
 *
 *    @author Ben Lane
 *    @author Jinhong Yao
 *
 *    Activity that allows user to click a button to cycle through three traffic light colors.
 */
public class MainActivity extends AppCompatActivity {
    private TextView lightTV;
    private Button cycleBtn;
    private TrafficLight lightModel;
    private int lightNum = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lightModel = new TrafficLight();

        setContentView(R.layout.activity_main);

        lightTV = findViewById(R.id.textViewLight);
        lightTV.setTextColor(Color.parseColor("#1AFF1A"));
        lightTV.setText(lightModel.getText(lightNum));
    }

    /**
     * Method that initiates the changing of the label text and label color.
     *
     * @param v The view of the current activity.
     *
     */
    public void goCycle(View v) {
        String lightColor;

        if (lightNum == 3) {
            lightNum = 1;

            lightColor = lightModel.getLight(lightNum);
            lightTV.setTextColor(Color.parseColor(lightColor));
            lightTV.setText(lightModel.getText(lightNum));
        } else if (lightNum == 1) {
            lightNum = 2;

            lightColor = lightModel.getLight(lightNum);
            lightTV.setTextColor(Color.parseColor(lightColor));
            lightTV.setText(lightModel.getText(lightNum));
        } else if (lightNum == 2){
            lightNum = 3;

            lightColor = lightModel.getLight(lightNum);
            lightTV.setTextColor(Color.parseColor(lightColor));
            lightTV.setText(lightModel.getText(lightNum));
        }
    }
}
