package com.example.customtoastcre;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class Toastc {
    public static void SimplerToast(Context context,String message){
        Toast toast = new Toast(context) ;
        Toast.makeText(context, "asa", Toast.LENGTH_SHORT).show();
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
