package com.oliver.oltravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.oliver.oltravel.Fragment.OLFindFragment;
import com.oliver.oltravel.Fragment.OLMainFragment;
import com.oliver.oltravel.Fragment.OLMeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private OLFindFragment findFragment = new OLFindFragment();
    private OLMainFragment mainFragment = new OLMainFragment();
    private OLMeFragment   meFragment   = new OLMeFragment();

    protected LinearLayout mainLayout;
    protected LinearLayout findLayout;
    protected LinearLayout meLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.OL_container_content,mainFragment)
                .add(R.id.OL_container_content,findFragment)
                .add(R.id.OL_container_content,meFragment)
                .hide(findFragment)
                .hide(meFragment)
                .commit();

        initViews();

    }



    public void  initViews(){

        mainLayout   = findViewById(R.id.menu_main);
        findLayout   = findViewById(R.id.menu_find);
        meLayout     = findViewById(R.id.menu_me);

        mainLayout.setOnClickListener(this);
        findLayout.setOnClickListener(this);
        meLayout.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_main:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(findFragment)
                        .hide(meFragment)
                        .show(mainFragment)
                        .commit();
                break;
            case R.id.menu_find:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(findFragment)
                        .hide(meFragment)
                        .hide(mainFragment)
                        .commit();
                break;
            case R.id.menu_me:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(findFragment)
                        .show(meFragment)
                        .hide(mainFragment)
                        .commit();
                break;
        }
    }
}
