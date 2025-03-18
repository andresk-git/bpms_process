
package com.company.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * 
 */
@javax.persistence.Entity(name = "Pacient")
@Table(name = "PACIENT")
@NamedQueries({
    @NamedQuery(name = "Pacient.findByPersistenceId", query = "SELECT p\nFROM Pacient p\nWHERE p.persistenceId= :persistenceId\n"),
    @NamedQuery(name = "Pacient.findByStrTipoDocumento", query = "SELECT p\nFROM Pacient p\nWHERE p.strTipoDocumento= :strTipoDocumento\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntNumeroDocumento", query = "SELECT p\nFROM Pacient p\nWHERE p.intNumeroDocumento= :intNumeroDocumento\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrNombreApellido", query = "SELECT p\nFROM Pacient p\nWHERE p.strNombreApellido= :strNombreApellido\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrEmail", query = "SELECT p\nFROM Pacient p\nWHERE p.strEmail= :strEmail\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntCelular", query = "SELECT p\nFROM Pacient p\nWHERE p.intCelular= :intCelular\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByDtFechaIngreso", query = "SELECT p\nFROM Pacient p\nWHERE p.dtFechaIngreso= :dtFechaIngreso\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrMotivoConsulta", query = "SELECT p\nFROM Pacient p\nWHERE p.strMotivoConsulta= :strMotivoConsulta\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntTriage", query = "SELECT p\nFROM Pacient p\nWHERE p.intTriage= :intTriage\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrEvaluacionMedico", query = "SELECT p\nFROM Pacient p\nWHERE p.strEvaluacionMedico= :strEvaluacionMedico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBExamen", query = "SELECT p\nFROM Pacient p\nWHERE p.bExamen= :bExamen\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrExamenSolicitado", query = "SELECT p\nFROM Pacient p\nWHERE p.strExamenSolicitado= :strExamenSolicitado\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrResultadoExamen", query = "SELECT p\nFROM Pacient p\nWHERE p.strResultadoExamen= :strResultadoExamen\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBDiagnostico", query = "SELECT p\nFROM Pacient p\nWHERE p.bDiagnostico= :bDiagnostico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrDiagnostico", query = "SELECT p\nFROM Pacient p\nWHERE p.strDiagnostico= :strDiagnostico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrTratamiento", query = "SELECT p\nFROM Pacient p\nWHERE p.strTratamiento= :strTratamiento\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBCirugia", query = "SELECT p\nFROM Pacient p\nWHERE p.bCirugia= :bCirugia\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBRemiteConsExterna", query = "SELECT p\nFROM Pacient p\nWHERE p.bRemiteConsExterna= :bRemiteConsExterna\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.find", query = "SELECT p\nFROM Pacient p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.countForFindByStrTipoDocumento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strTipoDocumento= :strTipoDocumento\n"),
    @NamedQuery(name = "Pacient.countForFindByIntNumeroDocumento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intNumeroDocumento= :intNumeroDocumento\n"),
    @NamedQuery(name = "Pacient.countForFindByStrNombreApellido", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strNombreApellido= :strNombreApellido\n"),
    @NamedQuery(name = "Pacient.countForFindByStrEmail", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strEmail= :strEmail\n"),
    @NamedQuery(name = "Pacient.countForFindByIntCelular", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intCelular= :intCelular\n"),
    @NamedQuery(name = "Pacient.countForFindByDtFechaIngreso", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.dtFechaIngreso= :dtFechaIngreso\n"),
    @NamedQuery(name = "Pacient.countForFindByStrMotivoConsulta", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strMotivoConsulta= :strMotivoConsulta\n"),
    @NamedQuery(name = "Pacient.countForFindByIntTriage", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intTriage= :intTriage\n"),
    @NamedQuery(name = "Pacient.countForFindByStrEvaluacionMedico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strEvaluacionMedico= :strEvaluacionMedico\n"),
    @NamedQuery(name = "Pacient.countForFindByBExamen", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bExamen= :bExamen\n"),
    @NamedQuery(name = "Pacient.countForFindByStrExamenSolicitado", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strExamenSolicitado= :strExamenSolicitado\n"),
    @NamedQuery(name = "Pacient.countForFindByStrResultadoExamen", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strResultadoExamen= :strResultadoExamen\n"),
    @NamedQuery(name = "Pacient.countForFindByBDiagnostico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bDiagnostico= :bDiagnostico\n"),
    @NamedQuery(name = "Pacient.countForFindByStrDiagnostico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strDiagnostico= :strDiagnostico\n"),
    @NamedQuery(name = "Pacient.countForFindByStrTratamiento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strTratamiento= :strTratamiento\n"),
    @NamedQuery(name = "Pacient.countForFindByBCirugia", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bCirugia= :bCirugia\n"),
    @NamedQuery(name = "Pacient.countForFindByBRemiteConsExterna", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bRemiteConsExterna= :bRemiteConsExterna\n"),
    @NamedQuery(name = "Pacient.countForFind", query = "SELECT COUNT(p)\nFROM Pacient p\n")
})
public class Pacient implements org.bonitasoft.engine.bdm.Entity
{

    @Id
    @GeneratedValue(generator = "default_bonita_seq_generator")
    @GenericGenerator(name = "default_bonita_seq_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "hibernate_sequence")
    })
    private Long persistenceId;
    @Version
    private Long persistenceVersion;
    @Column(name = "STRTIPODOCUMENTO", nullable = false, length = 255)
    private String strTipoDocumento;
    @Column(name = "INTNUMERODOCUMENTO", nullable = false)
    private Integer intNumeroDocumento;
    @Column(name = "STRNOMBREAPELLIDO", nullable = true, length = 255)
    private String strNombreApellido;
    @Column(name = "STREMAIL", nullable = true, length = 255)
    private String strEmail;
    @Column(name = "INTCELULAR", nullable = true)
    private Integer intCelular;
    @Column(name = "DTFECHAINGRESO", nullable = true, length = 30)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateAndTimeConverter.class)
    private LocalDateTime dtFechaIngreso;
    @Column(name = "STRMOTIVOCONSULTA", nullable = true, length = 255)
    private String strMotivoConsulta;
    @Column(name = "INTTRIAGE", nullable = true)
    private Integer intTriage;
    @Column(name = "STREVALUACIONMEDICO", nullable = true, length = 255)
    private String strEvaluacionMedico;
    @Column(name = "BEXAMEN", nullable = true)
    private Boolean bExamen;
    @Column(name = "STREXAMENSOLICITADO", nullable = true, length = 255)
    private String strExamenSolicitado;
    @Column(name = "STRRESULTADOEXAMEN", nullable = true, length = 255)
    private String strResultadoExamen;
    @Column(name = "BDIAGNOSTICO", nullable = true)
    private Boolean bDiagnostico;
    @Column(name = "STRDIAGNOSTICO", nullable = true, length = 255)
    private String strDiagnostico;
    @Column(name = "STRTRATAMIENTO", nullable = true, length = 255)
    private String strTratamiento;
    @Column(name = "BCIRUGIA", nullable = true)
    private Boolean bCirugia;
    @Column(name = "BREMITECONSEXTERNA", nullable = true, length = 255)
    private String bRemiteConsExterna;

    public Pacient() {
    }

    public void setPersistenceId(Long persistenceId) {
        this.persistenceId = persistenceId;
    }

    public Long getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceVersion(Long persistenceVersion) {
        this.persistenceVersion = persistenceVersion;
    }

    public Long getPersistenceVersion() {
        return persistenceVersion;
    }

    public void setStrTipoDocumento(String strTipoDocumento) {
        this.strTipoDocumento = strTipoDocumento;
    }

    public String getStrTipoDocumento() {
        return strTipoDocumento;
    }

    public void setIntNumeroDocumento(Integer intNumeroDocumento) {
        this.intNumeroDocumento = intNumeroDocumento;
    }

    public Integer getIntNumeroDocumento() {
        return intNumeroDocumento;
    }

    public void setStrNombreApellido(String strNombreApellido) {
        this.strNombreApellido = strNombreApellido;
    }

    public String getStrNombreApellido() {
        return strNombreApellido;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setIntCelular(Integer intCelular) {
        this.intCelular = intCelular;
    }

    public Integer getIntCelular() {
        return intCelular;
    }

    public void setDtFechaIngreso(LocalDateTime dtFechaIngreso) {
        this.dtFechaIngreso = dtFechaIngreso;
    }

    public LocalDateTime getDtFechaIngreso() {
        return dtFechaIngreso;
    }

    public void setStrMotivoConsulta(String strMotivoConsulta) {
        this.strMotivoConsulta = strMotivoConsulta;
    }

    public String getStrMotivoConsulta() {
        return strMotivoConsulta;
    }

    public void setIntTriage(Integer intTriage) {
        this.intTriage = intTriage;
    }

    public Integer getIntTriage() {
        return intTriage;
    }

    public void setStrEvaluacionMedico(String strEvaluacionMedico) {
        this.strEvaluacionMedico = strEvaluacionMedico;
    }

    public String getStrEvaluacionMedico() {
        return strEvaluacionMedico;
    }

    public void setBExamen(Boolean bExamen) {
        this.bExamen = bExamen;
    }

    public Boolean isBExamen() {
        return bExamen;
    }

    public void setStrExamenSolicitado(String strExamenSolicitado) {
        this.strExamenSolicitado = strExamenSolicitado;
    }

    public String getStrExamenSolicitado() {
        return strExamenSolicitado;
    }

    public void setStrResultadoExamen(String strResultadoExamen) {
        this.strResultadoExamen = strResultadoExamen;
    }

    public String getStrResultadoExamen() {
        return strResultadoExamen;
    }

    public void setBDiagnostico(Boolean bDiagnostico) {
        this.bDiagnostico = bDiagnostico;
    }

    public Boolean isBDiagnostico() {
        return bDiagnostico;
    }

    public void setStrDiagnostico(String strDiagnostico) {
        this.strDiagnostico = strDiagnostico;
    }

    public String getStrDiagnostico() {
        return strDiagnostico;
    }

    public void setStrTratamiento(String strTratamiento) {
        this.strTratamiento = strTratamiento;
    }

    public String getStrTratamiento() {
        return strTratamiento;
    }

    public void setBCirugia(Boolean bCirugia) {
        this.bCirugia = bCirugia;
    }

    public Boolean isBCirugia() {
        return bCirugia;
    }

    public void setBRemiteConsExterna(String bRemiteConsExterna) {
        this.bRemiteConsExterna = bRemiteConsExterna;
    }

    public String getBRemiteConsExterna() {
        return bRemiteConsExterna;
    }

}
