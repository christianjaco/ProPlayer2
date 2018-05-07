package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.ViewPagerAdapter;
import com.cinnamon.proplayer.R;

public class AddFragment extends Fragment {

    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    //private GridLayout gridLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add,container,false);

        //gridLayout = (GridLayout) view.findViewById(R.id.grid_layout);
        //setSingleEvent(gridLayout);

        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_add);
        viewPager = (ViewPager)view.findViewById(R.id.add_view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new AddLeagueMatchFragment(),"Torneo");
        adapter.addFragment(new AddFriendlyMatchFragment(),"Amistoso");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;

    }

    /*private void setSingleEvent(GridLayout gridLayout) {
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
    }*/


}
