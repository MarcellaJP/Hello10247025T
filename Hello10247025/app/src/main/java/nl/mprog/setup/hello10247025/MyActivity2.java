// Marcella Wijngaarden - marcellawijngaarden@hotmail.com - 10247025
package nl.mprog.setup.hello10247025;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MyActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);

        Button button = (Button) findViewById(R.id.button_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                onBackPressed();
            }
        });
    }
}
