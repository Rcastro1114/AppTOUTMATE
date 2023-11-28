package com.example.tourmate.Activitys;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tourmate.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;


public class InicioFragment extends Fragment {

    public InicioFragment() {
        // Required empty public constructor
    }
    ImageView imageView;
    ImageCarousel carousel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        carousel = view.findViewById(R.id.carrusel);
        carousel.registerLifecycle(getLifecycle());

        List<CarouselItem> list = new ArrayList<>();

        list.add(new CarouselItem(
                "https://firebasestorage.googleapis.com/v0/b/tourmate-4e042.appspot.com/o/sonsonate%2FDestinationSonsonate.jpg?alt=media&token=7955f9a0-73bf-4125-8140-79674e24704e",
                "FOTO DE SONSONATE"
        ));

        list.add(new CarouselItem(
                "https://firebasestorage.googleapis.com/v0/b/tourmate-4e042.appspot.com/o/sonsonate%2FFT2Gh8lXEAIyAA9.jpg?alt=media&token=4982e852-95e6-4dea-a1d3-abbf301e2b54",
                "FOTO DE SONSONATE"
        ));

        list.add(new CarouselItem(
                "https://firebasestorage.googleapis.com/v0/b/tourmate-4e042.appspot.com/o/sonsonate%2FSonsonate90.jpg?alt=media&token=188d9283-818a-49c3-b1db-a0b2f9a9273e",
                "FOTO DE SONSONATE"
        ));


        carousel.setData(list);
        /*
        imageView = view.findViewById(R.id.imagen_prueba);

        Glide
                .with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/tourmate-4e042.appspot.com/o/sonsonate%2FDestinationSonsonate.jpg?alt=media&token=7955f9a0-73bf-4125-8140-79674e24704e")
                .into(imageView);
        */
        return view;
    }
}