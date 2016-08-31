package co.edu.udea.jetdown;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vstechlab.easyfonts.EasyFonts;


public class LogInActivity extends AppCompatActivity  {
    public static final int RC_GOOGLE_LOGIN = 1;
    private static final String TAG = "GoogleActivity";
    private static final int RC_SIGN_IN = 9001;
    Button button;
    TextView tvlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        button=(Button)findViewById(R.id.button);
        button.setTypeface(EasyFonts.caviarDreamsBold(this));
        tvlog=(TextView)findViewById(R.id.textView2);
        tvlog.setTypeface(EasyFonts.caviarDreamsBold(this));
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
