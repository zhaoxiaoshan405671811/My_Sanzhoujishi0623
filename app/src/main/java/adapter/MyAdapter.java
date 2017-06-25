package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a1.my_sanzhoujishi0623.R;

import java.util.List;


/**
 * Created by DELL on 2017/6/11.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;

    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item,null);
            holder.t = (TextView) convertView.findViewById(R.id.textitem);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.t.setText(list.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView t;
    }
}
