package comscisdu.piyawat.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    //Explicit
    TextView titleTextView, detailTextView;
    ImageView iconImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปรบ java กับอิลิเมนต์บน xml
        titleTextView = findViewById(R.id.tvTitle);
        detailTextView = findViewById(R.id.tvDetail);
        iconImageView = findViewById(R.id.imvIcon);

        //รับค่าจากการ intent มาแสดงผลบนหน้า detail
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        iconImageView.setImageResource(getIntent().getIntExtra("Icon",R.drawable.menu1));

    }// end onCreate()

    public void clickBack(View view) {
        finish();
    }
}// end class