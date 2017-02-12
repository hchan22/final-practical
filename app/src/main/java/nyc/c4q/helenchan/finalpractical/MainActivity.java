package nyc.c4q.helenchan.finalpractical;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    List<String> drawerList = new ArrayList<>();
    private RecyclerView drawerRV;
    private ImageButton heartButton;
    private ImageButton messageButton;
    private ImageButton settingsButton;
    private ImageButton logoutButton;
    private TextView heartTV;
    private TextView messageTV;
    private TextView settingsTV;
    private TextView logoutTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigational_drawer);
        Resources resources = getResources();
        Collections.addAll(drawerList, resources.getStringArray(R.array.drawer_array));
        initalize();
        drawerRV = (RecyclerView) findViewById(R.id.drawer_recyclerview);
        drawerRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        drawerRV.setAdapter(new DrawerAdapter(drawerList));
    }

    private void initalize(){
        heartButton = (ImageButton) findViewById(R.id.heart_button);
        heartButton.setOnClickListener(this);
        messageButton = (ImageButton) findViewById(R.id.message_button);
        messageButton.setOnClickListener(this);
        settingsButton = (ImageButton) findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(this);
        logoutButton = (ImageButton) findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(this);
        heartTV = (TextView) findViewById(R.id.heart_tv);
        messageTV = (TextView) findViewById(R.id.message_tv);
        settingsTV = (TextView) findViewById(R.id.settings_tv);
        logoutTV =(TextView) findViewById(R.id.logout_tv);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.heart_button:
                makeToast("Selected Heart Activity");
                break;
            case R.id.message_button:
                makeToast("Selected Message Activity");
                break;
            case R.id.settings_button:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.logout_button:
                finish();
                break;
        }
    }

    private void makeToast(String theString){
        Toast.makeText(getApplicationContext(), theString, Toast.LENGTH_SHORT ).show();
    }
}
