package com.example.popie.taskfragment_labmanual;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.popie.taskfragment_labmanual.Fragments.FragmentA;
import com.example.popie.taskfragment_labmanual.Fragments.FragmentB;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator, FragmentB.Communicator {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void supplyData(String data) {

        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentB.updateB(data);
    }
}