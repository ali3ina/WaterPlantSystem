public class TemperatureActivity extends Activity
        implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private boolean isSensorPresent;
    private TextView mTemperatureValue;
    private TextView mPressureValue;
    private TextView mAltitudeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSensorManager =
                (SensorManager)this.getSystemService
                        (Context.SENSOR_SERVICE);
        mTemperatureValue =
                (TextView)findViewById(R.id.temperaturetext);
        if(mSensorManager.getDefaultSensor
                (Sensor.TYPE_AMBIENT_TEMPERATURE) != null) {
            mSensor = mSensorManager.getDefaultSensor
                    (Sensor.TYPE_AMBIENT_TEMPERATURE);
            isSensorPresent = true;
        } else {
            mTemperatureValue.setText("Ambient Temperature Sensor is not available!");
            isSensorPresent = false;
        }


        mPressureValue =
                (TextView)findViewById(R.id.pressuretext);
        mAltitudeValue =
                (TextView)findViewById(R.id.altitudetext);
        mSensorManager = (SensorManager)
                this.getSystemService(Context.SENSOR_SERVICE);
        if(mSensorManager.getDefaultSensor
                (Sensor.TYPE_PRESSURE) != null) {
            mSensor = mSensorManager.getDefaultSensor
                    (Sensor.TYPE_PRESSURE);
            isSensorPresent = true;
        } else {
            isSensorPresent = false;
            mPressureValue.setText("Pressure Sensor is not available!");
            mAltitudeValue.setText("Cannot calculate altitude, as pressure
                    Sensor is not available!");
        }





    }
    @Override
    protected void onResume() {
        super.onResume();
        if(isSensorPresent) {
            mSensorManager.registerListener(this, mSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        if(isSensorPresent) {
            mSensorManager.unregisterListener(this);
        }
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        mTemperatureValue.setText("Temperature in degree Celsius is " +
                event.values[0]);

        float pressure = event.values[0];
        mPressureValue.setText("Pressure in mbar is " +
                pressure);
        float altitude = SensorManager.getAltitude
                (SensorManager.PRESSURE_STANDARD_ATMOSPHERE,
                        pressure);
        mAltitudeValue.setText("Current altitude is " +
                altitude);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }



}