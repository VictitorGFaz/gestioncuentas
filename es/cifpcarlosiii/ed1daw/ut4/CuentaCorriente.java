package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class CuentaCorriente extends Cuenta {

    private double comision;

    public CuentaCorriente() {
        setComision(2.0);
    }

    public void aplicarComision() {
        setSaldo(getSaldo() - getComision());
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}