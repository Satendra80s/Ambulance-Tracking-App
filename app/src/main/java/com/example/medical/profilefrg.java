package com.example.medical;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class profilefrg extends Fragment {
Button faq ,policy,term;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profilefrg, container, false);

        faq = view.findViewById(R.id.button2);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),faq.class);
                startActivity(intent);
            }
        });
        policy = view.findViewById(R.id.button4);
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),policy.class);
                startActivity(intent);
            }
        });
        term = view.findViewById(R.id.button5);
        term.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),terms.class);
                startActivity(intent);
            }
        });
        return view;
    }

}