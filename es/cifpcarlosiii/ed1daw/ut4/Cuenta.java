package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

/**
 * Clase Cuenta con los atributos titular y saldo
 */
public class Cuenta {

    private String titular;
    private double saldo;

    /**
     * Pone el saldo de la cuenta a 0
     */
    public Cuenta() {
        setSaldo(0);
    }

    /**
     * Constructor del objeto
     * @param titular {String}
     */
    public Cuenta(String titular) {
        this.titular = titular;
    }

    /**
     * Metodo para mostrar datos de la cuenta
     */
    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    /**
     * Metodo para ver si es posible retirar saldo
     * @param cantidad {double} Cantidad a retirar de la cuenta
     * @return Devuelve un boolean dependiendo si es posible retirar o no el saldo pedido
     */
    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get del atributo titular
     * @return Devuelve el nombre del titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set del atributo titular
     * @param titular{String} Nombre del titular de la cuenta
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Get del atributo saldo
     * @return Devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set del atributo saldo
     * @param saldo{double} Saldo que se introduce en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
