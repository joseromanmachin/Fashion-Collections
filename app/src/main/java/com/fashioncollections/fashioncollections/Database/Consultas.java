package com.fashioncollections.fashioncollections.Database;

/**
 * Created by jose on 30/10/17.
 */

public class Consultas {
    public static final String CREAR_TABLA_PRODUCTOS = "CREATE TABLE `productos` (\n" +
            "\t`ID`\t,\n" +
            "\t`Pagina`\t,\n" +
            "\t`Marca`\t,\n" +
            "\t`Modelo`\t,\n" +
            "\t`CodigoInternet`\t,\n" +
            "\t`Color`\t,\n" +
            "\t`Costoproveedor`\t,\n" +
            "\t`CostodeVentaAlPublico`\t,\n" +
            "\t`Incremento`\t,\n" +
            "\t`Residuo`\t,\n" +
            "\t`Porcentaje%`\t,\n" +
            "\t`ComicionMercado`\t,\n" +
            "\t`ComiciondeMercadoEstimada`\t,\n" +
            "\t`GananciaEstimada`\t,\n" +
            "\t`GananciaReal`\t,\n" +
            "\t`Difeenciadeganancias`\t,\n" +
            "\t`Obervaciones`\t\n" +
            ")";

    public static final String EXISTE_PRODUCTOS ="DROP TABLE IF EXISTS productos";

    public static final String CODIGO_INTERNET="select id,pagina, marca, modelo, color, codigointernet,costoproveedor, costodeventaalpublico,comicionmercado, gananciareal  from productos where modelo=";
    public static final String COLOR="select coloR  from productos where modelo=";

}
