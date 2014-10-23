package cr.msn.data;


import java.io.IOException;
import java.util.ArrayList;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import cr.msn.dominio.Categoria;

public class CategoriaData {

    public CategoriaData() {
    }
    
    public ArrayList<Categoria> getCategorias(){
    	ArrayList<Categoria> categorias = new ArrayList<>();
        SoapObject request = new SoapObject("http://msn.cr/", "GetCategorias");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE("http://192.168.0.99/WebServiceMSN/CategoriaMSN.asmx");
        try {
            androidHttpTransport.call("http://msn.cr/GetCategorias", envelope);
            SoapObject response = (SoapObject) envelope.getResponse();

            for (int i = 0; i < response.getPropertyCount(); i++) {
                SoapObject obj = (SoapObject) response.getProperty(i);
                Categoria categoria = new Categoria();
                categoria.setCodCategoria(Integer.parseInt(obj.getPropertyAsString("CodCategoria")));
                categoria.setNombreCategoria(obj.getPropertyAsString("Nombre"));

                categorias.add(categoria);
            }

        } catch (SoapFault e) {
            System.out.println(e.getMessage());
        } catch (XmlPullParserException | IOException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    
        return  categorias;
    }
    
}
