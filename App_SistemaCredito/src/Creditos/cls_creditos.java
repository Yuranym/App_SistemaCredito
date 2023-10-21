/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creditos;

public class cls_creditos {
    private String str_Tipo;
    private String str_nombre;
    private String str_id;
    private String str_contacto;
    private String str_correo;
    private int int_plazo;
    private float flt_monto;
    private float flt_totalInteres;
    private float flt_totalCredito;
    private float flt_cuota;
    
    public cls_creditos (String tipo, String nombre, String id, String contacto, String correo, int plazo, float monto){
        this.str_Tipo = tipo;
        this.str_nombre = nombre;
        this.str_contacto = contacto;
        this.str_correo = correo;
        this.int_plazo = plazo;
        this.flt_monto = monto;
        this.str_id = id;
        if(this.str_Tipo.equals("0")){
        this.flt_totalInteres = (float)(this.flt_monto * 0.02) * this.int_plazo;//Conversion implicita cuando el resultado sea mas grande de lo que la variable puede sostener (mantener preciso)
        this.flt_totalCredito = this.flt_monto + this.flt_totalInteres;
        this.flt_cuota = this.flt_totalCredito / int_plazo;
        }
    }

    public String getStr_Tipo() {
        return str_Tipo;
    }

    public void setStr_Tipo(String str_Tipo) {
        this.str_Tipo = str_Tipo;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_contacto() {
        return str_contacto;
    }

    public void setStr_contacto(String str_contacto) {
        this.str_contacto = str_contacto;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }

    public int getInt_plazo() {
        return int_plazo;
    }

    public void setInt_plazo(int int_plazo) {
        this.int_plazo = int_plazo;
    }

    public float getFlt_monto() {
        return flt_monto;
    }

    public void setFlt_monto(float flt_monto) {
        this.flt_monto = flt_monto;
    }

    public float getFlt_totalInteres() {
        return flt_totalInteres;
    }

    public void setFlt_totalInteres(float flt_totalInteres) {
        this.flt_totalInteres = flt_totalInteres;
    }

    public float getFlt_totalCredito() {
        return flt_totalCredito;
    }

    public void setFlt_totalCredito(float flt_totalCredito) {
        this.flt_totalCredito = flt_totalCredito;
    }

    public float getFlt_cuota() {
        return flt_cuota;
    }

    public void setFlt_cuota(float flt_cuota) {
        this.flt_cuota = flt_cuota;
    }

    public String getStr_id() {
        return str_id;
    }
    
}

