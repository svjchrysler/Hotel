package com.icescz.hotel;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by svjchrysler on 2/7/17.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("dbhotel.realm")
                .schemaVersion(1)
                .build();

        Realm.setDefaultConfiguration(config);
    }
}
