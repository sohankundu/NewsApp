package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news article
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {

        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items, parent, false);
        }

        // Find the news article at the given position in the list of news
        News currentBook = getItem(position);

        // Find the TextView with view ID web_title
        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title);
        // Display the title of the current news in that TextView
        webTitleView.setText(currentBook.getWebTitle());

        // Find the TextView with view ID section_name
        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        // Display the section name of the current news article in that TextView
        sectionNameView.setText(currentBook.getSectionName());

        // Find the TextView with view ID web_publication_date
        TextView webPublicationDateView = (TextView) listItemView.findViewById(
                R.id.web_publication_date);
        // Display the date of publication of the current news article in that TextView
        webPublicationDateView.setText(currentBook.getWebPublicationDate());

        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }
}
