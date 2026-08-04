class Estudiantes(val id: Int, var nombre: String, var email: String) {

    fun mostrarDetalles() {
        println("ID: $id | Nombre: $nombre | Correo: $email")
    }
    
}