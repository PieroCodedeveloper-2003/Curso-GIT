fun main() {

    val gestor = GestorEstudiantes()
    var salir = false

    println("=========================================")
    println("  SISTEMA CRUD DE ESTUDIANTES (POO)")
    println("=========================================")

    while (!salir) {
        println("\n--- MENÚ PRINCIPAL ---")
        println("1. Listar estudiantes (Read)")
        println("2. Registrar estudiante (Create)")
        println("3. Actualizar estudiante (Update)")
        println("4. Eliminar estudiante (Delete)")
        println("5. Salir")
        print("Elige una opción: ")

        when (readLine()?.trim()) {
            "1" -> gestor.leer()
            "2" -> {
                println("\n--- REGISTRAR NUEVO ESTUDIANTE ---")
                print("Ingresa el nombre: ")
                val nombre = readLine()?.trim() ?: ""
                print("Ingresa el correo: ")
                val email = readLine()?.trim() ?: ""

                if (nombre.isNotEmpty() && email.isNotEmpty()) {
                    gestor.crear(nombre, email)
                } else {
                    println("Error: Los campos no pueden estar vacíos.")
                }
            }
            "3" -> {
                println("\n--- ACTUALIZAR ESTUDIANTE ---")
                print("Ingresa el ID del estudiante a actualizar: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    print("Nuevo nombre: ")
                    val nombre = readLine()?.trim() ?: ""
                    print("Nuevo correo: ")
                    val email = readLine()?.trim() ?: ""
                    gestor.actualizar(id, nombre, email)
                } else {
                    println("Error: ID inválido.")
                }
            }
            "4" -> {
                println("\n--- ELIMINAR ESTUDIANTE ---")
                print("Ingresa el ID del estudiante a eliminar: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    gestor.eliminar(id)
                } else {
                    println("Error: ID inválido.")
                }
            }
            "5" -> {
                salir = true
                println("Saliendo del sistema... ¡Hasta luego!")
            }
            else -> {
                println("Opción inválida. Intenta de nuevo.")
            }
        }

    }
    
}