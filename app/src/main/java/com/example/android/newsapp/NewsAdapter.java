package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by novembergave on 23/12/2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        News currentNewsItem = getItem(position);

        String originalDate = currentNewsItem.getDate();
        String finalDate;
        String finalTime;

        String[] parts = originalDate.split("T");
        finalDate = parts[0];
        finalTime = parts[1];
        String finalTimeLessZ = finalTime.substring(0, finalTime.lastIndexOf("Z"));


        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_text_view);
        sectionTextView.setText(currentNewsItem.getSection());

        TextView headlineTextView = (TextView) listItemView.findViewById(R.id.headline_text_view);
        headlineTextView.setText(currentNewsItem.getTitle());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(finalDate);

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        timeTextView.setText(finalTimeLessZ);

        return listItemView;
    }


}
