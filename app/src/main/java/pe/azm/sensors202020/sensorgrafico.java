package pe.azm.sensors202020;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

public class sensorgrafico extends AppCompatActivity implements SensorEventListener{
    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;
    NivelPantalla pantalla;

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        sensor= sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        int lado= 300;
        pantalla = new NivelPantalla(this,lado);
            setContentView(pantalla);
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        pantalla.angulos(sensorEvent.values);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    @Override
    protected  void onResume(){
        super.onResume();
        sensorManager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_GAME);//
    }

}