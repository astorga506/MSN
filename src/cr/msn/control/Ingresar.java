package cr.msn.control;

import cr.msn.R;
import cr.msn.servicios.IniciarSesion;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Ingresar extends Activity {
	
	private EditText correoET;
	private EditText contrasenaET;
	private Button ingresarBtn;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_iniciar);
		correoET = (EditText) findViewById(R.id.usuarioField);
		contrasenaET = (EditText) findViewById(R.id.contrasenaField);
		ingresarBtn = (Button) findViewById(R.id.ingresarBtn);
		ingresarBtn.setOnClickListener(new OnClickListener() {
	
			public void onClick(View v) {
				
				if(correoET.getText().length() > 0 && contrasenaET.length() > 0){					
					
					String correo = correoET.getText().toString();
					String contrasena = contrasenaET.getText().toString();										
					AsyncCallWS task = new AsyncCallWS();
					task.execute(correo, contrasena);
					
				}//if-validación
			}//onClick
		});//listener
		
	}//onCreate
	
	private class AsyncCallWS extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String...params) {
        	IniciarSesion is = new IniciarSesion();
        	String correo = params[0];
        	String contrasena = params[1];
        	if(is.esCliente(correo, contrasena)){
	        	Intent irInicio = new Intent(getApplicationContext(), Inicio.class);
				startActivity(irInicio);
        	}
			return null;
        }
 
        @Override
        protected void onPostExecute(Void result) {
        }
 
        @Override
        protected void onPreExecute() {
        }
 
        @Override
        protected void onProgressUpdate(Void... values) {
        }
 
    }
	
	
}//class
