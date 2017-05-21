/**
 * Created by HPWorld on 5/20/2017.
 */
package example.com.gridviewexample;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomGrid extends BaseAdapter {

        private String[] names;
        private Context context;
        private int[] imageId;

        public CustomGrid(Context mainActivity, String[] NameList, int[] Images) {
            // TODO Auto-generated constructor stub
            names = NameList;
            context = mainActivity;
            imageId = Images;

        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        private class Holder {
            TextView tview;
            ImageView iview;
        }

        @Override
        //convertView - The old view to reuse

        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            Holder holder = new Holder();

            //LayoutInflater for inflating layout resources in this context.

            LayoutInflater inflater = (LayoutInflater) context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (convertView==null) {
                convertView = inflater.inflate(R.layout.custom_gridview, null);
                holder.tview = (TextView) convertView.findViewById(R.id.text1);
                holder.iview = (ImageView) convertView.findViewById(R.id.gridimg);

                holder.tview.setText(names[position]);
                holder.iview.setImageResource(imageId[position]);
                convertView.setTag(holder);
            }
            else
            {

                convertView.getTag();
            }
            // when an image has been clicked
            convertView.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    //A Toast will be shown when any of image clicked
                    Toast.makeText(context, "You have Clicked the image " + names[position], Toast.LENGTH_LONG).show();
                }
            });

          return convertView;
        }



}
