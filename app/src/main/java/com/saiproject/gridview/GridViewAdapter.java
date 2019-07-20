package com.saiproject.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridViewAdapter extends BaseAdapter {

    int[] animalImages = {R.drawable.bear,R.drawable.cat,R.drawable.dog,R.drawable.sheep,R.drawable.lion,R.drawable.tiger,R.drawable.horse,R.drawable.cow};
    String[] animalNames = {"Bear","Cat","Dog","Sheep","Lion","Tiger","Horse","Cow"};


    Context context;

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return animalImages.length;
    }

    @Override
    public Object getItem(int position) {
        return animalImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imgView = new ImageView(context); //Create an image in that context
        imgView.setImageResource(animalImages[position]);
        imgView.setLayoutParams(new GridView.LayoutParams(200,200));
        imgView.setPadding(10,10,10,10);
        imgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,animalNames[position],Toast.LENGTH_SHORT).show();
            }
        });

        return imgView;
    }
}
