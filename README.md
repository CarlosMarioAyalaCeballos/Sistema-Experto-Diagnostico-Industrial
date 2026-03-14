# Sistema Experto de Diagnóstico Industrial

Repositorio que implementa un **Sistema Experto básico en Java** para el diagnóstico preliminar de fallas en maquinaria industrial mediante reglas de inferencia del tipo **SI – ENTONCES**.

El sistema analiza variables provenientes de sensores industriales como **temperatura, vibración, ruido, presión y consumo eléctrico**, con el objetivo de identificar posibles fallas operativas en equipos industriales.

---

## Reglas del Sistema Experto

### Regla 1 – Falta de Lubricación
**SI**
- Temperatura > 80 °C
- Ruido = "Fricción"
- Vibración = Normal

**ENTONCES**
- Diagnóstico: Falta crítica de lubricación
- Prioridad: Alta

---

### Regla 2 – Desalineación de Acoplamiento
**SI**
- Vibración > 5.5 mm/s
- Frecuencia de vibración = "1x RPM"

**ENTONCES**
- Diagnóstico: Desalineación de acoplamiento
- Acción recomendada: Programar alineación láser

---

### Regla 3 – Cavitación
**SI**
- Ruido = "Golpeteo"
- Presión = Inestable

**ENTONCES**
- Diagnóstico: Cavitación en el impulsor
- Riesgo: Daño por picadura

---

### Regla 4 – Sobrecarga Eléctrica
**SI**
- Temperatura > 95 °C
- Consumo de amperaje > nominal

**ENTONCES**
- Diagnóstico: Sobrecarga eléctrica
- Acción recomendada: Reducir carga o revisar el bobinado del motor

---

### Regla 5 – Falla en Rodamiento
**SI**
- Vibración = Alta frecuencia
- Ruido = "Zumbido constante"

**ENTONCES**
- Diagnóstico: Falla de pista interna en rodamiento
- Sugerencia: Reemplazo inmediato

---

## Autor

**Carlos Mario Ayala Ceballos**  
Estudiante de Ingeniería de Software

---

## Licencia

Este proyecto se desarrolla con fines **académicos y educativos**.
