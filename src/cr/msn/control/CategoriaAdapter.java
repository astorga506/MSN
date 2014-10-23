package cr.msn.control;

import java.util.ArrayList;

import cr.msn.R;
import cr.msn.dominio.Categoria;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CategoriaAdapter extends ArrayAdapter<Categoria>{

	    public CategoriaAdapter(Context context, int resource, ArrayList<Categoria> cats) {
	       super(context, resource, cats);	       
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	       // Get the data item for this position
	       Categoria cat = getItem(position);    
	       // Check if an existing view is being reused, otherwise inflate the view
	       if (convertView == null) {
	          convertView = LayoutInflater.from(getContext()).inflate(R.layout.categoria_item, parent, false);
	       }
	       // Lookup view for data population
	       TextView nombreCatTV = (TextView) convertView.findViewById(R.id.nombreCatTV);
	       TextView codCatTV = (TextView) convertView.findViewById(R.id.codCatTV);
	       // Populate the data into the template view using the data object
	       nombreCatTV.setText(cat.getNombreCategoria());
	       codCatTV.setText(cat.getCodCategoria());
	       // Return the completed view to render on screen
	       return convertView;
	   }
	
}