package com.milk.bread.milkandbread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Home extends AppCompatActivity implements View.OnClickListener {
    ImageView ivCloseDrawer;
    TextView tvHome;
    String TAG="main";
    RelativeLayout rl_slide_layout;
    LinearLayout llLeftDrawer;
    ImageButton cart,menu,account;
    private ImageSwitcher sw;
    Fragment fragment;
    Button milk,promo,selling,fruit,product,vegetable,food,cabbage,brocolli,carrot,potato,rice,salad;
    ViewFlipper vflipper;
    ImageView slide1,slide2;
    TextView tvVegetables;
    LinearLayout ll_list_vegetable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        ivCloseDrawer = findViewById(R.id.ivCloseDrawer);
        vflipper=findViewById(R.id.v_flipper);// to make it move able
        slide1=findViewById(R.id.slide1); // slide 1
        slide2=findViewById(R.id.slide2);// slide 2
        promo=findViewById(R.id.promo);
        selling=findViewById(R.id.selling);
        fruit=findViewById(R.id.fruits);
        product=findViewById(R.id.newpdt);
        vegetable=findViewById(R.id.vegetables);
        food=findViewById(R.id.fastfood);
        cabbage=findViewById(R.id.Cabbage);
        carrot=findViewById(R.id.Carrot);
        brocolli=findViewById(R.id.broccoli);
        salad=findViewById(R.id.Salad);
        potato=findViewById(R.id.Potato);
        rice=findViewById(R.id.Rice);
        milk=findViewById(R.id.milk);
        menu=findViewById(R.id.menu);
        tvVegetables=findViewById(R.id.tvVegetables);
        ll_list_vegetable=findViewById(R.id.ll_list_vegetable);
        account=findViewById(R.id.account);
        llLeftDrawer=findViewById(R.id.llLeftDrawer);
        tvHome=findViewById(R.id.tvHome);
        llLeftDrawer.setVisibility(View.GONE);
        cart=findViewById(R.id.cart);


        cart.setOnClickListener(this);
        milk.setOnClickListener(this);
        promo.setOnClickListener(this);
        selling.setOnClickListener(this);
        fruit.setOnClickListener(this);
        product.setOnClickListener(this);
        vegetable.setOnClickListener(this);
        food.setOnClickListener(this);
        account.setOnClickListener(this);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation RightSwipe = AnimationUtils.loadAnimation(Home.this, R.anim.anim_slide_in_right);
                llLeftDrawer.startAnimation(RightSwipe);
                llLeftDrawer.setVisibility(View.VISIBLE);
            }
        });
        tvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        ivCloseDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llLeftDrawer.setVisibility(View.GONE);
            }
        });
        tvVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ll_list_vegetable.setVisibility(View.VISIBLE);

                if(ll_list_vegetable.getVisibility() == View.VISIBLE){
                    ll_list_vegetable.setVisibility(View.GONE);
                }
                else
                    {
                    ll_list_vegetable.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.milk:
                Intent i = new Intent(this, milk.class);
                startActivity(i);
                break;
            case R.id.promo:
                Toast.makeText(this,"promo clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.selling:
                Toast.makeText(this,"selling clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fruit:
                Toast.makeText(this,"fruit clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.newpdt:
                Toast.makeText(this,"New Product clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.vegetable:
                Toast.makeText(this,"vegetable clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fastfood:
                Toast.makeText(this,"Fast food  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Cabbage:
                Toast.makeText(this,"Cabbage  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Carrot:
                Toast.makeText(this,"Carrot  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.broccoli:
                Toast.makeText(this,"broccoli  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Potato:
                Toast.makeText(this,"Potato  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Rice:
                Toast.makeText(this,"Rice  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Salad:
                Toast.makeText(this,"Salad  clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu:
                Animation RightSwipe = AnimationUtils.loadAnimation(Home.this, R.anim.anim_slide_in_right);
                llLeftDrawer.startAnimation(RightSwipe);
                llLeftDrawer.setVisibility(View.VISIBLE);
                break;
            case R.id.ivCloseDrawer:
                llLeftDrawer.setVisibility(View.GONE);
                break;
            case R.id.account:
                Intent intent1 = new Intent(Home.this,MyAccount.class);
                startActivity(intent1);
                break;
            case R.id.cart:
                Intent intent2=new Intent(Home.this,cart.class);
                startActivity(intent2);
                break;

                default:
                break;
        }
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment);
        transaction.addToBackStack(null);
        // transaction.addToBackStack("home_frag");
        transaction.commit();
    }
}
