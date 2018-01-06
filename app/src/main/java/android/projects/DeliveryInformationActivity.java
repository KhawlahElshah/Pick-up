package android.projects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 01/06/2018.
 */

public class DeliveryInformationActivity extends Activity {

    public Button fnext;

    public void init(){

        fnext=(Button)findViewById(R.id.fnext);
        fnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(getApplicationContext(),AddressInformationActivity.class);
                startActivity(myIntent);
            }
        });

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frieght_deliveryfillup);
        init();
    }
}
