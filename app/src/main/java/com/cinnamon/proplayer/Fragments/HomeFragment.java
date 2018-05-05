package com.cinnamon.proplayer.Fragments;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cinnamon.proplayer.Adapters.ViewPagerAdapter;
import com.cinnamon.proplayer.R;

/*
xml:fragment_home
Fragment que se apoya sobre el MainActivity
Implementa el ViewPagerAdapter
 */

public class HomeFragment extends Fragment {

    View view;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home,container,false);

        //Relaciono al xml
        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_home);
        appBarLayout = (AppBarLayout)view.findViewById(R.id.appbar_id);
        viewPager = (ViewPager)view.findViewById(R.id.home_view_pager);

        //Hago la imagen de perfil redonda
        Drawable originalDrawable = getResources().getDrawable(R.drawable.profile_foto);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();
        RoundedBitmapDrawable roundedDrawable = RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView) view.findViewById(R.id.image_view_profile);

        imageView.setImageDrawable(roundedDrawable);


        //Le seteo el view pager para poder navegar entre los fragments
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());

        //Creo los fragments para el Home
        adapter.addFragment(new MailboxFragment(),"Buzón");
        adapter.addFragment(new TeamStatsFragment(),"Plantilla");
        adapter.addFragment(new LeagueStatsFragment(),"Liga");
        adapter.addFragment(new FixtureFragment(),"Forma");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

}
