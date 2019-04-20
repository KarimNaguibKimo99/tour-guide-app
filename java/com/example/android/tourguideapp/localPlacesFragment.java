package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class localPlacesFragment extends Fragment {

    public localPlacesFragment() {
        // Required empty public constructor

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_item, container, false);
        ArrayList<guide> Guide = new ArrayList<>();
        Guide.add(new guide(getString(R.string.name_local_place1), getString(R.string.abo_radi_address), R.drawable.abo_radi));
        Guide.add(new guide(getString(R.string.name_local_place2), getString(R.string.baladia_mahalla_stadium_address), R.drawable.baladia_mahalla_stadium));
        Guide.add(new guide(getString(R.string.name_local_place5), getString(R.string.Ghazal_mahalla_stadium_address), R.drawable.ghazal_mahalla_staduim));
        Guide.add(new guide(getString(R.string.name_local_place3), getString(R.string.entrance_Mahalla_address), R.drawable.enterance_mahalla));
        Guide.add(new guide(getString(R.string.name_local_place4), getString(R.string.fatah_allah_address), R.drawable.fatah_allah));
        Guide.add(new guide(getString(R.string.name_local_place9), getString(R.string.Qasr_Thakafa_address), R.drawable.qasr_thakafa));
        Guide.add(new guide(getString(R.string.name_local_place10), getString(R.string.Qesm_awal_address), R.drawable.qesm_awal));
        Guide.add(new guide(getString(R.string.name_local_place8), getString(R.string.police_center_address), R.drawable.police_center));
        Guide.add(new guide(getString(R.string.name_local_place7), getString(R.string.Ghazal_Mahalla_company_address), R.drawable.ghazl_mahalla_company));
        Guide.add(new guide(getString(R.string.name_local_place6), getString(R.string.Ghazal_mahalla_team_address), R.drawable.ghazal_mahalla_team));
        Guide.add(new guide(getString(R.string.name_local_place11), getString(R.string.Shokry_ELkotly_address), R.drawable.shokry_kotly));
        Guide.add(new guide(getString(R.string.name_local_place12), getString(R.string.train_station_address), R.drawable.train_station));


        GuideAdapter adapter = new GuideAdapter(getActivity(), Guide, R.color.category_local_places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
