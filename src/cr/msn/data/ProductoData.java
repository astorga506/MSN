package cr.msn.data;


import java.io.IOException;
import java.util.LinkedList;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import cr.msn.dominio.Producto;

/**
 *
 * @author Carlos
 */
public class ProductoData {

    public ProductoData() {
    }

    public LinkedList<Producto> getProductos(String clave) {
        LinkedList<Producto> productos = new LinkedList<>();
        SoapObject request = new SoapObject("http://msn.cr/", "GetProductos");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        PropertyInfo pi = new PropertyInfo();
        pi.setName("clave");
        pi.setValue(clave);
        request.addProperty(pi);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE("http://192.168.0.99/WebServiceMSN/ProductoMSN.asmx");
        try {
            androidHttpTransport.call("http://msn.cr/GetProductos", envelope);
            SoapObject response = (SoapObject) envelope.getResponse();

            for (int i = 0; i < response.getPropertyCount(); i++) {
                SoapObject obj = (SoapObject) response.getProperty(i);
                Producto producto = new Producto();
                producto.setCodProducto(Integer.parseInt(obj.getPropertyAsString("CodProducto")));
                producto.setNombreProducto(obj.getPropertyAsString("NombreProducto"));
                producto.setDescripcion(obj.getPropertyAsString("Descripcion"));
                producto.setDetalles(obj.getPropertyAsString("Detalles"));
                producto.setPrecio(Float.parseFloat(obj.getPropertyAsString("Precio")));
                producto.setCantDisponible(Integer.parseInt(obj.getPropertyAsString("CantDisponible")));
                SoapObject cat = (SoapObject) obj.getProperty("Categoria");
                producto.getCategoria().setCodCategoria(Integer.parseInt(cat.getPropertyAsString("CodCategoria")));
                producto.getCategoria().setNombreCategoria(cat.getPropertyAsString("Nombre"));

                productos.add(producto);    
            }

        } catch (SoapFault e) {
            System.out.println(e.getMessage());
        } catch (XmlPullParserException | IOException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return productos;
    }

    public Producto getProducto(int codProducto) {
        Producto producto = new Producto();
        SoapObject request = new SoapObject("http://msn.cr/", "GetProducto");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        PropertyInfo pi = new PropertyInfo();
        pi.setName("codProducto");
        pi.setValue(codProducto);
        request.addProperty(pi);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE("http://192.168.0.99/WebServiceMSN/ProductoMSN.asmx");
        try {
            androidHttpTransport.call("http://msn.cr/GetProducto", envelope);
            SoapObject response = (SoapObject) envelope.getResponse();

            SoapObject obj = (SoapObject) response.getProperty("Producto");

            producto.setCodProducto(Integer.parseInt(obj.getPropertyAsString("CodProducto")));
            producto.setNombreProducto(obj.getPropertyAsString("NombreProducto"));
            producto.setDescripcion(obj.getPropertyAsString("Descripcion"));
            producto.setDetalles(obj.getPropertyAsString("Detalles"));
            producto.setPrecio(Float.parseFloat(obj.getPropertyAsString("Precio")));
            producto.setCantDisponible(Integer.parseInt(obj.getPropertyAsString("CantDisponible")));
            SoapObject cat = (SoapObject) obj.getProperty("Categoria");
            producto.getCategoria().setCodCategoria(Integer.parseInt(cat.getPropertyAsString("CodCategoria")));
            producto.getCategoria().setNombreCategoria(cat.getPropertyAsString("Nombre"));

        } catch (SoapFault e) {
            System.out.println(e.getMessage());
        } catch (XmlPullParserException | IOException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return producto;
    }

}
