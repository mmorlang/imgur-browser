package edu.cnm.deepdive.imgurbrowser.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryListAdapter extends RecyclerView.Adapter<GalleryListAdapter.GalleryViewHolder> {

  @NonNull
  @Override
  public GalleryListAdapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
      int viewType) {
    return null;
  }

  @Override
  public void onBindViewHolder(@NonNull GalleryListAdapter.GalleryViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
  }

  class GalleryViewHolder extends RecyclerView.ViewHolder{

//    private final TextView title;
//    private final TextView description;
//    private final Spinner imageSpinner;

    public GalleryViewHolder(@NonNull View itemView) {
      super(itemView);
    }
  }
}

