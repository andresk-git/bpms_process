
package com.company.model;

import java.time.LocalDate;
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
    @NamedQuery(name = "Pacient.findByStrPrestadorSalud", query = "SELECT p\nFROM Pacient p\nWHERE p.strPrestadorSalud= :strPrestadorSalud\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrTipoDocAcomp", query = "SELECT p\nFROM Pacient p\nWHERE p.strTipoDocAcomp= :strTipoDocAcomp\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntNumDocAcomp", query = "SELECT p\nFROM Pacient p\nWHERE p.intNumDocAcomp= :intNumDocAcomp\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrNombreAcomp", query = "SELECT p\nFROM Pacient p\nWHERE p.strNombreAcomp= :strNombreAcomp\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntCelularAcomp", query = "SELECT p\nFROM Pacient p\nWHERE p.intCelularAcomp= :intCelularAcomp\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByDtFechaIngreso", query = "SELECT p\nFROM Pacient p\nWHERE p.dtFechaIngreso= :dtFechaIngreso\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrMotivoConsulta", query = "SELECT p\nFROM Pacient p\nWHERE p.strMotivoConsulta= :strMotivoConsulta\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntTriage", query = "SELECT p\nFROM Pacient p\nWHERE p.intTriage= :intTriage\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrSignosVitales", query = "SELECT p\nFROM Pacient p\nWHERE p.strSignosVitales= :strSignosVitales\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByIntEdad", query = "SELECT p\nFROM Pacient p\nWHERE p.intEdad= :intEdad\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrEvaluacionMedico", query = "SELECT p\nFROM Pacient p\nWHERE p.strEvaluacionMedico= :strEvaluacionMedico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBExamen", query = "SELECT p\nFROM Pacient p\nWHERE p.bExamen= :bExamen\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrExamenSolicitado", query = "SELECT p\nFROM Pacient p\nWHERE p.strExamenSolicitado= :strExamenSolicitado\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrResultadoLaboratorios", query = "SELECT p\nFROM Pacient p\nWHERE p.strResultadoLaboratorios= :strResultadoLaboratorios\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBDiagnostico", query = "SELECT p\nFROM Pacient p\nWHERE p.bDiagnostico= :bDiagnostico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrDiagnostico", query = "SELECT p\nFROM Pacient p\nWHERE p.strDiagnostico= :strDiagnostico\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBCirugia", query = "SELECT p\nFROM Pacient p\nWHERE p.bCirugia= :bCirugia\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByDtFechaCirugia", query = "SELECT p\nFROM Pacient p\nWHERE p.dtFechaCirugia= :dtFechaCirugia\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrTratamiento", query = "SELECT p\nFROM Pacient p\nWHERE p.strTratamiento= :strTratamiento\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByStrResultadoCirugia", query = "SELECT p\nFROM Pacient p\nWHERE p.strResultadoCirugia= :strResultadoCirugia\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBAsegCobertura", query = "SELECT p\nFROM Pacient p\nWHERE p.bAsegCobertura= :bAsegCobertura\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.findByBAsegAutarizaCirugia", query = "SELECT p\nFROM Pacient p\nWHERE p.bAsegAutarizaCirugia= :bAsegAutarizaCirugia\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.find", query = "SELECT p\nFROM Pacient p\nORDER BY p.persistenceId"),
    @NamedQuery(name = "Pacient.countForFindByStrTipoDocumento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strTipoDocumento= :strTipoDocumento\n"),
    @NamedQuery(name = "Pacient.countForFindByIntNumeroDocumento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intNumeroDocumento= :intNumeroDocumento\n"),
    @NamedQuery(name = "Pacient.countForFindByStrNombreApellido", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strNombreApellido= :strNombreApellido\n"),
    @NamedQuery(name = "Pacient.countForFindByStrEmail", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strEmail= :strEmail\n"),
    @NamedQuery(name = "Pacient.countForFindByIntCelular", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intCelular= :intCelular\n"),
    @NamedQuery(name = "Pacient.countForFindByStrPrestadorSalud", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strPrestadorSalud= :strPrestadorSalud\n"),
    @NamedQuery(name = "Pacient.countForFindByStrTipoDocAcomp", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strTipoDocAcomp= :strTipoDocAcomp\n"),
    @NamedQuery(name = "Pacient.countForFindByIntNumDocAcomp", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intNumDocAcomp= :intNumDocAcomp\n"),
    @NamedQuery(name = "Pacient.countForFindByStrNombreAcomp", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strNombreAcomp= :strNombreAcomp\n"),
    @NamedQuery(name = "Pacient.countForFindByIntCelularAcomp", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intCelularAcomp= :intCelularAcomp\n"),
    @NamedQuery(name = "Pacient.countForFindByDtFechaIngreso", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.dtFechaIngreso= :dtFechaIngreso\n"),
    @NamedQuery(name = "Pacient.countForFindByStrMotivoConsulta", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strMotivoConsulta= :strMotivoConsulta\n"),
    @NamedQuery(name = "Pacient.countForFindByIntTriage", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intTriage= :intTriage\n"),
    @NamedQuery(name = "Pacient.countForFindByStrSignosVitales", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strSignosVitales= :strSignosVitales\n"),
    @NamedQuery(name = "Pacient.countForFindByIntEdad", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.intEdad= :intEdad\n"),
    @NamedQuery(name = "Pacient.countForFindByStrEvaluacionMedico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strEvaluacionMedico= :strEvaluacionMedico\n"),
    @NamedQuery(name = "Pacient.countForFindByBExamen", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bExamen= :bExamen\n"),
    @NamedQuery(name = "Pacient.countForFindByStrExamenSolicitado", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strExamenSolicitado= :strExamenSolicitado\n"),
    @NamedQuery(name = "Pacient.countForFindByStrResultadoLaboratorios", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strResultadoLaboratorios= :strResultadoLaboratorios\n"),
    @NamedQuery(name = "Pacient.countForFindByBDiagnostico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bDiagnostico= :bDiagnostico\n"),
    @NamedQuery(name = "Pacient.countForFindByStrDiagnostico", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strDiagnostico= :strDiagnostico\n"),
    @NamedQuery(name = "Pacient.countForFindByBCirugia", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bCirugia= :bCirugia\n"),
    @NamedQuery(name = "Pacient.countForFindByDtFechaCirugia", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.dtFechaCirugia= :dtFechaCirugia\n"),
    @NamedQuery(name = "Pacient.countForFindByStrTratamiento", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strTratamiento= :strTratamiento\n"),
    @NamedQuery(name = "Pacient.countForFindByStrResultadoCirugia", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.strResultadoCirugia= :strResultadoCirugia\n"),
    @NamedQuery(name = "Pacient.countForFindByBAsegCobertura", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bAsegCobertura= :bAsegCobertura\n"),
    @NamedQuery(name = "Pacient.countForFindByBAsegAutarizaCirugia", query = "SELECT COUNT(p)\nFROM Pacient p\nWHERE p.bAsegAutarizaCirugia= :bAsegAutarizaCirugia\n"),
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
    @Column(name = "STRPRESTADORSALUD", nullable = true, length = 255)
    private String strPrestadorSalud;
    @Column(name = "STRTIPODOCACOMP", nullable = true, length = 255)
    private String strTipoDocAcomp;
    @Column(name = "INTNUMDOCACOMP", nullable = true)
    private Integer intNumDocAcomp;
    @Column(name = "STRNOMBREACOMP", nullable = true, length = 255)
    private String strNombreAcomp;
    @Column(name = "INTCELULARACOMP", nullable = true)
    private Integer intCelularAcomp;
    @Column(name = "DTFECHAINGRESO", nullable = true, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate dtFechaIngreso;
    @Column(name = "STRMOTIVOCONSULTA", nullable = true, length = 255)
    private String strMotivoConsulta;
    @Column(name = "INTTRIAGE", nullable = true)
    private Integer intTriage;
    @Column(name = "STRSIGNOSVITALES", nullable = true, length = 255)
    private String strSignosVitales;
    @Column(name = "INTEDAD", nullable = true)
    private Integer intEdad;
    @Column(name = "STREVALUACIONMEDICO", nullable = true, length = 255)
    private String strEvaluacionMedico;
    @Column(name = "BEXAMEN", nullable = true)
    private Boolean bExamen;
    @Column(name = "STREXAMENSOLICITADO", nullable = true, length = 255)
    private String strExamenSolicitado;
    @Column(name = "STRRESULTADOLABORATORIOS", nullable = true, length = 255)
    private String strResultadoLaboratorios;
    @Column(name = "BDIAGNOSTICO", nullable = true)
    private Boolean bDiagnostico;
    @Column(name = "STRDIAGNOSTICO", nullable = true, length = 255)
    private String strDiagnostico;
    @Column(name = "BCIRUGIA", nullable = true)
    private Boolean bCirugia;
    @Column(name = "DTFECHACIRUGIA", nullable = true, length = 10)
    @Convert(converter = org.bonitasoft.engine.business.data.generator.DateConverter.class)
    private LocalDate dtFechaCirugia;
    @Column(name = "STRTRATAMIENTO", nullable = true, length = 255)
    private String strTratamiento;
    @Column(name = "STRRESULTADOCIRUGIA", nullable = true, length = 255)
    private String strResultadoCirugia;
    @Column(name = "BASEGCOBERTURA", nullable = true)
    private Boolean bAsegCobertura;
    @Column(name = "BASEGAUTARIZACIRUGIA", nullable = true)
    private Boolean bAsegAutarizaCirugia;

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

    public void setStrPrestadorSalud(String strPrestadorSalud) {
        this.strPrestadorSalud = strPrestadorSalud;
    }

    public String getStrPrestadorSalud() {
        return strPrestadorSalud;
    }

    public void setStrTipoDocAcomp(String strTipoDocAcomp) {
        this.strTipoDocAcomp = strTipoDocAcomp;
    }

    public String getStrTipoDocAcomp() {
        return strTipoDocAcomp;
    }

    public void setIntNumDocAcomp(Integer intNumDocAcomp) {
        this.intNumDocAcomp = intNumDocAcomp;
    }

    public Integer getIntNumDocAcomp() {
        return intNumDocAcomp;
    }

    public void setStrNombreAcomp(String strNombreAcomp) {
        this.strNombreAcomp = strNombreAcomp;
    }

    public String getStrNombreAcomp() {
        return strNombreAcomp;
    }

    public void setIntCelularAcomp(Integer intCelularAcomp) {
        this.intCelularAcomp = intCelularAcomp;
    }

    public Integer getIntCelularAcomp() {
        return intCelularAcomp;
    }

    public void setDtFechaIngreso(LocalDate dtFechaIngreso) {
        this.dtFechaIngreso = dtFechaIngreso;
    }

    public LocalDate getDtFechaIngreso() {
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

    public void setStrSignosVitales(String strSignosVitales) {
        this.strSignosVitales = strSignosVitales;
    }

    public String getStrSignosVitales() {
        return strSignosVitales;
    }

    public void setIntEdad(Integer intEdad) {
        this.intEdad = intEdad;
    }

    public Integer getIntEdad() {
        return intEdad;
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

    public void setStrResultadoLaboratorios(String strResultadoLaboratorios) {
        this.strResultadoLaboratorios = strResultadoLaboratorios;
    }

    public String getStrResultadoLaboratorios() {
        return strResultadoLaboratorios;
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

    public void setBCirugia(Boolean bCirugia) {
        this.bCirugia = bCirugia;
    }

    public Boolean isBCirugia() {
        return bCirugia;
    }

    public void setDtFechaCirugia(LocalDate dtFechaCirugia) {
        this.dtFechaCirugia = dtFechaCirugia;
    }

    public LocalDate getDtFechaCirugia() {
        return dtFechaCirugia;
    }

    public void setStrTratamiento(String strTratamiento) {
        this.strTratamiento = strTratamiento;
    }

    public String getStrTratamiento() {
        return strTratamiento;
    }

    public void setStrResultadoCirugia(String strResultadoCirugia) {
        this.strResultadoCirugia = strResultadoCirugia;
    }

    public String getStrResultadoCirugia() {
        return strResultadoCirugia;
    }

    public void setBAsegCobertura(Boolean bAsegCobertura) {
        this.bAsegCobertura = bAsegCobertura;
    }

    public Boolean isBAsegCobertura() {
        return bAsegCobertura;
    }

    public void setBAsegAutarizaCirugia(Boolean bAsegAutarizaCirugia) {
        this.bAsegAutarizaCirugia = bAsegAutarizaCirugia;
    }

    public Boolean isBAsegAutarizaCirugia() {
        return bAsegAutarizaCirugia;
    }

}
