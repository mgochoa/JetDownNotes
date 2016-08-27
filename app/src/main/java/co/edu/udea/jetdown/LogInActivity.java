package co.edu.udea.jetdown;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class LogInActivity extends AppCompatActivity  {
    public static final int RC_GOOGLE_LOGIN = 1;
    private static final String TAG = "GoogleActivity";
    private static final int RC_SIGN_IN = 9001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);



    }

    public void signIn(View v) {
        try{
            Intent main = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(main);

        }catch (Exception e){
            Snackbar.make(findViewById(R.id.logIn), "Try again later.", Snackbar.LENGTH_LONG)
                    .setAction("action", null).show();
        }




    }


}
