package android.projects;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by HP on 12/31/2017.
 */



public class DynamicActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout layout = new LinearLayout(this);
        TextView title= new TextView(this);
        ImageView img = new ImageView(this);

        LinearLayout.LayoutParams param= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.WHITE);
        layout.setLayoutParams(param);

        title.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        title.setBackgroundColor(Color.parseColor("#2aa07a"));
        title.setTextColor(Color.BLACK);
        title.setTextSize(25);
        title.setText("Transport");
        title.setGravity(Gravity.CENTER);
        layout.addView(title);


        LinearLayout.LayoutParams imgparam= new LinearLayout.LayoutParams(700,700);
        imgparam.gravity=Gravity.CENTER;
        img.setLayoutParams(imgparam);
        img.setImageResource(R.drawable.manphoto);
        layout.addView(img);

        setContentView(layout);


    }
}
