package ar.org.centro8.especialidad.web.interfaces.Entities;
/*
 * Nombre de la Empresa: El nombre completo de la empresa.
Dirección: La dirección física de la empresa.
Número de Identificación: Un número único que identifica legalmente a la empresa (por ejemplo, número de registro de impuestos).
Tipo de Empresa: El tipo de negocio o industria en la que opera la empresa (puede ser una cadena de restaurantes, una empresa de tecnología, etc.).
Teléfono: Número de teléfono de contacto de la empresa.
Correo Electrónico: Dirección de correo electrónico de contacto de la empresa.
Sitio Web: La dirección web de la empresa.
Fecha de Fundación: La fecha en que se fundó la empresa.
Descripción: Una breve descripción de la empresa y su actividad.
Propietarios o Accionistas: Información sobre las personas o entidades que poseen la empresa.
Empleados: El número de empleados que trabaja en la empresa.
Ingresos Anuales: Los ingresos totales anuales de la empresa.
Ganancias Anuales: Las ganancias netas anuales de la empresa.
Productos o Servicios: Los productos o servicios que la empresa ofrece o vende.
Ubicaciones: Si la empresa tiene múltiples ubicaciones, puedes almacenar información sobre cada una de ellas.
Logo de la Empresa: Una imagen o referencia al logo de la empresa.
Redes Sociales: Enlaces a perfiles de redes sociales de la empresa.
 */

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_empresa;
    private String nombre_empresa;
    private String direccion;
    private String ubicacion;//Si la empresa tiene múltiples ubicaciones, puedes almacenar información sobre cada una de ellas.
    private String telefono;
    private String email;
    private String sitio_web;
    private String descripcion;
    private String productos_servicios;
    @OneToMany(mappedBy ="unaEmpresa")
    private List<Candidato> lista_candidatos;

    public Empresa() {
    }
    
    public Empresa(String nombre_empresa, String direccion, String ubicacion, String telefono, String email,
            String sitio_web, String descripcion, String productos_servicios, List<Candidato> lista_candidatos) {
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.sitio_web = sitio_web;
        this.descripcion = descripcion;
        this.productos_servicios = productos_servicios;
        this.lista_candidatos = lista_candidatos;
    }
    

    public Empresa(Integer id_empresa, String nombre_empresa, String direccion, String ubicacion, String telefono,
            String email, String sitio_web, String descripcion, String productos_servicios,
            List<Candidato> lista_candidatos) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.sitio_web = sitio_web;
        this.descripcion = descripcion;
        this.productos_servicios = productos_servicios;
        this.lista_candidatos = lista_candidatos;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSitio_web() {
        return sitio_web;
    }
    public void setSitio_web(String sitio_web) {
        this.sitio_web = sitio_web;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getProductos_servicios() {
        return productos_servicios;
    }
    public void setProductos_servicios(String productos_servicios) {
        this.productos_servicios = productos_servicios;
    }

    public List<Candidato> getLista_candidatos() {
        return lista_candidatos;
    }

    public void setLista_candidatos(List<Candidato> lista_candidatos) {
        this.lista_candidatos = lista_candidatos;
    }

    @Override
    public String toString() {
        return "Empresa [id_empresa=" + id_empresa + ", nombre_empresa=" + nombre_empresa + ", direccion=" + direccion
                + ", ubicacion=" + ubicacion + ", telefono=" + telefono + ", email=" + email + ", sitio_web="
                + sitio_web + ", descripcion=" + descripcion + ", productos_servicios=" + productos_servicios
                + ", lista_candidatos=" + lista_candidatos + "]";
    }
    

    
}
