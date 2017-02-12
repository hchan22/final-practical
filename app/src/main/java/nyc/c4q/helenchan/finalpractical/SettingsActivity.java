package nyc.c4q.helenchan.finalpractical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by helenchan on 2/12/17.
 */
public class SettingsActivity extends AppCompatActivity {
    private RecyclerView maxIntRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        maxIntRV = (RecyclerView) findViewById(R.id.settings_recyclerview);
        maxIntRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        maxIntRV.setAdapter(new SettingsIntAdapter());
    }
}
