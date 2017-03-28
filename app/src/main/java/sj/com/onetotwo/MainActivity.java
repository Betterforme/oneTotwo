package sj.com.onetotwo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_hello)
    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvHello.setText("aaa");
    }

    @OnClick(R.id.tv_hello)
    public void onClick() {
        Toast.makeText(MainActivity.this,"abcf",Toast.LENGTH_SHORT).show();
    }
}
