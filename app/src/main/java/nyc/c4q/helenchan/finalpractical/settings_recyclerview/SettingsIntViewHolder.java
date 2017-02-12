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
        String currentString = intNumTextView.getText().toString();
        currentString = currentString.substring(0 , currentString.length() -2);
        StringBuilder builder = new StringBuilder();
        builder.append(currentString);
        builder.append(position.toString());

        intNumTextView.setText(builder.toString());
    }


}