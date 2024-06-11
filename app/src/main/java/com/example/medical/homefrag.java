package com.example.medical;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class homefrag extends Fragment {

Button button,track;
ImageButton lab;
    ImageButton callc;
    ImageButton pharmacye;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_homefrag, container, false);
        button = view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "booking", Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(getActivity(),book.class);
                startActivity(intent);
            }
        });
      lab = view.findViewById(R.id.imageButton5);
      lab.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent= new Intent(getActivity(), lab.class);
              startActivity(intent);
          }
      });

        callc = view.findViewById(R.id.imageButton3);
        callc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),callcenter.class);
                startActivity(intent);
            }
        });

        pharmacye = view.findViewById(R.id.imageButton4);
        pharmacye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),pharmcye.class);
                startActivity(intent);
            }
        });

       track = view.findViewById(R.id.track);
       track.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(),TRACK.class);
               startActivity(intent);
           }
       });

return view;
    }
}