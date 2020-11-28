package comscisdu.piyawat.trafficapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }//end method on Create

    public void connectMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.776238278520452,100.51060711438762('มหาวิทยาลัยสวนดุสิต')");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }//end method connectmap

    public void dialMobile(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:0958853244"));
        startActivity(dialIntent);
    }//end method dialmobile
    public void dialMobile1(View view) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:0984494293"));
        startActivity(dialIntent);
    }//end method dialmobile

    public void  clickFB(View view) {
        Intent FBIntent = new Intent(Intent.ACTION_VIEW);
        FBIntent.setData(Uri.parse("https://www.facebook.com/bleach.gluttony"));
        startActivity(FBIntent);
    }//end method clickFB
    public void  clickFB1(View view) {
        Intent FBIntent = new Intent(Intent.ACTION_VIEW);
        FBIntent.setData(Uri.parse("https://www.facebook.com/anupong.wingnak/"));
        startActivity(FBIntent);
    }//end method clickFB

    public void back(View view) {
        finish();
    }
}//end class