package com.ishra.simple_list_view;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //...passing_string_array_from_mainlayout...
//String[] stu={"AA","BB","CC","DD","EE"};
//Integer[] st={1,2,4,3,3};
    //.......data_passing_from_resource_class.........
    String[] ctgthananame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv ;
        lv = findViewById(R.id.lv1);

        Resources res=getResources();
        ctgthananame =res.getStringArray(R.array.CTGTHANA);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_list_2,R.id.textview1, ctgthananame);
        lv.setAdapter(adapter);

        
    }
}
