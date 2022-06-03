package semana_dos_ejercicios;

public class Cliente{

    private int codigo;
    private String razonSocial;
    
    public Cliente(){
    }
    public Cliente(int c, String r){
        setCodigo(c);
        setRazonSocial(r);
    }
    //setter
    public void setCodigo(int val){
        this.codigo = val;
    }
    public void setRazonSocial(String val){
        this.razonSocial = val;
    }
    //getter
    public int getCodigo(){
        return codigo;
    }
    public String getRazonSocial(){
        return razonSocial;
    }
}
