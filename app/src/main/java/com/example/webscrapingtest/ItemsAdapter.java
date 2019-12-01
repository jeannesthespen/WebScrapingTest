package com.example.webscrapingtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Item> {
    private Context context;
    int mResource;
    static class ViewHolder {
        TextView textViewName, textViewPrice;
        ImageView imageViewItem;
    }

    public ItemsAdapter(Context context, int resource, ArrayList<Item> items) {
        super(context, resource, items);
        this.context = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String itemName = getItem(position).getItemName();
        double itemPrice = getItem(position).getItemPrice();

        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.textViewName = (TextView) convertView.findViewById(R.id.textViewName);
            holder.textViewPrice = (TextView) convertView.findViewById(R.id.textViewPriceNew);
            holder.imageViewItem = (ImageView) convertView.findViewById(R.id.imageViewItem);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textViewName.setText(itemName);
        holder.textViewPrice.setText(String.valueOf(itemPrice));

        return convertView;
    }
}