package nyc.c4q.helenchan.finalpractical;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by helenchan on 2/12/17.
 */
public class DrawerViewHolder extends RecyclerView.ViewHolder {
    private ImageView drawerIconIV;
    private TextView drawerTextV;

    public DrawerViewHolder(View itemView) {
        super(itemView);
        drawerIconIV = (ImageView) itemView.findViewById(R.id.drawer_icon_iv);
        drawerTextV = (TextView) itemView.findViewById(R.id.drawer_rv_textview);

    }


    public void bind(final String s) {
        drawerTextV.setText(s);
        setImageIcon(s);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(), "Selected " + s, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setImageIcon(String s) {
        switch (s) {
            case "Heart Activity":
                Picasso.with(itemView.getContext())
                        .load(R.drawable.heart)
                        .fit()
                        .into(drawerIconIV);
                break;
            case "Mail Activity":
                Picasso.with(itemView.getContext())
                        .load(R.drawable.googlechrome)
                        .fit()
                        .into(drawerIconIV);
                break;
            case "Share Activity":
                Picasso.with(itemView.getContext())
                        .load(R.drawable.sharevariant)
                        .fit()
                        .into(drawerIconIV);
                break;
            case "Logout":
                Picasso.with(itemView.getContext())
                        .load(R.drawable.close)
                        .fit()
                        .into(drawerIconIV);
                break;

        }
    }
}
