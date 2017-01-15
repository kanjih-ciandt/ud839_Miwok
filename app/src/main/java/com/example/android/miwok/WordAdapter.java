package com.example.android.miwok;



import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by kneto on 12/8/16.
 */

public class WordAdapter extends ArrayAdapter<Word>{



    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int colorResource;




    public WordAdapter(Activity context, ArrayList<Word> words,  int colorResource) {

        super(context, 0, words);
        this.colorResource = colorResource;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        View textView = listItemView.findViewById(R.id.text_container);
        textView.setBackgroundResource(colorResource);

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView minwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        minwokTextView.setText(currentWord.getMinworkWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.getImageResourceId() > 0) {
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(imageView.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }



}
