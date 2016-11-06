package com.shepeliev.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onButtonClick(View view) {
    if (view instanceof Button) {
      Button button = (Button) view;
      CharSequence projectName = button.getText();
      String toastText = getString(R.string.toast_text, projectName);
      Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
  }
}
