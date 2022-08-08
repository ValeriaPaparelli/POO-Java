package excepcion;

public class Empleado {
        private String nombre;
        private String apellido;
        private int sueldo;

        public Empleado(String nombre, String apellido, int sueldo) throws Exception {
            if(sueldo < 0)
                throw new Exception("Sueldo no puede ser menor o igual a cero");
            if(nombre == null)
                throw new Exception("Nombre no puede estar vacío");
            if(apellido == null)
                throw new Exception("Apellido no puede estar vacío");

            this.nombre=nombre;
            this.apellido=apellido;
            this.sueldo=sueldo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getSueldo() {
            return sueldo;
        }
  }
