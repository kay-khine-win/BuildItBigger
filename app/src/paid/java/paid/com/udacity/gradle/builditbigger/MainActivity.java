package paid.com.udacity.gradle.builditbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.R;
import com.kkw.displayjokeslibrary.DisplayActivity;


public class MainActivity extends AppCompatActivity {
    public static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        //  Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

        new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra(JOKE, result);

                startActivity(intent);

            }
        }).execute(this);
    }


}
