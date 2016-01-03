package com.example.user.everbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FloatingActionButtonOptionActivity extends Activity implements View.OnClickListener {
    private RelativeLayout floatingActionButtonOptionLayout;
    private TextView textNote;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_option);

        floatingActionButtonOptionLayout = (RelativeLayout)findViewById(R.id.activity_floating_action_button_option);
        floatingActionButtonOptionLayout.setOnClickListener(this);
        textNote = (TextView)findViewById(R.id.activity_floating_action_button_option_text_note);
        textNote.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_floating_action_button_option_text_note:
                intent = new Intent(FloatingActionButtonOptionActivity.this, InsertTextNoteActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.activity_floating_action_button_option:
                finish();
                break;
        }
    }
}
