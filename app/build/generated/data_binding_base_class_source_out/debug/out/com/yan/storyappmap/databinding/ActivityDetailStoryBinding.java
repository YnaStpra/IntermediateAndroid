// Generated by view binder compiler. Do not edit!
package com.yan.storyappmap.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yan.storyappmap.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailStoryBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView cardviewDescView;

  @NonNull
  public final CardView cardviewImageView;

  @NonNull
  public final CardView cardviewNameView;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView name;

  @NonNull
  public final ImageView previewImageView;

  @NonNull
  public final ProgressBar progressBar;

  private ActivityDetailStoryBinding(@NonNull ScrollView rootView,
      @NonNull CardView cardviewDescView, @NonNull CardView cardviewImageView,
      @NonNull CardView cardviewNameView, @NonNull TextView description, @NonNull TextView name,
      @NonNull ImageView previewImageView, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.cardviewDescView = cardviewDescView;
    this.cardviewImageView = cardviewImageView;
    this.cardviewNameView = cardviewNameView;
    this.description = description;
    this.name = name;
    this.previewImageView = previewImageView;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailStoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailStoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_story, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailStoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardviewDescView;
      CardView cardviewDescView = ViewBindings.findChildViewById(rootView, id);
      if (cardviewDescView == null) {
        break missingId;
      }

      id = R.id.cardviewImageView;
      CardView cardviewImageView = ViewBindings.findChildViewById(rootView, id);
      if (cardviewImageView == null) {
        break missingId;
      }

      id = R.id.cardviewNameView;
      CardView cardviewNameView = ViewBindings.findChildViewById(rootView, id);
      if (cardviewNameView == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.previewImageView;
      ImageView previewImageView = ViewBindings.findChildViewById(rootView, id);
      if (previewImageView == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new ActivityDetailStoryBinding((ScrollView) rootView, cardviewDescView,
          cardviewImageView, cardviewNameView, description, name, previewImageView, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
