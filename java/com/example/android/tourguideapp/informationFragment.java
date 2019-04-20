package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class informationFragment extends Fragment {
    public informationFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.guide_item, container, false);
        ArrayList<guide> Guide = new ArrayList<>();
        Guide.add(new guide(getString(R.string.microbas_cars), getString(R.string.microbas)));
        Guide.add(new guide(getString(R.string.taxi_cars), getString(R.string.taxi)));
        Guide.add(new guide(getString(R.string.Qesm_Tani_police), getString(R.string.qesm_tani_address)));
        Guide.add(new guide(getString(R.string.toktok1), getString(R.string.toktok)));
        Guide.add(new guide(getString(R.string.mawqaf_sha3bya), getString(R.string.mawqaf_sha3bya_address)));
        Guide.add(new guide(getString(R.string.mawqaf_mansoura), getString(R.string.mawqaf_mansoura_address)));

        GuideAdapter adapter = new GuideAdapter(getActivity(), Guide, R.color.category_information);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
