    package org.example;

    import org.example.dao.AutorDAO;
    import org.example.dao.LibroDAO;
    import org.example.dao.MiembroDAO;
    import org.example.dao.PrestamoDAO;
    import org.example.model.Autores;
    import org.example.model.Libros;
    import org.example.model.Miembros;
    import org.example.model.Prestamos;
    import org.example.utils.AutorDAOImpl;
    import org.example.utils.LibroDAOImpl;
    import org.example.utils.MiembroDAOImpl;
    import org.example.utils.PrestamoDAOImpl;

    import java.sql.Date;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LibroDAOImpl libro = new LibroDAOImpl();
            boolean play = false;

            int opcion;
            do {
                System.out.println("""
                         Bienvenido a nusatro sistema de libreria!!!!
                         seleccione lo que desea realiza...
                        
                         1)agregar autor.
                         2)agregar libro.
                         3)agregar miembro.
                         4)hacer prestamo.
                         5)listar libros.
                         6)salir del programa.
                        
                        
                        """);
                opcion = scanner.nextInt();

                AutorDAO autorDAO = new AutorDAOImpl();
                LibroDAO libroDAO = new LibroDAOImpl();
                MiembroDAO miembroDAO = new MiembroDAOImpl();
                PrestamoDAO prestamoDAO = new PrestamoDAOImpl();


                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Nacionalidad: ");
                        String nacionalidad = scanner.nextLine();
                        System.out.print("ID del autor: ");
                        int autorId = Integer.parseInt(scanner.nextLine());

                        Autores autor = new Autores(nombre, apellido, nacionalidad, autorId);
                        autorDAO.agregarAutor(autor);
                        System.out.println("Autor agregado.");
                    }

                    case 2 -> {
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("ID del libro: ");
                        String libroId = scanner.nextLine();
                        System.out.print("Género: ");
                        String genero = scanner.nextLine();
                        System.out.print("ID del autor: ");
                        String autorId = scanner.nextLine();

                        Libros libro1 = new Libros(titulo, libroId, genero, autorId);
                        libroDAO.insertar(libro1);
                        System.out.println("Libro agregado.");
                    }

                    case 3 -> {
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Fecha de inscripción (YYYY-MM-DD): ");
                        Date fechaInscripcion = Date.valueOf(scanner.nextLine());

                        Miembros miembro = new Miembros(nombre, apellido, fechaInscripcion);
                        miembroDAO.insertar(miembro);
                        System.out.println("Miembro agregado.");
                    }

                    case 4 -> {
                        System.out.print("ID del préstamo: ");
                        int prestamoId = Integer.parseInt(scanner.nextLine());
                        System.out.print("ID del libro: ");
                        int libroId = Integer.parseInt(scanner.nextLine());
                        System.out.print("ID del miembro: ");
                        int miembroId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Fecha del préstamo (YYYY-MM-DD): ");
                        Date fechaPrestamo = Date.valueOf(scanner.nextLine());
                        System.out.print("Fecha de devolución (YYYY-MM-DD o ENTER si no hay): ");
                        String fechaDevStr = scanner.nextLine();
                        Date fechaDevolucion = fechaDevStr.isEmpty() ? null : Date.valueOf(fechaDevStr);

                        Prestamos prestamo = new Prestamos(prestamoId, libroId, miembroId, fechaPrestamo, fechaDevolucion);
                        prestamoDAO.insertar(prestamo);
                        System.out.println("Préstamo agregado.");
                    }

                    case 5 -> {
                        System.out.println("\n--- Lista de libros ---");
                        for (Libros libro1 : libroDAO.obtenerTodos()) {
                            System.out.println("Título: " + libro1.getTitulo() +
                                    ", ID: " + libro1.getLibroId() +
                                    ", Género: " + libro1.getGenero() +
                                    ", Autor ID: " + libro1.getAutorId());
                        }
                    }

                    case 6 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }

            } while (opcion != 0);
        }
    }
