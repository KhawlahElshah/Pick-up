package android.projects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    public Button getmoving, upcomingbtn, caculatebtn;

    public void init(){

        getmoving=(Button)findViewById(R.id.getmoving);
        getmoving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getApplicationContext(),
                        DeliveryInformationActivity.class);
                startActivity(myIntent);
            }
        });

        upcomingbtn=(Button)findViewById(R.id.homebtn);
        upcomingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getApplicationContext(),
                        UpcomingMovesActivity.class);
                startActivity(myIntent);
            }
        });

        caculatebtn=(Button)findViewById(R.id.homebtn);
        caculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(getApplicationContext(),
                        CaculateCostActivity.class);
                startActivity(myIntent);

            }
        });

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }
}
