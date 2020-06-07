package com.rockscoder.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void showT(Context mContext,String message){
        Toast.makeText(mContext,message,Toast.LENGTH_SHORT).show();
    }
}
