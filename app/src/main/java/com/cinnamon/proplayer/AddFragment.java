package com.cinnamon.proplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

public class AddFragment extends Fragment {

    private View view;
    private GridLayout gridLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add,container,false);

        gridLayout = (GridLayout) view.findViewById(R.id.grid_layout);


        setSingleEvent(gridLayout);



        return view;

    }

    private void setSingleEvent(GridLayout gridLayout) {
        int i;
        for (i = 0; i <gridLayout.getChildCount();i++){
            CardView cardView = (CardView)gridLayout.getChildAt(i);
            final int item = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity().getApplicationContext(),"Abro fragment de "+item,Toast.LENGTH_SHORT).show();
                }
            });

        }
    }


}
