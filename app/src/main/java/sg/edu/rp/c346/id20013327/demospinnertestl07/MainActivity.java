package sg.edu.rp.c346.id20013327.demospinnertestl07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner);
        tv = findViewById(R.id.textView);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position + " is selected", Toast.LENGTH_SHORT).show();

//                switch(position) {
//                    case 0: tv.setText("Spinner Item, Yes Selected");
//                        break;
//                    case 1: tv.setText("Spinner Item, No Selected");
//                        break;
//                }

                if(position == 0) {
                    tv.setText("Spinner Item, Yes Selected");
                } else if (position == 1) {
                    tv.setText("Spinner Item, No Selected");
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}