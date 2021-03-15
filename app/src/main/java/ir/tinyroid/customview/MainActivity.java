package ir.tinyroid.customview;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ValueSelector valueSelector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueSelector=findViewById(R.id.value_selector);
       int value= valueSelector.getValue();
       valueSelector.setMaxValue(100);
       valueSelector.setMinValue(0);
       valueSelector.setValue(0);



    }
}
