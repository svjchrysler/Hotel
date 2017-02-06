package com.icescz.hotel.adapters;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.icescz.hotel.R;
import com.icescz.hotel.enums.EnumLayout;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

/**
 * Created by svjchrysler on 2/5/17.
 */

public class AdapterRegisterHotel extends PagerAdapter {

    private Context context;

    public AdapterRegisterHotel(Context context) {
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        EnumLayout enumLayout = EnumLayout.values()[position];
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(enumLayout.getLayoutResId(), container, false);

        switch (position) {
            case 0:
                SearchableSpinner spinner = (SearchableSpinner) layout.findViewById(R.id.scsDepartment);
                spinner.setTitle("Select");
                spinner.setPositiveButton("OK");


                break;
        }

        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public int getCount() {
        return EnumLayout.values().length;
    }

}
