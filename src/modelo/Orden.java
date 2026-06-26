package modelo;

public class Orden {

    private int idOrden;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private double costoTotal;
    private String observaciones;

    public Orden() {
    }

    public Orden(int idOrden,
                 String fecha,
                 String horaEntrada,
                 String horaSalida,
                 String estado,
                 double costoTotal,
                 String observaciones) {

        this.idOrden = idOrden;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.observaciones = observaciones;
    }

    // Generar getters y setters con NetBeans

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}