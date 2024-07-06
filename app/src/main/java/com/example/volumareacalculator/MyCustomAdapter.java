package com.example.volumareacalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape>  shapesArrayList;
    Context context;

    public MyCustomAdapter(Context context , ArrayList<Shape> shape){
        super(context, R.layout.grid_item_layout,shape);
        this.shapesArrayList = shape;
        this.context = context;
    }

   static public class ViewHolder{
        ImageView imge;
        TextView txt;
    }

    public  View getView(int position , View convertView , ViewGroup parent){
      Shape shape = getItem(position);

      ViewHolder viewHolder;
      if(convertView == null){
          viewHolder = new ViewHolder();
          LayoutInflater inflater=LayoutInflater.from(getContext());
          convertView = inflater.inflate(
                  R.layout.grid_item_layout,
                  parent,
                  false
          );

          viewHolder.imge = (ImageView) convertView.findViewById(R.id.imgView);
          viewHolder.txt = (TextView) convertView.findViewById(R.id.textView);
          convertView.setTag(viewHolder);
      }
      else{
          viewHolder = (ViewHolder) convertView.getTag();
      }

      viewHolder.imge.setImageResource(shape.getImg());
      viewHolder.txt.setText(shape.getText());

      return convertView;

    }


}
