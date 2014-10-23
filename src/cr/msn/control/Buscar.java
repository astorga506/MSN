package cr.msn.control;

import cr.msn.R;
import cr.msn.data.CategoriaData;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

public class Buscar extends ActionBarActivity {
	
	private ListView categoriaLV;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);	 
		categoriaLV = (ListView) findViewById(R.id.categoria_lv);
		AsyncCallWS task = new AsyncCallWS();
		task.execute(this);
	}
	
	private class AsyncCallWS extends AsyncTask<Activity, CategoriaAdapter, CategoriaAdapter> {
        
        protected CategoriaAdapter doInBackground(Activity...params) {
        	CategoriaData cd = new CategoriaData();
        	
			return new CategoriaAdapter(params[0], R.layout.categoria_item, cd.getCategorias());
        }
 
        protected void onPostExecute(CategoriaAdapter result) {
        	categoriaLV.setAdapter(result);        	
        }
 
    }

}
