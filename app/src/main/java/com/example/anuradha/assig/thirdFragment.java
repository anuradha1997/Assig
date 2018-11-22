package com.example.anuradha.assig;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class thirdFragment extends Fragment {
    TextView t2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_third, container, false);
        Bundle b=getArguments();
        String data=b.getString("name_key");
        t2.setText(data);
        return v;
    }

}
