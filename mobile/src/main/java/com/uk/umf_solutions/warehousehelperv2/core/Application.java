package com.uk.umf_solutions.warehousehelperv2.core;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.squareup.otto.Bus;
import com.uk.umf_solutions.warehousehelperv2.Model.Cigma;
import com.uk.umf_solutions.warehousehelperv2.Model.Notes;
import com.uk.umf_solutions.warehousehelperv2.Model.Suppliers;
import com.uk.umf_solutions.warehousehelperv2.Model.Wms;
import com.uk.umf_solutions.warehousehelperv2.core.Dagger.AppComponent;

import java.util.concurrent.atomic.AtomicLong;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

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

    public static AtomicLong notePrimaryKey;
    public static AtomicLong cigmaPrimaryKey;
    public static AtomicLong wmsPrimaryKey;
    public static AtomicLong suppliersPrimaryKey;

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

        try {
            notePrimaryKey = new AtomicLong(realm.where(Notes.class).max("noteId").longValue());
        } catch (Exception e) {
            realm.beginTransaction();
            Notes transaction = new Notes();
            transaction.setNoteId(0);
            realm.copyToRealm(transaction);
            notePrimaryKey = new AtomicLong(realm.where(Notes.class).max("noteId").longValue());
            RealmResults<Notes> realmResults = realm.where(Notes.class).equalTo("noteId",0).findAll();
            realmResults.deleteAllFromRealm();
            realm.commitTransaction();
        }
        try {
            cigmaPrimaryKey = new AtomicLong(realm.where(Cigma.class).max("cigmaId").longValue());
        } catch (Exception e) {
            realm.beginTransaction();
            Cigma transaction = new Cigma();
            transaction.setCigmaId(0);
            realm.copyToRealm(transaction);
            cigmaPrimaryKey = new AtomicLong(realm.where(Cigma.class).max("cigmaId").longValue());
            RealmResults<Cigma> realmResults = realm.where(Cigma.class).equalTo("cigmaId",0).findAll();
            realmResults.deleteAllFromRealm();
            realm.commitTransaction();
        }
        try {
            wmsPrimaryKey = new AtomicLong(realm.where(Wms.class).max("wmsId").longValue());
        } catch (Exception e) {
            realm.beginTransaction();
            Wms transaction = new Wms();
            transaction.setWmsId(0);
            realm.copyToRealm(transaction);
            wmsPrimaryKey = new AtomicLong(realm.where(Wms.class).max("wmsId").longValue());
            RealmResults<Wms> realmResults = realm.where(Wms.class).equalTo("wmsId",0).findAll();
            realmResults.deleteAllFromRealm();
            realm.commitTransaction();
        }
        try {
            suppliersPrimaryKey = new AtomicLong(realm.where(Suppliers.class).max("supplierId").longValue());
        } catch (Exception e) {
            realm.beginTransaction();
            Suppliers transaction = new Suppliers();
            transaction.setSupplierId(0);
            realm.copyToRealm(transaction);
            suppliersPrimaryKey = new AtomicLong(realm.where(Suppliers.class).max("supplierId").longValue());
            RealmResults<Suppliers> realmResults = realm.where(Suppliers.class).equalTo("supplierId",0).findAll();
            realmResults.deleteAllFromRealm();
            realm.commitTransaction();
        }
        realm.close();
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
