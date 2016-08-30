package co.edu.udea.jetdown;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by mguillermo.ochoa on 27/08/16.
 */
public class LogOutFragment extends  android.support.v4.app.DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
    AlertDialog.Builder builder= new AlertDialog.Builder(getActivity(), R.style.AppCompatAlertDialogStyle);
    builder.setTitle("Dialog");
    builder.setMessage("¿Desea salir?");
    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            getActivity().finish();
        }
    });
    builder.setNegativeButton("Cancel", null);
        return builder.create();
    }
}
