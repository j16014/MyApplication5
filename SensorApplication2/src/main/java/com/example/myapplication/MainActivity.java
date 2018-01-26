package com.example.myapplication;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    Sensor lightSensor;
    TextView lightSText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        lightSText = (TextView) findViewById(R.id.lightSText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_UI);
    }

    public void onSensorChanged(SensorEvent event) {
        if (event.values[0] > 800) {
            lightSText.setTextColor(Color.RED);
            lightSText.setText("明るいよ");
        } else {
            lightSText.setTextColor(Color.BLUE);
            lightSText.setText("暗いよ");
        }
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}