package id.co.rivalpedia.myberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewberita1 (View view){
        Intent intent = new Intent(this, berita1.class);
        startActivity(intent);
    }
    public void viewberita2 (View view){
        Intent intent = new Intent(this, berita2.class);
        startActivity(intent);
    }
}
