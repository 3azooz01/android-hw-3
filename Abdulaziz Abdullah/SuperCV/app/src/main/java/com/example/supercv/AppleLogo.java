package com.example.supercv;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AppleLogo extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@NonNull Bundle savedInstanceState){
        AlertDialog.Builder apple = new AlertDialog.Builder(getActivity());
        apple.setTitle("Imposter");
        apple.setMessage("Why did you click on the Apple icon? Did you come here to sign in for Android or Apple?!");
        apple.setPositiveButton("I'm Sorry :(", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Don't do that again", Toast.LENGTH_SHORT).show();
            }
        });
        return apple.create();


    }
}
