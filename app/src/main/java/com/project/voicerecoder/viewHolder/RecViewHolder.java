package com.project.voicerecoder.viewHolder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.voicerecoder.R;

public class RecViewHolder extends RecyclerView.ViewHolder {

    public TextView tvname;
    public LinearLayout container;

    public RecViewHolder(@NonNull View itemView) {
        super(itemView);

        tvname = itemView.findViewById(R.id.txtName);
        container = itemView.findViewById(R.id.container);

    }
}
