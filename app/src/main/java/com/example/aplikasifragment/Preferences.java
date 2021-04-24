package com.example.aplikasifragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {
    private static final String SHARED_PREF_NAME = "pref";
    private static final String KEY_USERNAME = "username";

    private static SharedPreferences getSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setRegisteredUser(Context context, String username){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_USERNAME, username);
        editor.apply();
    }

    public static String getRegisteredUser(Context context){
        return getSharedPreference(context).getString(KEY_USERNAME,"");
    }

    public static String getSharedPrefName() {
        return SHARED_PREF_NAME;
    }

    public static void clearLoggedInUser (Context context){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.remove(KEY_USERNAME);
        editor.apply();
    }
}
