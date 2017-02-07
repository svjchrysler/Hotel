package com.icescz.hotel.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
                SearchableSpinner spinnerDeparment = (SearchableSpinner) layout.findViewById(R.id.scsDepartment);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context, R.array.department, android.R.layout.simple_spinner_dropdown_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerDeparment.setAdapter(adapter);
                spinnerDeparment.setTitle("Departamentos");
                spinnerDeparment.setPositiveButton("OK");

                SearchableSpinner spinnerProvince = (SearchableSpinner)layout.findViewById(R.id.scsProvince);
                spinnerProvince.setAdapter(adapter);
                spinnerProvince.setTitle("Provincias");
                spinnerProvince.setPositiveButton("OK");

                SearchableSpinner spinnerCity = (SearchableSpinner)layout.findViewById(R.id.scsCity);
                spinnerCity.setAdapter(adapter);
                spinnerCity.setTitle("Ciudades");
                spinnerCity.setPositiveButton("OK");
                break;
            case 1:
                SearchableSpinner spinnerCategoryHotel = (SearchableSpinner)layout.findViewById(R.id.scsCategoryHotel);
                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(context, R.array.department, android.R.layout.simple_spinner_dropdown_item);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerCategoryHotel.setAdapter(adapter1);
                spinnerCategoryHotel.setTitle("Categoria Hotel");
                spinnerCategoryHotel.setPositiveButton("OK");
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
