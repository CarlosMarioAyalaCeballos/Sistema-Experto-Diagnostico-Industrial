public class MotorInferencia {
    public static String diagnosticar(Hechos h) {

        if (h.temperatura > 80 &&
                h.ruido.equalsIgnoreCase("friccion") &&
                h.vibracion <= 5.5) {

            return "Diagnostico: Falta critica de lubricacion | Prioridad: ALTA";
        }

        if (h.vibracion > 5.5 &&
                h.frecuenciaVibracion.equalsIgnoreCase("1xRPM")) {

            return "Diagnostico: Desalineacion de acoplamiento | Accion: Programar alineacion laser";
        }

        if (h.ruido.equalsIgnoreCase("golpeteo") &&
                h.presion.equalsIgnoreCase("inestable")) {

            return "Diagnostico: Cavitacion en el impulsor | Riesgo: dano por picadura";
        }

        if (h.temperatura > 95 &&
                h.amperaje > 100) {

            return "Diagnostico: Sobrecarga electrica | Accion: reducir carga o revisar bobinado";
        }

        if (h.vibracion > 7 &&
                h.ruido.equalsIgnoreCase("zumbido")) {

            return "Diagnostico: Falla de pista interna en rodamiento | Sugerencia: reemplazo inmediato";
        }

        return "No se detecto una falla especifica";
    }
}
