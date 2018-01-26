package com.example.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    SensorManager sensorManager;
    Sensor acceleroSensor,lightSensor,pressureSensor;
    TextView acceleroSText,ligftSText,pressureSText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        acceleroSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        acceleroSText = (TextView)findViewById(R.id.acceleroSText);
        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        ligftSText = (TextView)findViewById(R.id.ligftSText);
        pressureSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        pressureSText = (TextView)findViewById(R.id.pressureSText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this,acceleroSensor,SensorManager.SENSOR_DELAY_UI);
        sensorManager.registerListener(this,lightSensor,SensorManager.SENSOR_DELAY_UI);
        sensorManager.registerListener(this,pressureSensor,SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER) {
            acceleroSText.setText("加速度センサー"
                    + "xの値" + String.valueOf(event.values[0])
                    + "yの値" + String.valueOf(event.values[1])
                    + "zの値" + String.valueOf(event.values[2]));
        }else if(event.sensor.getType()==Sensor.TYPE_LIGHT) {
            ligftSText.setText("光センサー" + String.valueOf(event.values[0]));
        }else if(event.sensor.getType()==Sensor.TYPE_PRESSURE){
            pressureSText.setText("気圧センサー"+String.valueOf(event.values[0]));
        }
}

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}