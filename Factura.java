public class Factura {

    private double total; // total de la factura en euro-cent

    private double descuento; // descuento aplicado en porcentaje

    private boolean clienteFidelizado;

    /**

     Constructor para crear una factura.

     */

    public Factura(double total, double descuento, boolean clienteFidelizado) {

        this.total = total;

        this.descuento = descuento;

        this.clienteFidelizado = clienteFidelizado;

    }

    /**

     Calcula el precio final después de aplicar el descuento.

     Si el descuento es mayor que 100 o menor que 0, no se aplica descuento.

     Si el cliente está fidelizado se crea un descuento mayor

     */

    public double calcularTotal() {

        double totalConDescuento = total;

        if (descuento > 0 && descuento <= 100)

        {

            totalConDescuento -= totalConDescuento * (descuento / 100);

        }

        if (clienteFidelizado) {

            totalConDescuento -= totalConDescuento * 0.05; // Descuento adicional para clientes fidelizados

        }

        if (totalConDescuento < 0) {

            totalConDescuento = 0; // El total no puede ser negativo

        }

        return totalConDescuento;

    } }