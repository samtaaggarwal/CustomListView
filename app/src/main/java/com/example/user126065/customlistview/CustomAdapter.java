package com.example.user126065.customlistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user126065 on 5/3/17.
 */

public class CustomAdapter extends ArrayAdapter<String>
{
    CustomAdapter(Context context, String[] names)
    {
        super(context,R.layout.custom_view_activity,names);

    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater myinflater = LayoutInflater.from(getContext());
        View customView = myinflater.inflate(R.layout.custom_view_activity,parent, false);

        String rowItem = getItem(position);
        TextView rowText = (TextView) customView.findViewById(R.id.customTextView);
        ImageView rowImage = (ImageView) customView.findViewById(R.id.customImageView);

        rowText.setText(rowItem);
        rowImage.setImageResource(R.drawable.welcome);

        return customView;

    }
}
