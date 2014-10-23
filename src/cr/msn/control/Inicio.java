package cr.msn.control;

import cr.msn.Promociones;
import cr.msn.R;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class Inicio extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		
		TextView buscarTV = (TextView) findViewById(R.id.buscarTV);
		buscarTV.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	        	Intent irBuscar = new Intent(getApplicationContext(), Buscar.class);
				startActivity(irBuscar);				
			}
		});
		
		TextView promoTV = (TextView) findViewById(R.id.promoTV);
		promoTV.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	        	Intent irPromo = new Intent(getApplicationContext(), Promociones.class);
				startActivity(irPromo);	
				
			}
		});
		
		TextView contactoTV = (TextView) findViewById(R.id.contactoTV);
		contactoTV.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	        	Intent irContacto = new Intent(getApplicationContext(), Contacto.class);
				startActivity(irContacto);	
				
			}
		});
		
		TextView ordenesTV = (TextView) findViewById(R.id.ordenesTV);
		ordenesTV.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	        	Intent irOrdenes= new Intent(getApplicationContext(), Ordenes.class);
				startActivity(irOrdenes);	
				
			}
		});
		
	}


}
