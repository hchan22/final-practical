package nyc.c4q.helenchan.finalpractical;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by helenchan on 2/12/17.
 */
public class DrawerAdapter extends RecyclerView.Adapter<DrawerViewHolder> {
    List<String> drawerList;

    public DrawerAdapter(List<String> drawerList) {
        this.drawerList = drawerList;
    }

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_itemview, parent, false);
        return new DrawerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {
        holder.bind(drawerList.get(position));

    }

    @Override
    public int getItemCount() {
        return drawerList.size();
    }
}
