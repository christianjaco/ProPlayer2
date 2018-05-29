package com.cinnamon.proplayer.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.cinnamon.proplayer.Activities.MainActivity;
import com.cinnamon.proplayer.Adapters.RecyclerAdapter;
import com.cinnamon.proplayer.Adapters.RecyclerAdapterConvocatoria;
import com.cinnamon.proplayer.Adapters.RecyclerAdapterTeamStats;
import com.cinnamon.proplayer.Objects.Player;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;

public class AddLeagueMatchFragment extends Fragment {

    private View view;
    private GridLayoutManager gridLayoutManager;

    //private Spinner spinnerDia;
    //private Spinner spinnerZona;

    //private String[] itemsDia;
    //private String[] itemsZona;

    private List<Player>convocatoriaList;
    private Button button;
    private TextView txtSend;
    private FrameLayout header_convocados;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_match,container,false);

        initCustomSpinnerDays();
        initCustomSpinnerZone();

        convocatoriaList = new ArrayList<>();
        addPlayer();

        button = (Button)view.findViewById(R.id.boton_confirmar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Esperar confirmacion",Toast.LENGTH_LONG).show();
            }
        });

        txtSend = (TextView)view.findViewById(R.id.boton_texto_enviar);
        txtSend.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getContext(),"Mandar sin confirmacion",Toast.LENGTH_LONG).show();
                                       }
                                   }
        );

       /* spinnerDia = (Spinner)view.findViewById(R.id.spinner_dia);
        spinnerZona = (Spinner)view.findViewById(R.id.spinner_zona);

        itemsDia = getResources().getStringArray(R.array.lista_dias);
        itemsZona = getResources().getStringArray(R.array.lista_zonas);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,itemsDia);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDia.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapterZona = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,itemsZona);
        arrayAdapterZona.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerZona.setAdapter(arrayAdapterZona);*/

        header_convocados = (FrameLayout)view.findViewById(R.id.frame_convocados);
        header_convocados.setBackgroundResource(R.drawable.rounded_shape);
        GradientDrawable gradientDrawable = (GradientDrawable) header_convocados.getBackground();
        gradientDrawable.setColor(Color.rgb(57,57,57));

        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_convocatoria);
        gridLayoutManager= new GridLayoutManager(getContext(),3);

        recyclerView.setHasFixedSize(true);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());

        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //recyclerView.setAdapter(new RecyclerAdapterConvocatoria(convocatoriaList,getContext()));
        //recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerAdapterConvocatoria adapterConvocatoria = new RecyclerAdapterConvocatoria(convocatoriaList, getContext());
        recyclerView.setAdapter(adapterConvocatoria);


        return view;
    }

    private void initCustomSpinnerDays() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_dia);
        // Spinner Drop down elements
        ArrayList<String> itemsDia = new ArrayList<String>();
        itemsDia.add("Sabado");
        itemsDia.add("Domingo");

        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsDia);
        spinnerCustom.setAdapter(customSpinnerAdapter);
        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();

                //Toast.makeText(parent.getContext(), "Android Custom Spinner Example Output..." + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private void initCustomSpinnerZone() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_zona);
        // Spinner Drop down elements
        ArrayList<String> itemsDia = new ArrayList<String>();
        itemsDia.add("Belgrano");
        itemsDia.add("Nuñez");
        itemsDia.add("Palermo");

        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsDia);
        spinnerCustom.setAdapter(customSpinnerAdapter);
        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();

                //Toast.makeText(parent.getContext(), "Android Custom Spinner Example Output..." + item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public class CustomSpinnerAdapter extends BaseAdapter implements SpinnerAdapter {

        private final Context activity;
        private ArrayList<String> asr;

        public CustomSpinnerAdapter(Context context,ArrayList<String> asr) {
            this.asr=asr;
            activity = context;
        }



        public int getCount()
        {
            return asr.size();
        }

        public Object getItem(int i)
        {
            return asr.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }



        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            TextView txt = new TextView(getContext());
            txt.setPadding(16, 16, 16, 16);
            txt.setTextSize(18);
            txt.setGravity(Gravity.CENTER_VERTICAL);
            txt.setText(asr.get(position));
            txt.setTextColor(Color.parseColor("#000000"));
            return  txt;
        }

        public View getView(int i, View view, ViewGroup viewgroup) {
            TextView txt = new TextView(getContext());
            txt.setGravity(Gravity.CENTER);
            txt.setPadding(16, 16, 16, 16);
            txt.setTextSize(16);
            txt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_keyboard_arrow_down_black_24dp, 0);
            txt.setText(asr.get(i));
            txt.setTextColor(Color.parseColor("#000000"));
            return  txt;
        }

    }

    private void addPlayer(){
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Christian Jaco"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Nico Ferluga"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Fede Ferluga"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Rodrigo Ferluga"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Nacho Herrera"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Sebi Ferluga"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Juani Paillet"));
        convocatoriaList.add(new Player(R.drawable.profile_foto,"Nacho Leyro"));
    }
}
