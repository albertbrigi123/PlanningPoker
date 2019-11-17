package com.example.admin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class Form extends Fragment {
   private EditText name;
   private EditText gname;
   private Button createGroupBtn;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_form,container,false);

        name=v.findViewById(R.id.name);
        gname=v.findViewById(R.id.groupName);
        createGroupBtn=v.findViewById(R.id.createGroupButton);

        createGroupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new QuestionFragment());
                fr.commit();
            }
        });
        return v;
    }

}
