package ar.org.centro8.especialidad.web.interfaces.Entities;

import ar.org.centro8.especialidad.web.interfaces.enums.Respuesta;
import ar.org.centro8.especialidad.web.interfaces.enums.TipoDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidato")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String apellidos;
    private String nombress;
    @Enumerated(value = EnumType.STRING)
    private TipoDocumento TipoDocumento;
    private String numero_documento;
    private String fenaci;
    @Enumerated(value = EnumType.STRING)
    private Respuesta estudios_primarios;
    @Enumerated(value = EnumType.STRING)
    private Respuesta estudios_secundarios;
    @Enumerated(value = EnumType.STRING)
    private Respuesta estudios_terciarios;
    @Enumerated(value = EnumType.STRING)
    private Respuesta estudios_universitarios;
    private String estudios_primarios_colegio;
    private String estudios_secundarios_colegio;
    private String estudios_terciarios_colegio;
    private String estudios_universitarios_universidad;
    private String estudios_secundarios_titulo;
    private String estudios_terciarios_titulo;
    private String estudios_universitarios_titulo;
    private String idiomas;
    private String habilidades;
    private String perfil_laboral;
    private String direccion;
    private String telefono;
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "fk_empresa")
    private Empresa unaEmpresa;

    public Candidato() {
    }

    

    public Candidato(String apellidos, String nombress,
            ar.org.centro8.especialidad.web.interfaces.enums.TipoDocumento tipoDocumento, String numero_documento,
            String fenaci, Respuesta estudios_primarios, Respuesta estudios_secundarios, Respuesta estudios_terciarios,
            Respuesta estudios_universitarios, String estudios_primarios_colegio, String estudios_secundarios_colegio,
            String estudios_terciarios_colegio, String estudios_universitarios_universidad,
            String estudios_secundarios_titulo, String estudios_terciarios_titulo,
            String estudios_universitarios_titulo, String idiomas, String habilidades, String perfil_laboral,
            String direccion, String telefono, String email) {
        this.apellidos = apellidos;
        this.nombress = nombress;
        TipoDocumento = tipoDocumento;
        this.numero_documento = numero_documento;
        this.fenaci = fenaci;
        this.estudios_primarios = estudios_primarios;
        this.estudios_secundarios = estudios_secundarios;
        this.estudios_terciarios = estudios_terciarios;
        this.estudios_universitarios = estudios_universitarios;
        this.estudios_primarios_colegio = estudios_primarios_colegio;
        this.estudios_secundarios_colegio = estudios_secundarios_colegio;
        this.estudios_terciarios_colegio = estudios_terciarios_colegio;
        this.estudios_universitarios_universidad = estudios_universitarios_universidad;
        this.estudios_secundarios_titulo = estudios_secundarios_titulo;
        this.estudios_terciarios_titulo = estudios_terciarios_titulo;
        this.estudios_universitarios_titulo = estudios_universitarios_titulo;
        this.idiomas = idiomas;
        this.habilidades = habilidades;
        this.perfil_laboral = perfil_laboral;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    



    public Candidato(Integer id, String apellidos, String nombress,
            ar.org.centro8.especialidad.web.interfaces.enums.TipoDocumento tipoDocumento, String numero_documento,
            String fenaci, Respuesta estudios_primarios, Respuesta estudios_secundarios, Respuesta estudios_terciarios,
            Respuesta estudios_universitarios, String estudios_primarios_colegio, String estudios_secundarios_colegio,
            String estudios_terciarios_colegio, String estudios_universitarios_universidad,
            String estudios_secundarios_titulo, String estudios_terciarios_titulo,
            String estudios_universitarios_titulo, String idiomas, String habilidades, String perfil_laboral,
            String direccion, String telefono, String email) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombress = nombress;
        TipoDocumento = tipoDocumento;
        this.numero_documento = numero_documento;
        this.fenaci = fenaci;
        this.estudios_primarios = estudios_primarios;
        this.estudios_secundarios = estudios_secundarios;
        this.estudios_terciarios = estudios_terciarios;
        this.estudios_universitarios = estudios_universitarios;
        this.estudios_primarios_colegio = estudios_primarios_colegio;
        this.estudios_secundarios_colegio = estudios_secundarios_colegio;
        this.estudios_terciarios_colegio = estudios_terciarios_colegio;
        this.estudios_universitarios_universidad = estudios_universitarios_universidad;
        this.estudios_secundarios_titulo = estudios_secundarios_titulo;
        this.estudios_terciarios_titulo = estudios_terciarios_titulo;
        this.estudios_universitarios_titulo = estudios_universitarios_titulo;
        this.idiomas = idiomas;
        this.habilidades = habilidades;
        this.perfil_laboral = perfil_laboral;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombress() {
        return nombress;
    }

    public void setNombress(String nombress) {
        this.nombress = nombress;
    }

    public TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getFenaci() {
        return fenaci;
    }

    public void setFenaci(String fenaci) {
        this.fenaci = fenaci;
    }

    public Respuesta getEstudios_primarios() {
        return estudios_primarios;
    }

    public void setEstudios_primarios(Respuesta estudios_primarios) {
        this.estudios_primarios = estudios_primarios;
    }

    public Respuesta getEstudios_secundarios() {
        return estudios_secundarios;
    }

    public void setEstudios_secundarios(Respuesta estudios_secundarios) {
        this.estudios_secundarios = estudios_secundarios;
    }

    public Respuesta getEstudios_terciarios() {
        return estudios_terciarios;
    }

    public void setEstudios_terciarios(Respuesta estudios_terciarios) {
        this.estudios_terciarios = estudios_terciarios;
    }

    public Respuesta getEstudios_universitarios() {
        return estudios_universitarios;
    }

    public void setEstudios_universitarios(Respuesta estudios_universitarios) {
        this.estudios_universitarios = estudios_universitarios;
    }

    public String getEstudios_primarios_colegio() {
        return estudios_primarios_colegio;
    }

    public void setEstudios_primarios_colegio(String estudios_primarios_colegio) {
        this.estudios_primarios_colegio = estudios_primarios_colegio;
    }

    public String getEstudios_secundarios_colegio() {
        return estudios_secundarios_colegio;
    }

    public void setEstudios_secundarios_colegio(String estudios_secundarios_colegio) {
        this.estudios_secundarios_colegio = estudios_secundarios_colegio;
    }

    public String getEstudios_terciarios_colegio() {
        return estudios_terciarios_colegio;
    }

    public void setEstudios_terciarios_colegio(String estudios_terciarios_colegio) {
        this.estudios_terciarios_colegio = estudios_terciarios_colegio;
    }

    public String getEstudios_universitarios_universidad() {
        return estudios_universitarios_universidad;
    }

    public void setEstudios_universitarios_universidad(String estudios_universitarios_universidad) {
        this.estudios_universitarios_universidad = estudios_universitarios_universidad;
    }

    public String getEstudios_secundarios_titulo() {
        return estudios_secundarios_titulo;
    }

    public void setEstudios_secundarios_titulo(String estudios_secundarios_titulo) {
        this.estudios_secundarios_titulo = estudios_secundarios_titulo;
    }

    public String getEstudios_terciarios_titulo() {
        return estudios_terciarios_titulo;
    }

    public void setEstudios_terciarios_titulo(String estudios_terciarios_titulo) {
        this.estudios_terciarios_titulo = estudios_terciarios_titulo;
    }

    public String getEstudios_universitarios_titulo() {
        return estudios_universitarios_titulo;
    }

    public void setEstudios_universitarios_titulo(String estudios_universitarios_titulo) {
        this.estudios_universitarios_titulo = estudios_universitarios_titulo;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getPerfil_laboral() {
        return perfil_laboral;
    }

    public void setPerfil_laboral(String perfil_laboral) {
        this.perfil_laboral = perfil_laboral;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return "Candidato [id=" + id + ", apellidos=" + apellidos + ", nombress=" + nombress + ", TipoDocumento="
                + TipoDocumento + ", numero_documento=" + numero_documento + ", fenaci=" + fenaci
                + ", estudios_primarios=" + estudios_primarios + ", estudios_secundarios=" + estudios_secundarios
                + ", estudios_terciarios=" + estudios_terciarios + ", estudios_universitarios="
                + estudios_universitarios + ", estudios_primarios_colegio=" + estudios_primarios_colegio
                + ", estudios_secundarios_colegio=" + estudios_secundarios_colegio + ", estudios_terciarios_colegio="
                + estudios_terciarios_colegio + ", estudios_universitarios_universidad="
                + estudios_universitarios_universidad + ", estudios_secundarios_titulo=" + estudios_secundarios_titulo
                + ", estudios_terciarios_titulo=" + estudios_terciarios_titulo + ", estudios_universitarios_titulo="
                + estudios_universitarios_titulo + ", idiomas=" + idiomas + ", habilidades=" + habilidades
                + ", perfil_laboral=" + perfil_laboral + ", direccion=" + direccion + ", telefono=" + telefono
                + ", email=" + email + "]";
    }

    
    

}
