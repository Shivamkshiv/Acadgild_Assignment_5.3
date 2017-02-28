package mr_auspicious.shivam_kr_shiv.com.menus3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

// Creating our custom adapter..


public class InfoAdapter extends ArrayAdapter<Info> {


    public InfoAdapter(Context context, List<Info> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list_item_view = convertView;
        if(list_item_view == null){

            list_item_view = LayoutInflater.from(getContext()).inflate(R.layout.info_design,null);
        }

        Info info = getItem(position);

        TextView textView = (TextView) list_item_view.findViewById(R.id.name);
        textView.setText(info.getName());

        TextView textView1 = (TextView) list_item_view.findViewById(R.id.contact);
        textView1.setText(info.getContact());

        return list_item_view;
    }
}
