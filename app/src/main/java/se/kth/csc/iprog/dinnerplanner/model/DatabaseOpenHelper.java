package se.kth.csc.iprog.dinnerplanner.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lee Han Young on 06-Feb-16.
 */
public class DatabaseOpenHelper extends SQLiteOpenHelper {

    private static  DatabaseOpenHelper sInstance;

    public static synchronized DatabaseOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        if (sInstance == null) {
            sInstance = new DatabaseOpenHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    /**
     * Constructor should be private to prevent direct instantiation.
     * make call to static method "getInstance()" instead.
     */
    private DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String DATABASE_NAME = "DinnerModelsDB";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "dinnerModels";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_GUESTS = "guests";
    private static final String COLUMN_DISHES = "dishes";

    private static final String[] COLUMNS = { COLUMN_ID, COLUMN_GUESTS, COLUMN_DISHES };

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //sqLiteDatabase.execSQL();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
