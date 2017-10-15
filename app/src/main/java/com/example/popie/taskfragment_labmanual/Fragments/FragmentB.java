package com.example.popie.taskfragment_labmanual.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.popie.taskfragment_labmanual.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Communicator} interface
 * to handle interaction events.
 */
public class FragmentB extends Fragment {

    EditText editText;
    private Communicator communicator;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragment_b, container, false);
        editText = v.findViewById(R.id.editTextB);
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Communicator) {
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

    public void updateB(String data) {
        editText.setText(data);
    }

    public interface Communicator {

        //void supplyData(String data);


    }
}
