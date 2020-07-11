package vn.edu.ntu.kt593_dieptuydung_59130401;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class dau extends Fragment {

    NavController navController;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_dau, container, false);
        addView(view);
        addEvent();
        return view;
    }


    private void addView(View view) {
        ((MainActivity)getActivity()).toolbar.setTitle("Layout dau");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        navController = NavHostFragment.findNavController(dau.this);
        ((MainActivity)getActivity()).navController = navController;

        button = view.findViewById(R.id.button2);

    }
    private void addEvent() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_dau_to_cuoi);
            }
        });
    }

}