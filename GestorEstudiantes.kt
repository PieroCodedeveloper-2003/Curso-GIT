class GestorEstudiantes {

    private val listaEstudiantes = mutableListOf<Estudiantes>()
    private var contadorId = 1

    fun crear(nombre: String, email: String) {
        val nuevo = Estudiantes(contadorId++, nombre, email)
        listaEstudiantes.add(nuevo)
        println("¡Estudiante registrado con éxito!")
    }

    fun leer() {
        println("\n--- LISTA DE ESTUDIANTES ---")
        if (listaEstudiantes.isEmpty()) {
            println("No hay registros en el sistema.")
        } else {
            for (est in listaEstudiantes) {
                est.mostrarDetalles()
            }
        }
    }

    fun actualizar(idBuscado: Int, nuevoNombre: String, nuevoEmail: String): Boolean {
        val estudiante = listaEstudiantes.find { it.id == idBuscado }
        if (estudiante != null) {
            if (nuevoNombre.isNotBlank()) estudiante.nombre = nuevoNombre
            if (nuevoEmail.isNotBlank()) estudiante.email = nuevoEmail
            println("¡Estudiante actualizado correctamente!")
            return true
        }
        println("Error: Estudiante no encontrado.")
        return false
    }

    fun eliminar(idBuscado: Int): Boolean {
        val eliminado = listaEstudiantes.removeIf { it.id == idBuscado }
        if (eliminado) {
            println("¡Estudiante eliminado con éxito!")
        } else {
            println("Error: No se encontró un estudiante con ese ID.")
        }
        return eliminado
    }

}