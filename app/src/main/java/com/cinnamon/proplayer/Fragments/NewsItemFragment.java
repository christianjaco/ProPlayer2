package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cinnamon.proplayer.R;

public class NewsItemFragment extends Fragment {
    private View view;
    public static final String TXT = "clave";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_news,container,false);



        /*Bundle bundle = this.getArguments();
        bundle.getString(TXT).toString();
        if (bundle != null) {
            String myInt = bundle.getString("clave");
        }

        TextView textView = (TextView)view.findViewById(R.id.txt_item_news);
        textView.setText(bundle);
        */

        return view;
    }
}
