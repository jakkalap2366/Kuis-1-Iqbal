package id.co.rivalpedia.myberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class berita1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita1);
    }
    public void backList (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
