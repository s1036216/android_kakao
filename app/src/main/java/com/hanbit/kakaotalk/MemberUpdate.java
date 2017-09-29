package com.hanbit.kakaotalk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MemberUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_update);
        final Context context = MemberUpdate.this;
        findViewById(R.id.updateConfirmBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "업데이트 할거임!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context,MemberDetail.class));
            }
        });
        findViewById(R.id.updateCancleBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "업데이트취소할거임!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context,MemberList.class));
            }
        });
    }
}