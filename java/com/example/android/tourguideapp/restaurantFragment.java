package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class restaurantFragment extends Fragment {
    public restaurantFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.guide_item, container, false);
        ArrayList<guide> Guide = new ArrayList<>();
        Guide.add(new guide(getString(R.string.name_restaurant_place1), getString(R.string.baghl_address1), R.drawable.ketchup));
        Guide.add(new guide(getString(R.string.name_restaurant_place1), getString(R.string.baghl_address2), R.drawable.ketchup));
        Guide.add(new guide(getString(R.string.name_restaurant_place1), getString(R.string.baghl_address3), R.drawable.ketchup));
        Guide.add(new guide(getString(R.string.name_restaurant_place1), getString(R.string.baghl_address4), R.drawable.ketchup));
        Guide.add(new guide(getString(R.string.name_restaurant_place4), getString(R.string.taiba_address), R.drawable.taiba));
        Guide.add(new guide(getString(R.string.name_restaurant_place5), getString(R.string.EL_Sayad), R.drawable.el_seyad));
        Guide.add(new guide(getString(R.string.name_restaurant_place2), getString(R.string.ketchup_address), R.drawable.ketchup));
        Guide.add(new guide(getString(R.string.name_restaurant_place6), getString(R.string.EL_Sa3edy), R.drawable.el_sa3edy));
        Guide.add(new guide(getString(R.string.name_restaurant_place3), getString(R.string.Barbecue), R.drawable.barbecue));


        GuideAdapter adapter = new GuideAdapter(getActivity(), Guide, R.color.category_restaurant);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
