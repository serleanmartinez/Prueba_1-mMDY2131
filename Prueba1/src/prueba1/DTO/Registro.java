
package prueba1.DTO;

public class Registro {
     //los cuales se identificarán por un rol único
    //otorgado por la asociación de Handball, Nombre del Club, nombre del fundador, año de fundación, País de
    //origen, Lema, colores y valor de su suscripción.
    private String Codigo;
    private String NombreClub;
    private String NombreFundador;
    private String AnhoFundacion;
    private String Pais;
    private String Lema;
    private String Color;
    private String ValorSuscripcion;
    
    public Registro(){
        this.Codigo = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AnhoFundacion = "";
        this.Pais = "";
        this.Lema = "";
        this.Color = "";
        this.ValorSuscripcion = "";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public String getAnhoFundacion() {
        return AnhoFundacion;
    }

    public void setAnhoFundacion(String AnhoFundacion) {
        this.AnhoFundacion = AnhoFundacion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(String ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
    
    
}
