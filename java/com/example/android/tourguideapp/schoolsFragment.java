package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class schoolsFragment extends Fragment {


    public schoolsFragment() {
        // Required empty public constructor

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.guide_item, container, false);
        ArrayList<guide> Guide = new ArrayList<>();
        Guide.add(new guide(getString(R.string.name_school_place1), getString(R.string.talat_harb_address), R.drawable.talat_harb_school));
        Guide.add(new guide(getString(R.string.name_school_place2), getString(R.string.salah_eldien_address), R.drawable.salah_eldien));
        Guide.add(new guide(getString(R.string.name_school_place3), getString(R.string.mahalla_sanywia_boys), R.drawable.mahalla_school));
        Guide.add(new guide(getString(R.string.name_school_place4), getString(R.string.glory_address), R.drawable.glory));
        Guide.add(new guide(getString(R.string.name_school_place5), getString(R.string.sadat_address), R.drawable.sadat));
        Guide.add(new guide(getString(R.string.name_school_place6), getString(R.string.aahd_elhadeeth_address), R.drawable.aahd_hadeth));

        GuideAdapter adapter = new GuideAdapter(getActivity(), Guide, R.color.category_schools);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
