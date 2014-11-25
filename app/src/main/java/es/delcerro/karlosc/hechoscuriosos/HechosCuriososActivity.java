package es.delcerro.karlosc.hechoscuriosos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class HechosCuriososActivity extends ActionBarActivity {

    //Declare the new View Variables
    TextView factLabel;
    Button showfactbook;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        // Declare our View variables and assign the Views from the layout file
        factLabel = (TextView) findViewById(R.id.textView2);
        Button showFactButton = (Button) findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random(); //Construct new number Generator
                int randomNumber = randomGenerator.nextInt(10); // limit to ten
                fact = Integer.toString(randomNumber);

            }
        };

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
