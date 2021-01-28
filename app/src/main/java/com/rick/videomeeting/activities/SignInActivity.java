package com.rick.videomeeting.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rick.videomeeting.R;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.textSignUp).setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));


    }
}

/*
 * Firebase Database Setup Code
 */
//    FirebaseFirestore database = FirebaseFirestore.getInstance();
//    HashMap<String, Object> user = new HashMap<>();
//        user.put("first_name", "John");
//                user.put("last_name", "Doe");
//                user.put("email", "john.doe@gmail.com");
//                database.collection("users")
//                .add(user)
//                .addOnSuccessListener(documentReference ->
//                Toast.makeText(SignInActivity.this, "User Inserted", Toast.LENGTH_SHORT).show())
//                .addOnFailureListener(e ->
//                Toast.makeText(SignInActivity.this, "Error adding user", Toast.LENGTH_SHORT).show());
