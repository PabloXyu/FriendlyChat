package com.google.firebase.udacity;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//https://stackoverflow.com/questions/47887880/make-sure-to-call-firebaseapp-initializeappcontext-first


/**
 * Created by Pawel Zygmunciak on 20.02.2018.
 */

public class FriendlyChat extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
      //  FirebaseApp.initializeApp(this);

        FriendlyChat.context = getApplicationContext();
 /*       FirebaseDatabase mFirebaseDatabase= FirebaseDatabase.getInstance();
        DatabaseReference mMessagesDatabaseReference = mFirebaseDatabase.getReference().child("messages");
*/
    }

    public static Context getAppContext() {
        return FriendlyChat.context;
    }

}

