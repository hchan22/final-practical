package nyc.c4q.helenchan.finalpractical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by helenchan on 2/12/17.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText userNameET;
    EditText passwordET;
    Button submitButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    public void initialize(){
        userNameET = (EditText) findViewById(R.id.username_edittext);
        passwordET = (EditText) findViewById(R.id.password_edittext);
        submitButton = (Button) findViewById(R.id.submit_button);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.submit_button:
                if(userNameET.getText() == null){
                    Toast.makeText(getApplicationContext(), "Enter a username", Toast.LENGTH_SHORT).show();
                }
                if(passwordET.getText() == null){
                    Toast.makeText(getApplicationContext(), "Enter a password", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
        }
    }
}
