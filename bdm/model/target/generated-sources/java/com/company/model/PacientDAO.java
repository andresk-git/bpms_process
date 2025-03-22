
package com.company.model;

import java.time.LocalDate;
import java.util.List;
import org.bonitasoft.engine.bdm.dao.BusinessObjectDAO;

public interface PacientDAO
    extends BusinessObjectDAO
{


    public Pacient findByPersistenceId(Long persistenceId);

    public List<Pacient> findByStrTipoDocumento(String strTipoDocumento, int startIndex, int maxResults);

    public List<Pacient> findByIntNumeroDocumento(Integer intNumeroDocumento, int startIndex, int maxResults);

    public List<Pacient> findByStrNombreApellido(String strNombreApellido, int startIndex, int maxResults);

    public List<Pacient> findByStrEmail(String strEmail, int startIndex, int maxResults);

    public List<Pacient> findByIntCelular(Integer intCelular, int startIndex, int maxResults);

    public List<Pacient> findByStrPrestadorSalud(String strPrestadorSalud, int startIndex, int maxResults);

    public List<Pacient> findByStrTipoDocAcomp(String strTipoDocAcomp, int startIndex, int maxResults);

    public List<Pacient> findByIntNumDocAcomp(Integer intNumDocAcomp, int startIndex, int maxResults);

    public List<Pacient> findByStrNombreAcomp(String strNombreAcomp, int startIndex, int maxResults);

    public List<Pacient> findByIntCelularAcomp(Integer intCelularAcomp, int startIndex, int maxResults);

    public List<Pacient> findByDtFechaIngreso(LocalDate dtFechaIngreso, int startIndex, int maxResults);

    public List<Pacient> findByStrMotivoConsulta(String strMotivoConsulta, int startIndex, int maxResults);

    public List<Pacient> findByIntTriage(Integer intTriage, int startIndex, int maxResults);

    public List<Pacient> findByStrSignosVitales(String strSignosVitales, int startIndex, int maxResults);

    public List<Pacient> findByIntEdad(Integer intEdad, int startIndex, int maxResults);

    public List<Pacient> findByStrEvaluacionMedico(String strEvaluacionMedico, int startIndex, int maxResults);

    public List<Pacient> findByBExamen(Boolean bExamen, int startIndex, int maxResults);

    public List<Pacient> findByStrExamenSolicitado(String strExamenSolicitado, int startIndex, int maxResults);

    public List<Pacient> findByStrResultadoLaboratorios(String strResultadoLaboratorios, int startIndex, int maxResults);

    public List<Pacient> findByBDiagnostico(Boolean bDiagnostico, int startIndex, int maxResults);

    public List<Pacient> findByStrDiagnostico(String strDiagnostico, int startIndex, int maxResults);

    public List<Pacient> findByBCirugia(Boolean bCirugia, int startIndex, int maxResults);

    public List<Pacient> findByDtFechaCirugia(LocalDate dtFechaCirugia, int startIndex, int maxResults);

    public List<Pacient> findByStrTratamiento(String strTratamiento, int startIndex, int maxResults);

    public List<Pacient> findByStrResultadoCirugia(String strResultadoCirugia, int startIndex, int maxResults);

    public List<Pacient> findByBAsegCobertura(Boolean bAsegCobertura, int startIndex, int maxResults);

    public List<Pacient> findByBAsegAutarizaCirugia(Boolean bAsegAutarizaCirugia, int startIndex, int maxResults);

    public List<Pacient> find(int startIndex, int maxResults);

    public Long countForFindByStrTipoDocumento(String strTipoDocumento);

    public Long countForFindByIntNumeroDocumento(Integer intNumeroDocumento);

    public Long countForFindByStrNombreApellido(String strNombreApellido);

    public Long countForFindByStrEmail(String strEmail);

    public Long countForFindByIntCelular(Integer intCelular);

    public Long countForFindByStrPrestadorSalud(String strPrestadorSalud);

    public Long countForFindByStrTipoDocAcomp(String strTipoDocAcomp);

    public Long countForFindByIntNumDocAcomp(Integer intNumDocAcomp);

    public Long countForFindByStrNombreAcomp(String strNombreAcomp);

    public Long countForFindByIntCelularAcomp(Integer intCelularAcomp);

    public Long countForFindByDtFechaIngreso(LocalDate dtFechaIngreso);

    public Long countForFindByStrMotivoConsulta(String strMotivoConsulta);

    public Long countForFindByIntTriage(Integer intTriage);

    public Long countForFindByStrSignosVitales(String strSignosVitales);

    public Long countForFindByIntEdad(Integer intEdad);

    public Long countForFindByStrEvaluacionMedico(String strEvaluacionMedico);

    public Long countForFindByBExamen(Boolean bExamen);

    public Long countForFindByStrExamenSolicitado(String strExamenSolicitado);

    public Long countForFindByStrResultadoLaboratorios(String strResultadoLaboratorios);

    public Long countForFindByBDiagnostico(Boolean bDiagnostico);

    public Long countForFindByStrDiagnostico(String strDiagnostico);

    public Long countForFindByBCirugia(Boolean bCirugia);

    public Long countForFindByDtFechaCirugia(LocalDate dtFechaCirugia);

    public Long countForFindByStrTratamiento(String strTratamiento);

    public Long countForFindByStrResultadoCirugia(String strResultadoCirugia);

    public Long countForFindByBAsegCobertura(Boolean bAsegCobertura);

    public Long countForFindByBAsegAutarizaCirugia(Boolean bAsegAutarizaCirugia);

    public Long countForFind();

    public Pacient newInstance(String strTipoDocumento, Integer intNumeroDocumento);

}
