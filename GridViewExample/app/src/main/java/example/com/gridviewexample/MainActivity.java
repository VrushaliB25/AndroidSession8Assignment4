package example.com.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    GridView gridview;

    public static String[] names = {                              //Define Name for TextView
            "GingerBread",
            "Honeycomb",
            "IceCream",
            "JellyBean",
            "Kitkat",
            "Lollipop",
    };
    public static int[] Images = {                                     //Images from drawable folder
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                       //passing the layout
        gridview = (GridView) findViewById(R.id.gridview);           //Custom Grid initialization
        CustomGrid cg = new CustomGrid(this, names, Images);
        gridview.setAdapter(cg);
        gridview.setFastScrollEnabled(true);

    }
}
