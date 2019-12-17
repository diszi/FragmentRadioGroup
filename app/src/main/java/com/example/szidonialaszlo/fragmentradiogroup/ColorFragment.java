package com.example.szidonialaszlo.fragmentradiogroup;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import java.nio.BufferUnderflowException;

/**
 * Created by szidonia.laszlo on 2017. 10. 30..
 */

public class ColorFragment extends Fragment
{

    private RadioGroup color_group;
    OnColorChangeListener onColorChangeListener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_layout,container,false);

        color_group = (RadioGroup) view.findViewById(R.id.color_group);
        color_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.red:

                }
            }
        });
        return view;
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        onColorChangeListener = activity;
    }

    public interface OnColorChangeListener{
        public void colorChange(String colorName);
    }
}
