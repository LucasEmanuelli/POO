import poo.listatarea.ListaTarea;

public class Main {
    public static void main(String[] args) {
        //int opciones = -1;
        ListaTarea listaTarea = new ListaTarea();
        System.out.println("Lista de tareas creada.");
        listaTarea.agregar("Ir al supermercado manana", 1, 2, "2023-09-05");
        listaTarea.agregar("Consultar repuesto del auto", 1, 1, "2023-09-03"); // Hecho el 4 de septiembre
        listaTarea.agregar("Ir al cine a ver la nueva pelicula de Marvel", 1, 2, "2023-09-03");
        System.out.println(listaTarea.mostrar());
        /*while (opciones != 0) {
            Scanner sc = new Scanner(System.in);
            String descTarea;
            int prioTarea;
            int estTarea;
            String fecTarea;
            int posicion;
            System.out.println("1 - Mostrar lista de tareas. ");
            System.out.println("2 - Agregar tarea a la lista. ");
            System.out.println("3 - Modificar tarea. ");
            System.out.println("4 - Consultar tarea. ");
            System.out.println("5 - Consultar estado de tarea. ");
            System.out.println("6 - Consultar vencimiento de tarea. ");
            System.out.println("---------------------------");
            System.out.print("Ingrese cualquier otro caracter para salir: ");
            opciones = sc.nextInt();
            sc.nextLine();
            if (opciones == 1) {
                System.out.println("---------------------------");
                System.out.println(listaTarea.mostrar());
                System.out.println("---------------------------");
            } else if (opciones == 2) {
                System.out.println("---------------------------");
                System.out.print("Ingrese la descripcion de la tarea a agregar:");
                descTarea = sc.nextLine();
                System.out.print("Ingrese la prioridad (entero de 1 a 5) de la tarea a agregar:");
                prioTarea = sc.nextInt();
                while ((prioTarea < 1) || (prioTarea > 5)) {
                    System.out.print("Prioridad no valida. Vuelva a ingresar:");
                    prioTarea = sc.nextInt();
                }
                System.out.print("Ingrese el estado de la tarea a agregar (1 si esta COMPLETA, 2 si esta INCOMPLETA):");
                estTarea = sc.nextInt();
                while ((estTarea < 1) || (estTarea > 2)) {
                    System.out.print("Estado no valido. Vuelva a ingresar:");
                    estTarea = sc.nextInt();
                }
                System.out.print("Ingrese la fecha limite de la tarea a agregar (yy-mm-dd):");
                fecTarea = sc.next();
                listaTarea.agregar(descTarea, prioTarea, estTarea, fecTarea);
                System.out.println("Tarea agregada.");
                System.out.println("---------------------------");
            }else if (opciones == 3) {
                System.out.println(listaTarea.mostrar());
                System.out.println("---------------------------");
                System.out.print("Ingrese el numero de tarea a modificar:");
                int id = sc.nextInt();
                while (id < 1 || id > listaTarea.longitud()) {
                    System.out.print("Dato invalido.Vuelva a ingresar:");
                    id = sc.nextInt();
                }
                System.out.println("1 - Modificar descripcion de la tarea. ");
                System.out.println("2 - Modificar prioridad de la tarea. ");
                System.out.println("3 - Modificar estado de la tarea. ");
                System.out.print("Ingresar opcion:");
                int mod = sc.nextInt();
                while (mod < 1 || mod > 3) {
                    System.out.print("Opcion invalida. Vuelva a ingresar:");
                    mod = sc.nextInt();
                }
                if (mod == 1) {
                    System.out.print("Ingrese la nueva descripcion de la tarea:");
                    descTarea = sc.next();
                    listaTarea.modificarTarea(id, mod, descTarea);
                    System.out.println("Modificacion realizada.");
                } else if (mod == 2) {
                    System.out.print("Ingrese la nueva prioridad de la tarea (1-5):");
                    prioTarea = sc.nextInt();
                    while ((prioTarea < 1) || (prioTarea > 5)) {
                        System.out.print("Prioridad no valida. Vuelva a ingresar:");
                        prioTarea = sc.nextInt();
                    }
                    listaTarea.modificarTarea(id, mod, String.valueOf(prioTarea));
                    System.out.println("Modificacion realizada.");
                } else {
                    System.out.println("Ingrese el nuevo estado de la tarea (1 si esta COMPLETA, 2 si esta INCOMPLETA):");
                    estTarea = sc.nextInt();
                    while ((estTarea < 1) || (estTarea > 2)) {
                        System.out.print("Estado no valido. Vuelva a ingresar:");
                        estTarea = sc.nextInt();
                    }
                    if (estTarea == 1) {
                        listaTarea.modificarTarea(id, mod, "COMPLETA");
                    } else {
                        listaTarea.modificarTarea(id, mod, "INCOMPLETA");
                    }
                    System.out.println("Modificacion realizada.");
                }
            }else if (opciones==4) {
                System.out.println(listaTarea.mostrar());
                System.out.println("---------------------------");
                System.out.print("Ingrese el numero de tarea a mostrar:");
                int id = sc.nextInt();
                while (id < 1 || id > listaTarea.longitud()) {
                    System.out.print("Dato invalido.Vuelva a ingresar:");
                    id = sc.nextInt();
                }
                System.out.println(listaTarea.mostrarTarea(id));
            }else if (opciones == 5) {
                System.out.println(listaTarea.mostrar());
                System.out.println("---------------------------");
                System.out.print("Ingrese el numero de tarea a consultar:");
                int id = sc.nextInt();
                while (id < 1 || id > listaTarea.longitud()) {
                    System.out.print("Dato invalido.Vuelva a ingresar:");
                    id = sc.nextInt();
                }
                System.out.println("La tarea esta: " + listaTarea.estadoTarea(id));
            }else if (opciones == 6){
                System.out.println(listaTarea.mostrar());
                System.out.println("---------------------------");
                System.out.print("Ingrese el numero de tarea a consultar:");
                int id = sc.nextInt();
                while (id < 1 || id > listaTarea.longitud()) {
                    System.out.print("Dato invalido.Vuelva a ingresar:");
                    id = sc.nextInt();
                }
                System.out.println(listaTarea.vencTarea(id));
            } else {
                opciones = 0;
                System.out.println("Saliendo...");
                System.out.println("---------------------------");
            }

        }*/
    }
}