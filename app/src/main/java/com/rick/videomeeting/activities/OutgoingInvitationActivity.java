package com.rick.videomeeting.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rick.videomeeting.R;
import com.rick.videomeeting.models.User;

public class OutgoingInvitationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outgoing_invitation);

        ImageView imageMeetingType = findViewById(R.id.imageMeetingType);
        String meetingType = getIntent().getStringExtra("type");

        if (meetingType != null) {
            if (meetingType.equals("video")) {
                imageMeetingType.setImageResource(R.drawable.ic_video);
            }
        }

        TextView textFirstChar = findViewById(R.id.textFirstChar);
        TextView textUsername = findViewById(R.id.textUsername);
        TextView textEmail = findViewById(R.id.textEmail);

        User user = (User) getIntent().getSerializableExtra("user");
        if (user != null) {
            textFirstChar.setText(user.firstName.substring(0, 1));
            textUsername.setText(String.format("%s %s", user.firstName, user.lastName));
            textEmail.setText(user.email);
        }

        ImageView imageStopInvitation = findViewById(R.id.imageStopInvitation);
        imageStopInvitation.setOnClickListener(v -> onBackPressed());
    }
}