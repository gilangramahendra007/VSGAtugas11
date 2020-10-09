package com.example.aplikasisqlite.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aplikasisqlite.model.Data;
//import androidx.work.Data;

import com.example.aplikasisqlite.R;

import java.util.List;

import static com.example.aplikasisqlite.model.Data.*;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public Adapter(Activity activity, List<Data> items){
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount(){
        return items.size();
    }

    @Override
    public Object getItem(int location){
        return items.get(location);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView== null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView adress = (TextView) convertView.findViewById(R.id.address);
       // double num1,num2,num3;
       // num1 = Double.parseDouble(id.getText().toString());
       // num2 = Double.parseDouble(name.getText().toString());
       // num2 = Double.parseDouble(adress.getText().toString());
        Data data = items.get(position);
        //for (Data data : items)
        //{
          //  List<String> id.setText(com.example.aplikasisqlite.model.Data.getId());
        //}
        id.setText(com.example.aplikasisqlite.model.Data.getId());
        name.setText(com.example.aplikasisqlite.model.Data.getName());
        adress.setText(com.example.aplikasisqlite.model.Data.getAddress());

        return convertView;

    }

}
