// Marcella Wijngaarden - marcellawijngaarden@hotmail.com - 10247025
package nl.mprog.setup.hello10247025;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MyActivity2.class);
                startActivity(intent);
            }
        });




    }
}
