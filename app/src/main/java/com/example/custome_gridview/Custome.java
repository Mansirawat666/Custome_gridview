package com.example.custome_gridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class Custome extends ArrayAdapter {
    Activity a;
    String[] s;
    Integer[] i;
    public Custome(@NonNull Context context, String[] resource, Integer[] textViewResourceId) {
        super(context, R.layout.activity_main,resource);
        a=(Activity)context;
        s=resource;
        i=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater lf=a.getLayoutInflater();
        convertView = lf.inflate(R.layout.customlist,null,true);
        ImageView im=convertView.findViewById(R.id.i1);
        TextView tw=convertView.findViewById(R.id.t1);
        im.setImageResource(i[position]);
        tw.setText(s[position]);
        return convertView;



    }
}
