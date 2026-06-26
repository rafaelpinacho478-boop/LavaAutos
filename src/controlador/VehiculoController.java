package controlador;

import dao.VehiculoDAO;
import java.util.ArrayList;
import modelo.Vehiculo;

public class VehiculoController {

    private VehiculoDAO vehiculoDAO;

    public VehiculoController() {
        vehiculoDAO = new VehiculoDAO();
    }

    public boolean guardarVehiculo(Vehiculo vehiculo) {

    try {

        if (vehiculo.getMarca().trim().isEmpty()) {
            throw new Exception("La marca es obligatoria.");
        }

        if (vehiculo.getModelo().trim().isEmpty()) {
            throw new Exception("El modelo es obligatorio.");
        }

        return vehiculoDAO.guardarVehiculo(vehiculo);

    } catch (Exception e) {

        System.out.println(e.getMessage());

        return false;

    }

}
    
    public ArrayList<Vehiculo> listarVehiculos() {

    return vehiculoDAO.listarVehiculos();

}
    
    public boolean actualizarVehiculo(Vehiculo vehiculo) {

    try {

        if (vehiculo.getMarca().trim().isEmpty()) {
            throw new Exception("La marca es obligatoria.");
        }

        if (vehiculo.getModelo().trim().isEmpty()) {
            throw new Exception("El modelo es obligatorio.");
        }

        return vehiculoDAO.actualizarVehiculo(vehiculo);

    } catch (Exception e) {

        System.out.println(e.getMessage());

        return false;

    }

}
}