package ipiranga.fatec.androidcookbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eliete on 8/31/16.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Item> itemList;
    private Context context;

    public ListAdapter(List<Item> items) {
        itemList = items;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = getItem(position);
        if (item != null){
            holder.title.setText(item.getTitle());
            holder.subTitle.setText(item.getSubtitle());
            holder.n1.setText(String.valueOf(item.getN1()));
            holder.n2.setText(String.valueOf(item.getN2()));
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public Item getItem(int position){
        return itemList.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView subTitle;
        private TextView n1;
        private TextView n2;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.text0);
            subTitle = (TextView) itemView.findViewById(R.id.text1);
            n1 = (TextView) itemView.findViewById(R.id.text2);
            n2 = (TextView) itemView.findViewById(R.id.text3);
        }
    }
}
