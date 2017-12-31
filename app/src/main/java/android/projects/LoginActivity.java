
package android.projects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    // global scope variables

    public Button loginbt;


    public void init(){

        loginbt=(Button)findViewById(R.id.login);
        loginbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(myIntent);


            }
        });
    }


    @Override
    protected void onCreate(Bundle bnd) {

        super.onCreate(bnd);
            setContentView(R.layout.login);
            init();
        }

}// LoginActivity
