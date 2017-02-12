package nyc.c4q.helenchan.finalpractical.settings_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.helenchan.finalpractical.R;

/**
 * Created by helenchan on 2/12/17.
 */
public class SettingsIntViewHolder extends RecyclerView.ViewHolder {
    private TextView intNumTextView;

    public SettingsIntViewHolder(View itemView) {
        super(itemView);
        intNumTextView = (TextView) itemView.findViewById(R.id.int_textview);
    }

    public void bind(Integer position) {
        intNumTextView.setText("Settings - " + position);
    }


}
