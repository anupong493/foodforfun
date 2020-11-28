package comscisdu.piyawat.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    ListView listView;
    String[] titleStrings, detailStrings, shortdetailStrings;
    int[] ints = new int[]{R.drawable.menu1, R.drawable.menu2,R.drawable.menu3,R.drawable.menu4,R.drawable.menu5,
            R.drawable.menu6,R.drawable.menu7,R.drawable.menu8,R.drawable.menu9,R.drawable.menu10};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกอิลิเมนต์บน xml ให้รู้จักกับตัวแปรบน java
        listView = findViewById(R.id.livTraffic);

        //Get value ดึงค่าจาก DB ที่ไฟล์ my_context.xml มาแสดงผล
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //SubString ตัดคำ detail ให้เหลือ 20 char.
        shortdetailStrings = new String[detailStrings.length];
        for (int i = 0; i < detailStrings.length; i++) {
            shortdetailStrings[i] = detailStrings[i].substring(0, 20) + "...";
        }

        //แสดงผลบน listView
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, shortdetailStrings);
        listView.setAdapter(myAdapter);

        //คลิกเลือกรายการบน ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Detail", detailStrings[i]);
                intent.putExtra("Icon", ints[i]);
                startActivity(intent);
            }
        });

    }//end oncreate

    public void linkAboutMe(View view) {
        Intent aboutmeIntent = new Intent(MainActivity.this,AboutMe.class);
        startActivity(aboutmeIntent);
    }
    public void  Camera(View view) {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
    }
}//end class