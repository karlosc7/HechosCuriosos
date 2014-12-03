package es.delcerro.karlosc.hechoscuriosos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class HechosCuriososActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        // Declare our View variables and assign the Views from the layout file
        //Declare the new View Variables
        final TextView factLabel;
        Button showfactbook;
        TextView textView;
        factLabel = (TextView) findViewById(R.id.textView2);
        Button showFactButton = (Button) findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView factLabel = (TextView) findViewById(R.id.HechoCuriosoTextView);
                String fact = FactBook.getRandomFact();
                changeBackgroundColor();
                factLabel.setText(fact);

            }

            // Change the blackground color
            public void changeBackgroundColor() {
                Button button = (Button) findViewById(R.id.button);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
                int color = ColorWheel.getRandomColor();
                relativeLayout.setBackgroundColor(color);
                button.setTextColor(color);

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
