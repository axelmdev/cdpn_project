package efan.fightforgrades.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import efan.fightforgrades.R;

public class MainGrid extends Activity {

    public String tag = "MainGrid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        Log.d(tag,"onCreate");

        final TextView tv_main = (TextView)findViewById(R.id.mainText);
        tv_main.setText("Bonsoir");

        final Button bt_oui = (Button)findViewById(R.id.oui_bt);
        bt_oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(bt_oui.getText());
            }
        });

        final Button bt_non = (Button)findViewById(R.id.non_bt);
        bt_non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_main.setText(bt_non.getText());
            }
        });

    }
}
