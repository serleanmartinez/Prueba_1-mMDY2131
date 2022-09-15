
package prueba1.DTO;

public class Suscripcion {
    //fecha de inicio de la suscripción, valor de la suscripción, equipos al que se
    //está suscrito y abono total por concepto de pagos, además de un correlativo de la venta
    private int Correlativo;
    private String FechaInicio;
    private int Valor;
    private String Equipo;
    private int AbonoTotal;
    
    public Suscripcion(){
        this.Correlativo = 0;
        this.FechaInicio = "";
        this.Valor = 0;
        this.Equipo = "";
        this.AbonoTotal = 0;
    }

    public int getCorrelativo() {
        return Correlativo;
    }

    public void setCorrelativo(int Correlativo) {
        this.Correlativo = Correlativo;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }
    
    
    
    
}
