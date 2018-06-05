package sg.edu.rp.webservices.p07ps;

import android.content.ContentResolver;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment f1 = new Fragment_first();
        ft.replace(R.id.frame1, f1);
        Fragment f2 = new Fragment_Second();
        ft.replace(R.id.frame2, f2);
        ContentResolver cr = getContentResolver();



        ft.commit();
    }
}
