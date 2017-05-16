package com.lawyee.saveparcelabletext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lawyee.saveparcelabletext.util.SharedPreUtil;
import com.lawyee.saveparcelabletext.util.vo.UserEntity;

public class MainActivity extends AppCompatActivity {

    private CardView mCardView;
    private EditText mEtName;
    private EditText mEtPass;
    private CheckBox mChbSava;
    private TextView mTvShowPassword;
    private TextView mShowPassName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreUtil.initSharedPreference(getApplicationContext());
        initView();
        savepass();
    }


    private void initView() {
        mCardView = (CardView) findViewById(R.id.cardView);
        mEtName = (EditText) findViewById(R.id.et_name);
        mEtPass = (EditText) findViewById(R.id.et_pass);
        mChbSava = (CheckBox) findViewById(R.id.chb_sava);
        mTvShowPassword = (TextView) findViewById(R.id.tv_showPassword);
        mShowPassName = (TextView) findViewById(R.id.show_Pass_name);
    }

    private void savepass() {

        mChbSava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = mEtName.getText().toString().trim();
                final String pass = mEtPass.getText().toString().trim();
                UserEntity userEntity = new UserEntity();
                userEntity.setUserName(name);
                userEntity.setPassword(pass);
                SharedPreUtil.getInstance().putUser(userEntity);
                Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
            }
        });
        mTvShowPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntity user = SharedPreUtil.getInstance().getUser();
                mShowPassName.setText(user.getPassword() + "\n" + user.getUserName()+"");
                Log.d("===", "onClick: "+user.getPassword() + "\n" + user.getUserName()+"");
                Toast.makeText(MainActivity .this,"4111",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
