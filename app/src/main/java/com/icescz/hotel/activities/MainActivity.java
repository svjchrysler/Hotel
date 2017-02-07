package com.icescz.hotel.activities;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.badoualy.stepperindicator.StepperIndicator;
import com.icescz.hotel.R;
import com.icescz.hotel.adapters.AdapterRegisterHotel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    @BindView(R.id.indicator)
    StepperIndicator indicator;

    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @BindView(R.id.tvTitleRegisterHotel)
    TextView tvTitleRegisterHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        configInit();
    }

    private void configInit() {
        viewpager.setAdapter(new AdapterRegisterHotel(this));
        indicator.setViewPager(viewpager, 4);
        indicator.setCurrentStep(0);
        viewpager.addOnPageChangeListener(this);
        changeTitleViewPage(0);
    }

    @OnClick(R.id.fabRegisterHotel)
    void registerHotel() {
        EditText edtRazonSocial = (EditText)viewpager.getChildAt(0).findViewById(R.id.edtRazonSocial);
        Toast.makeText(this, edtRazonSocial.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        changeTitleViewPage(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private void changeTitleViewPage(int position) {
        switch (position) {
            case 0:
                tvTitleRegisterHotel.setText(getString(R.string.main_title).toUpperCase());
                break;
            case 1:
                tvTitleRegisterHotel.setText(getString(R.string.main_title).toUpperCase());
                break;
            case 2:
                tvTitleRegisterHotel.setText(getString(R.string.main_titlePersonal).toUpperCase());
                break;
            case 3:
                tvTitleRegisterHotel.setText(getString(R.string.main_titlehotel).toUpperCase());
                break;
        }
    }
}
