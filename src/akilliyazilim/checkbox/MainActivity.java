package akilliyazilim.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	CheckBox chkCream;
	CheckBox chkSugar;
	Button btnPay;
	RadioGroup radCoffeeType;
	RadioButton radDecaf;
	RadioButton radExpresso;
	RadioButton radColombian;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		chkCream=(CheckBox)findViewById(R.id.chkCream);
		chkSugar=(CheckBox)findViewById(R.id.chkSugar);
		btnPay=(Button)findViewById(R.id.btnPay);
		radCoffeeType=(RadioGroup)findViewById(R.id.radCoffeeType);
		radDecaf=(RadioButton)findViewById(R.id.radDecaf);
		radExpresso=(RadioButton)findViewById(R.id.radExpresso);
		radColombian=(RadioButton)findViewById(R.id.radColombian);
		
		btnPay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String msg="Coffee";
				if(chkCream.isChecked())
					msg += " & cream";
				
				if(chkSugar.isChecked())
					msg += " & sugar";
				
				int radioId=radCoffeeType.getCheckedRadioButtonId();
				
				if(radDecaf.getId()==radioId)
					msg ="Decaf " + msg;
				
				if(radExpresso.getId()==radioId)
					msg ="Expresso " + msg;
				
				if(radColombian.getId()==radioId)
					msg ="Colombian " + msg;
				
				Toast.makeText(getApplicationContext(), msg	, Toast.LENGTH_LONG).show();
						
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
