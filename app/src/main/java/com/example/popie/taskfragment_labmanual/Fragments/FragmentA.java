package com.example.popie.taskfragment_labmanual.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.popie.taskfragment_labmanual.MainActivity;
import com.example.popie.taskfragment_labmanual.R;


public class FragmentA extends Fragment {

    EditText text;
    Button button;
    private Communicator communicator;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_, container, false);

        text = v.findViewById(R.id.editTextA);
        button = v.findViewById(R.id.buttonA);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        communicator.supplyData(text.getText().toString());

                    }
                }
        );

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            communicator = (Communicator) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement Communicator");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        communicator = null;
    }


    public interface Communicator {

        void supplyData(String data);
    }
}
