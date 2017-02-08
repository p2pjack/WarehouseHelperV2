package com.uk.umf_solutions.warehousehelperv2.core;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.squareup.otto.Bus;
import com.uk.umf_solutions.warehousehelperv2.core.Dagger.AppComponent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Eaun-Ballinger on 08/02/2017.
 *
 *
 */

public class Application extends android.app.Application {
    private Bus bus;
    public Bus getBus()
    {
        return bus;
    }

    private SharedPreferences sharedPreferences;

    private static Application instance = new Application();
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        instance.bus = new Bus();
        getAppComponent();
        initDefaultProducts();
        initRealm();
    }

    private void initRealm() {
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("pronto_shop.realm")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(configuration);

        Realm realm = Realm.getDefaultInstance();
    }


    public AppComponent getAppComponent() {
        if (appComponent == null){

        }
        return appComponent;
    }

    private void initDefaultProducts() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
//        if (sharedPreferences.getBoolean(Constants.FIRST_RUN, true)) {
//            startService(new Intent(this, AddInitialDataService.class));
//            editor.putBoolean(Constants.FIRST_RUN, false).commit();
        }

}
