package nyc.c4q.helenchan.finalpractical;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> drawerList = new ArrayList<>();
    RecyclerView drawerRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigational_drawer);
        Resources resources = getResources();
        Collections.addAll(drawerList, resources.getStringArray(R.array.drawer_array));
        drawerRV = (RecyclerView) findViewById(R.id.drawer_recyclerview);
        drawerRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        drawerRV.setAdapter(new DrawerAdapter(drawerList));
    }


}
