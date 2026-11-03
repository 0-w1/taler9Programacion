# Taller 9 – Principios SOLID

Proyecto ParqueaderoSOLID desarrollado en Java. Cada carpeta representa una versión acumulativa: se parte del código inicial y se aplica un principio SOLID en cada paso.

| Carpeta | Principio | Cambios realizados |
|---|---|---|
| `00-inicio` | Código inicial | Proyecto base con las cinco violaciones SOLID propuestas en el taller.
| `01-responsabilidad-unica` | SRP – Responsabilidad única | Se separan la exportación CSV (`ExportadorCSV`) y el envío de SMS (`NotificadorSMS`). `GestorParqueadero` conserva el cálculo y coordina `cerrarMes`.
| `02-abierto-cerrado` | OCP – Abierto/cerrado | `Vehiculo` pasa a ser abstracta y el cálculo del cobro se implementa en `Carro`, `Moto`, `Bicicleta` y `VehiculoPorDia`. Se agrega el cobro diario sin modificar las clases existentes del gestor.
| `03-sustitucion-liskov` | LSP – Sustitución de Liskov | Se elimina `calcularPuntos()` de `Vehiculo` y se crea `Fidelizable`. Solo los vehículos que acumulan puntos implementan esa interfaz; `Bicicleta` no promete esa capacidad.
| `04-segregacion-interfaces` | ISP – Segregación de interfaces | Se reemplaza la interfaz general por interfaces pequeñas: `ConMinutos`, `ConSeguro`, `ConLavado` y `GuardaCasco`. Cada clase implementa solo las capacidades que necesita.
| `05-inversion-dependencias` | DIP – Inversión de dependencias | `GestorParqueadero` recibe `RepositorioCobros` por constructor. Se agrega `RepositorioEnMemoria` para probar sin conectarse a MySQL.

## Cómo ejecutar

Entra a cualquiera de las seis carpetas desde una terminal y ejecuta:

```bash
javac *.java && java Main
```

Cada carpeta compila y ejecuta de forma independiente. Las líneas modificadas en cada paso están identificadas con comentarios `// Paso`.
