package edu.escuelaing.arep.securehost;

import static spark.Spark.*;

/**
 * The type Secure host.
 */
public class SecureHost {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        secure("keystores/ecikeystore.p12", "pansito", "keystores/myTrustStoreLogin", "pansito");
        port(getPort());
        get("/hello", (req, res) -> "CONECCION CON OTRA API :D");
    }

    /**
     * Gets port.
     *
     * @return the port
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001;
    }

}
