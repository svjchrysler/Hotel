package com.icescz.hotel.enums;

import com.icescz.hotel.R;

/**
 * Created by svjchrysler on 2/5/17.
 */

public enum EnumLayout {

    ONE(R.layout.form_register_hotel_one),
    TWO(R.layout.form_register_hotel_two),
    THREE(R.layout.form_register_hotel_three),
    FOUR(R.layout.form_register_hotel_four);

    private int layoutResId;

    EnumLayout(int layoutResId) {
        this.layoutResId = layoutResId;
    }

    public int getLayoutResId() {
        return this.layoutResId;
    }
}
