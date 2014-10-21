package cr.msn.data;

import java.io.IOException;
import java.util.LinkedList;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import cr.msn.dominio.Cliente;

public class ClienteData {


	public ClienteData() {
		
	}
	
    public boolean esCliente(String contrasena, String correo) {
        boolean esValido = false;
        SoapObject request = new SoapObject("http://msn.cr/", "EsCliente");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        
        PropertyInfo pi = new PropertyInfo();
        pi.setName("contrasena");
        pi.setValue(contrasena);
        request.addProperty(pi);
        pi = new PropertyInfo();
        pi.setName("correo");
        pi.setValue(correo);
        request.addProperty(pi);
        
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE("http://192.168.0.99/WebServiceMSN/MSN.asmx");
        
        try {
            androidHttpTransport.call("http://msn.cr/EsCliente", envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            esValido = Boolean.valueOf(response.getValue().toString());

        } catch (SoapFault e) {
            System.out.println(e.getMessage());
        } catch (XmlPullParserException | IOException | NumberFormatException ex) {
        	System.out.println(ex.getMessage());
        }

        return esValido;

    }

    public LinkedList<Cliente> obtenerClientes() {
    	
        LinkedList<Cliente> clientes = new LinkedList<>();
        final String METHOD_NAME = "ObtenerClientes";
		SoapObject request = new SoapObject(cr.msn.data.utils.Config.URL, METHOD_NAME);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(cr.msn.data.utils.Config.NAME_SPACE);
        try {
            androidHttpTransport.call(cr.msn.data.utils.Config.NAME_SPACE+METHOD_NAME, envelope);
            SoapObject response = (SoapObject) envelope.getResponse();

            for (int i = 0; i < response.getPropertyCount(); i++) {
                SoapObject obj = (SoapObject) response.getProperty(i);
                Cliente cliente = new Cliente();
                cliente.setNombreCliente(obj.getPropertyAsString("NombreCliente"));
                cliente.setCorreo(obj.getPropertyAsString("Correo"));
                cliente.setIdCliente(Integer.parseInt(obj.getPropertyAsString("IdCliente")));
                cliente.setTelefono(obj.getPropertyAsString("Telefono"));

                clientes.add(cliente);
                //IOException | XmlPullParserException |         
            }

        } catch (SoapFault e) {
            System.out.println(e.getMessage());
        } catch (XmlPullParserException | IOException | NumberFormatException ex) {
        }
        return clientes;
    }

}

