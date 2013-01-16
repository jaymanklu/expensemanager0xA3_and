package noncom.jay.xA3;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ExpenseHome extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button salBt = (Button)findViewById(R.id.Salary);
        salBt.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(ExpenseHome.this, SalaryActivity.class);
	             startActivity(intent);
				
			}
		});
        
        

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
