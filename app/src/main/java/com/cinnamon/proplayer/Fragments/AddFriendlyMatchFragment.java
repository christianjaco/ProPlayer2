package com.cinnamon.proplayer.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.cinnamon.proplayer.Adapters.RecyclerAdapterFixture;
import com.cinnamon.proplayer.Objects.Match;
import com.cinnamon.proplayer.R;

import java.util.ArrayList;
import java.util.List;

public class AddFriendlyMatchFragment extends Fragment {
    private View view;
    private ImageView escudoLocal;
    private ImageView escudoDesconocido;
    private ImageView estadio;
    private TextView nombreLocal;
    private TextView seleccionarRival;
    private TextView precioCondicional;
    private Button button;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_friendly,container,false);


        initCustomSpinnerDays();
        initCustomSpinnerTime();
        initCustomSpinnerZone();
        initCustomSpinnerPlayers();


        escudoLocal = (ImageView) view.findViewById(R.id.escudo_local_friendly);
        escudoDesconocido = (ImageView) view.findViewById(R.id.escudo_visitante_friendly);
        estadio = (ImageView) view.findViewById(R.id.estadio_friendly);
        escudoLocal.setImageResource(R.drawable.escudo_gordos);
        escudoDesconocido.setImageResource(R.drawable.unknown_team);
        nombreLocal = (TextView) view.findViewById(R.id.nombre_equipo_local);
        seleccionarRival = (TextView) view.findViewById(R.id.nombre_equipo_visitante);
        precioCondicional = (TextView)view.findViewById(R.id.texto_precio_condicional);

        button = (Button)view.findViewById(R.id.boton_proponer_amistoso);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Proponer amistoso",Toast.LENGTH_LONG).show();
            }
        });

        nombreLocal.setText("Gordos Rocket");
        seleccionarRival.setText("Equipo Rival");
        estadio.setColorFilter(Color.BLACK);


        escudoDesconocido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Abro popup recycler",Toast.LENGTH_LONG).show();

            }
        });



        return view;
    }



    private void initCustomSpinnerDays() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_dia_friendly);
        // Spinner Drop down elements
        ArrayList<String> itemsDia = new ArrayList<String>();
        itemsDia.add("Lunes");
        itemsDia.add("Martes");
        itemsDia.add("Miercoles");
        itemsDia.add("Jueves");
        itemsDia.add("Viernes");
        itemsDia.add("Sabado");
        itemsDia.add("Domingo");

        AddFriendlyMatchFragment.CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsDia);
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
    private void initCustomSpinnerTime() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_hora_friendly);
        // Spinner Drop down elements
        ArrayList<String> itemsHora = new ArrayList<String>();
        itemsHora.add("17:00");
        itemsHora.add("18:00");
        itemsHora.add("19:00");
        itemsHora.add("20:00");
        itemsHora.add("21:00");
        itemsHora.add("22:00");

        AddFriendlyMatchFragment.CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsHora);
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
    private void initCustomSpinnerPlayers() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_cantidad_jugadores);
        // Spinner Drop down elements
        ArrayList<String> itemsJugadores = new ArrayList<String>();
        itemsJugadores.add("5 Jugadores");
        itemsJugadores.add("6 Jugadores");
        itemsJugadores.add("7 Jugadores");
        itemsJugadores.add("8 Jugadores");
        itemsJugadores.add("9 Jugadores");
        itemsJugadores.add("10 Jugadores");



        AddFriendlyMatchFragment.CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsJugadores);
        spinnerCustom.setAdapter(customSpinnerAdapter);
        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = parent.getItemAtPosition(position).toString();

                //Toast.makeText(parent.getContext(), "Android Custom Spinner Example Output..." + item, Toast.LENGTH_LONG).show();

                if (item == "5 Jugadores"){
                    precioCondicional.setText("$150");
                }else if (item == "6 Jugadores"){
                    precioCondicional.setText("$137");
                }else if (item == "7 Jugadores"){
                    precioCondicional.setText("$125");
                }else if (item == "8 Jugadores"){
                    precioCondicional.setText("$116");
                }else if (item == "9 Jugadores"){
                    precioCondicional.setText("$108");
                } else if (item == "10 Jugadores"){
                    precioCondicional.setText("$100");
        }
    }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initCustomSpinnerZone() {

        Spinner spinnerCustom = (Spinner) view.findViewById(R.id.spinner_zona_friendly);
        // Spinner Drop down elements
        ArrayList<String> itemsZona = new ArrayList<String>();
        itemsZona.add("Belgrano");
        itemsZona.add("Nuñez");
        itemsZona.add("Palermo");
        itemsZona.add("Saavedra");
        itemsZona.add("Colegiales");


        AddFriendlyMatchFragment.CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),itemsZona);
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
}
