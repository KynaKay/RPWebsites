package sg.edu.rp.c346.rpwebsites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spnMenu, spnSubMenu;
    Button btnGo;

    ArrayList<String> alNumbers = new ArrayList<String>();
   ArrayAdapter<String> aaNumbers;

    String[][] sites = {
            {"http://www.rp.edu.sg",
                    "http://www.rp.edu.sg/the_Republic_Code_of_Honour.aspx",
                    "http://www.rp.edu.sg/Diploma_in_Mobile_Software_Development_(R47).apsx",
                    "http://www.rp.edu.sg/Diploma_in_Information_Technology_(R12).aspx"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
