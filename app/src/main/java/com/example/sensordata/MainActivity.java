package com.example.sensordata;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Context;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager sensorManeger = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensors = sensorManeger.getSensorList(Sensor.TYPE_ALL);

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(new MySensorsAdapter(this, R.layout.row_item, sensors));

    }
}
