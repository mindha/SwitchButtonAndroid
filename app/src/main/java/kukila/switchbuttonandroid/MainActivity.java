package kukila.switchbuttonandroid;
// Android Switch Button Tutorial Code


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.CompoundButton;
        import android.widget.Switch;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Switch switchButton, switchButton2;
    TextView textView, textView2;
    String switchOn = "Switch is ON";
    String switchOff = "Switch is OFF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For first switch button
        switchButton = (Switch) findViewById(R.id.switchButton);
        textView = (TextView) findViewById(R.id.textView);

        switchButton.setChecked(true);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
//                if (bChecked) {
//                    textView.setText(switchOn);
//                } else {
//                    textView.setText(switchOff);
//                }
            }
        });

//        if (switchButton.isChecked()) {
//            textView.setText(switchOn);
//        } else {
//            textView.setText(switchOff);
//        }

//         for second switch button
        switchButton2 = (Switch) findViewById(R.id.switchButton2);
        textView2 = (TextView) findViewById(R.id.textView2);

        switchButton2.setChecked(false);
        switchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked) {
                    textView2.setText(switchOn);
                } else {
                    textView2.setText(switchOff);
                }
            }
        });

        if (switchButton2.isChecked()) {
            textView2.setText(switchOn);
        } else {
            textView2.setText(switchOff);
        }
    }

}