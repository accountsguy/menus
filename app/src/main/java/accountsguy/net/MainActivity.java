package accountsguy.net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv =  (TextView) findViewById(R.id.message);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("AccountsGuy.Net");
        setSupportActionBar(toolbar);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menus, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getTitle().toString()){
            case "Orange":
                tv.setTextColor(getResources().getColor(R.color.Orange));
                        break;
            case "Blue":
                tv.setTextColor(getResources().getColor(R.color.Blue));
                break;
            case "Green":
                tv.setTextColor(getResources().getColor(R.color.Green));
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
