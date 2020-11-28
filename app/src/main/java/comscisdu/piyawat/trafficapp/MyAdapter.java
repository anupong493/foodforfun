package comscisdu.piyawat.trafficapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    //Explicit
    Context context;
    int[] ints; //ตัวแปรรูปไอคอน
    String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {//นับจำนวนข้อมูลใน databeas
        return ints.length;
    }

    @Override
    public Object getItem(int i) {//ไม่ใช้
        return null;
    }

    @Override
    public long getItemId(int i) {//ไม่ใช้
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//นำข้อมูลที่นับจาก getCount

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //ผูกตัวแปรบนจาวาของ xml
        ImageView imageView = view1.findViewById(R.id.imvicon);
        TextView titleTextView = view1.findViewById(R.id.tvTitle);
        TextView detailTextView = view1.findViewById(R.id.tvDetail);

        //นับข้อมูลไปแสดงผลบนหน้าแอป
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }
}//end class


