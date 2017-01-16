package sra1.mbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import static sra1.mbook.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click = (Button)findViewById(R.id.button2);
        EditText ip = (EditText)findViewById(R.id.editText);
        TextView tv = (TextView)findViewById(R.id.textView3);
        String str=ip.getText().toString();
        public void SendMessage(View view)
    {tv.setText(str);

    }

        )
    }
}
