package nyc.c4q.helenchan.finalpractical;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by helenchan on 2/12/17.
 */
public class SettingsIntAdapter extends RecyclerView.Adapter<SettingsIntViewHolder> {
    @Override
    public SettingsIntViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.settings_integer_itemview, parent, false);
        return new SettingsIntViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SettingsIntViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
