package com.cinnamon.proplayer.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import com.cinnamon.proplayer.Adapters.ViewPagerAdapter;
import com.cinnamon.proplayer.R;

public class SearchFragment extends Fragment {

    private View view;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView framePlayers;
    private FloatingActionButton floatingActionButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search,container,false);
/*
       // toolbar = (Toolbar) view.findViewById(R.id.search_players_toolbar);
       // ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);


        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_search);
        viewPager = (ViewPager)view.findViewById(R.id.search_view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new ExploreLeaguesFragment(),"Ligas");
        adapter.addFragment(new ExploreStatisticsFragment(),"Estadisticas");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        -------------------------------------------------------------------------------------------*/

        framePlayers=(ImageView)view.findViewById(R.id.frame_jugador_convocatoria);
        floatingActionButton = (FloatingActionButton)view.findViewById(R.id.fab_add_video);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Agregar Video",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }



    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater menuInflater) {
        getActivity().getMenuInflater().inflate(R.menu.menu_search_bar,menu);
        final MenuItem searchItem = menu.findItem(R.id.search_players);
        final SearchView searchView =(SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                Toast.makeText(getContext(),newText,Toast.LENGTH_SHORT).show();
                traerDatos(newText);
                return false;
            }
        });

    }

    public void traerDatos(String cadena){
        //Buscar en base de datos
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
