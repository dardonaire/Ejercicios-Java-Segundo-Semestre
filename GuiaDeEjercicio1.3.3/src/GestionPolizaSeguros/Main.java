package GestionPolizaSeguros;

import GestionPolizaSeguros.Seguros.Renovable;
import GestionPolizaSeguros.Seguros.SeguroSalud;
import GestionPolizaSeguros.Seguros.SeguroVehiculo;
import GestionPolizaSeguros.Seguros.SeguroVida;
import GestionPolizaSeguros.base.PolizaSeguro;

        public class Main {

            public static void main(String[] args) {

                // Crear pólizas usando referencias PolizaSeguro
                PolizaSeguro poliza1 = new SeguroSalud(
                        101,
                        "Juan Carlos Perez",
                        10000000,
                        35,
                        80
                );

                PolizaSeguro poliza2 = new SeguroVehiculo(
                        102,
                        "Maria Gonzalez",
                        15000000,
                        "Toyota",
                        2022,
                        12000000
                );

                PolizaSeguro poliza3 = new SeguroVida(
                        103,
                        "Pedro Ramirez",
                        20000000,
                        65,
                        24
                );


                // 1. Mostrar información
                System.out.println("=== INFORMACIÓN ===");

                poliza1.mostrarInformacion();
                poliza2.mostrarInformacion();
                poliza3.mostrarInformacion();


                // 2. Calcular prima
                System.out.println("\n=== PRIMAS ===");

                System.out.println(poliza1.calcularPrima());
                System.out.println(poliza2.calcularPrima());
                System.out.println(poliza3.calcularPrima());


                // 3. Mostrar cobertura
                System.out.println("\n=== COBERTURAS ===");

                System.out.println(poliza1.obtenerTipoCobertura());
                System.out.println(poliza2.obtenerTipoCobertura());
                System.out.println(poliza3.obtenerTipoCobertura());


                // 4. Probar búsqueda por cliente
                System.out.println("\n=== BÚSQUEDA DE CLIENTES ===");

                System.out.println(poliza1.coincideConCliente("juan"));
                System.out.println(poliza2.coincideConCliente("maria"));
                System.out.println(poliza3.coincideConCliente("Carlos"));


                // 5. Probar renovación cuando corresponda
                System.out.println("\n=== RENOVACIÓN ===");

                if (poliza1 instanceof Renovable) {
                    Renovable renovable = (Renovable) poliza1;
                    System.out.println(renovable.renovar(12));
                }

                if (poliza2 instanceof Renovable) {
                    Renovable renovable = (Renovable) poliza2;
                    System.out.println(renovable.renovar(12));
                }

                if (poliza3 instanceof Renovable) {
                    Renovable renovable = (Renovable) poliza3;
                    System.out.println(renovable.renovar(12));
                }
            }
        }



