package efan.fightforgrades.Activity;

import android.app.Activity;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import org.w3c.dom.Text;

import efan.fightforgrades.Model.Case;
import efan.fightforgrades.Model.Map;
import efan.fightforgrades.R;

public class MainGrid extends Activity {

    public String tag = "MainGrid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        //Create empty Map
        Map mainMap = new Map();
        mainMap.setId(0);
        mainMap.setName("TestRoom");

        // Creating Cases (4x4)
        for (int y = 0;y < 4;y++)
        {
            for (int x = 0;x < 4;x++)
            {
                mainMap.getCases().add(new Case(0,true,null,"none",x,y));
                System.out.println("Creating case in " + x + " " + y);
            }
        }
        System.out.println("Map : " + mainMap.getName() + " with : " + mainMap.getCases().size() + " tiles.");
        Log.d(tag,"onCreate");

        LinearLayout main_ll = (LinearLayout)findViewById(R.id.mainLL);


        int tileNumber = 0;
        for (int line = 0;line < 4;line++)
        {
            LinearLayout newRow = new LinearLayout(this);
            newRow.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            for (int counter = 0; counter < 4; counter++)
            {
                Case selectedTile = mainMap.getCases().get(tileNumber);
                Button newButton = new Button(this);
                newButton.setText("x : " + selectedTile.getX() + " y : " + selectedTile.getY());
                newButton.setWidth(50);
                newButton.setHeight(50);
                newRow.addView(newButton);
                tileNumber++;
                System.out.println("Create tile n°" + tileNumber + " at x : " + selectedTile.getX() + ", y : " + selectedTile.getY());
            }
            main_ll.addView(newRow);
        }


    }
}
