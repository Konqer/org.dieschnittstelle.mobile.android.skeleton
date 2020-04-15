package org.dieschnittstelle.mobile.android.skeleton;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup listView = this.findViewById(R.id.listView);
        FloatingActionButton fab = this.findViewById(R.id.fab);

        for (int i = 0; i < listView.getChildCount(); i++) {
            TextView currentChild = (TextView) listView.getChildAt(i);
            currentChild.setOnClickListener((view) -> {
                this.showFeedbackMessage("List Element: " + currentChild.getText() + "!");
            });
        }

        fab.setOnClickListener((view) -> {
            this.showFeedbackMessage("Add new Element");
        });
    }

    private void showFeedbackMessage(String msg) {
        Toast.makeText(this, "Click on: " + msg, Toast.LENGTH_SHORT).show();
    }

}
