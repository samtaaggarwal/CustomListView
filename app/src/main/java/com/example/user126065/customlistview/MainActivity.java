package com.example.user126065.customlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{

    String[] names = {"rob","mark", "mike","lisa","tia"};
    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListAdapter myadapter = new CustomAdapter(this, names);
        mylist = (ListView) findViewById(R.id.mylist1);
        mylist.setAdapter(myadapter);

    }
}
