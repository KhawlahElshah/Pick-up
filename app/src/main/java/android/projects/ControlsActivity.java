package android.projects;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 01/05/2018.
 */

public class ControlsActivity extends Activity {

    public Button conext;

    public void init(){

        conext=(Button)findViewById(R.id.controlsnext);
        conext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(getApplicationContext(),DynamicActivity.class);
                startActivity(myIntent);
            }
        });

    }




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controls);


        final CheckBox check = (CheckBox) findViewById(R.id.check1);



        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(getApplicationContext(), check.getText()+" selected", Toast.LENGTH_LONG).show();
                }
            }
        });

            init();
    }
}


