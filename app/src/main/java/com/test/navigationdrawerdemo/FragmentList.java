package com.test.navigationdrawerdemo;

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.widget.ArrayAdapter;

public class FragmentList extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] elements = {
                "🌿 Botanique",
                "🎨 Peinture",
                "📷 Photographie",
                "🎵 Musique",
                "✈️ Voyages",
                "🍃 Nature",
                "📚 Lecture",
                "🏃 Sport",
                "🍳 Cuisine",
                "🎭 Théâtre"
        };

        ArrayAdapter<String> adaptateur = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                elements
        );
        setListAdapter(adaptateur);
    }
}