// Generated by view binder compiler. Do not edit!
package com.yan.storyappmap.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yan.storyappmap.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUploadBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button cameraButton;

  @NonNull
  public final CardView cardviewImageView;

  @NonNull
  public final TextInputEditText descEditText;

  @NonNull
  public final TextInputLayout descLayout;

  @NonNull
  public final Button galleryButton;

  @NonNull
  public final ImageView previewImageView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button uploadButton;

  private ActivityUploadBinding(@NonNull ScrollView rootView, @NonNull Button cameraButton,
      @NonNull CardView cardviewImageView, @NonNull TextInputEditText descEditText,
      @NonNull TextInputLayout descLayout, @NonNull Button galleryButton,
      @NonNull ImageView previewImageView, @NonNull ProgressBar progressBar,
      @NonNull Button uploadButton) {
    this.rootView = rootView;
    this.cameraButton = cameraButton;
    this.cardviewImageView = cardviewImageView;
    this.descEditText = descEditText;
    this.descLayout = descLayout;
    this.galleryButton = galleryButton;
    this.previewImageView = previewImageView;
    this.progressBar = progressBar;
    this.uploadButton = uploadButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUploadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUploadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUploadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cameraButton;
      Button cameraButton = ViewBindings.findChildViewById(rootView, id);
      if (cameraButton == null) {
        break missingId;
      }

      id = R.id.cardviewImageView;
      CardView cardviewImageView = ViewBindings.findChildViewById(rootView, id);
      if (cardviewImageView == null) {
        break missingId;
      }

      id = R.id.descEditText;
      TextInputEditText descEditText = ViewBindings.findChildViewById(rootView, id);
      if (descEditText == null) {
        break missingId;
      }

      id = R.id.descLayout;
      TextInputLayout descLayout = ViewBindings.findChildViewById(rootView, id);
      if (descLayout == null) {
        break missingId;
      }

      id = R.id.galleryButton;
      Button galleryButton = ViewBindings.findChildViewById(rootView, id);
      if (galleryButton == null) {
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

      id = R.id.uploadButton;
      Button uploadButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadButton == null) {
        break missingId;
      }

      return new ActivityUploadBinding((ScrollView) rootView, cameraButton, cardviewImageView,
          descEditText, descLayout, galleryButton, previewImageView, progressBar, uploadButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
