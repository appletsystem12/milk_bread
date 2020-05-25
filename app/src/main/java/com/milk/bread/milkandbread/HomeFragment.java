package com.milk.bread.milkandbread;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    Button milk,promo,selling,fruit,product,vegetable,food,cabbage,brocolli,carrot,potato,rice,salad;
    ViewFlipper vflipper;
    ImageView slide1,slide2,ivCloseDrawer;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        vflipper=view.findViewById(R.id.v_flipper);// to make it move able
        slide1=view.findViewById(R.id.slide1); // slide 1
        slide2=view.findViewById(R.id.slide2);// slide 2
        promo=view.findViewById(R.id.promo);
        selling=view.findViewById(R.id.selling);
        fruit=view.findViewById(R.id.fruits);
        product=view.findViewById(R.id.newpdt);
        vegetable=view.findViewById(R.id.vegetables);
        food=view.findViewById(R.id.fastfood);
        cabbage=view.findViewById(R.id.Cabbage);
        carrot=view.findViewById(R.id.Carrot);
        brocolli=view.findViewById(R.id.broccoli);
        salad=view.findViewById(R.id.Salad);
        potato=view.findViewById(R.id.Potato);
        rice=view.findViewById(R.id.Rice);
        milk=view.findViewById(R.id.milk);

/*

        milk.setOnClickListener(this);
        promo.setOnClickListener(this);
        selling.setOnClickListener(this);
        fruit.setOnClickListener(this);
        product.setOnClickListener(this);
        vegetable.setOnClickListener(this);
        food.setOnClickListener(this);
*/



        return view;

    }
}
