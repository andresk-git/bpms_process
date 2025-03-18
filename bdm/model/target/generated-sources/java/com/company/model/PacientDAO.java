
package com.company.model;

import java.time.LocalDateTime;
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

    public List<Pacient> findByDtFechaIngreso(LocalDateTime dtFechaIngreso, int startIndex, int maxResults);

    public List<Pacient> findByStrMotivoConsulta(String strMotivoConsulta, int startIndex, int maxResults);

    public List<Pacient> findByIntTriage(Integer intTriage, int startIndex, int maxResults);

    public List<Pacient> findByStrEvaluacionMedico(String strEvaluacionMedico, int startIndex, int maxResults);

    public List<Pacient> findByBExamen(Boolean bExamen, int startIndex, int maxResults);

    public List<Pacient> findByStrExamenSolicitado(String strExamenSolicitado, int startIndex, int maxResults);

    public List<Pacient> findByStrResultadoExamen(String strResultadoExamen, int startIndex, int maxResults);

    public List<Pacient> findByBDiagnostico(Boolean bDiagnostico, int startIndex, int maxResults);

    public List<Pacient> findByStrDiagnostico(String strDiagnostico, int startIndex, int maxResults);

    public List<Pacient> findByStrTratamiento(String strTratamiento, int startIndex, int maxResults);

    public List<Pacient> findByBCirugia(Boolean bCirugia, int startIndex, int maxResults);

    public List<Pacient> findByBRemiteConsExterna(String bRemiteConsExterna, int startIndex, int maxResults);

    public List<Pacient> find(int startIndex, int maxResults);

    public Long countForFindByStrTipoDocumento(String strTipoDocumento);

    public Long countForFindByIntNumeroDocumento(Integer intNumeroDocumento);

    public Long countForFindByStrNombreApellido(String strNombreApellido);

    public Long countForFindByStrEmail(String strEmail);

    public Long countForFindByIntCelular(Integer intCelular);

    public Long countForFindByDtFechaIngreso(LocalDateTime dtFechaIngreso);

    public Long countForFindByStrMotivoConsulta(String strMotivoConsulta);

    public Long countForFindByIntTriage(Integer intTriage);

    public Long countForFindByStrEvaluacionMedico(String strEvaluacionMedico);

    public Long countForFindByBExamen(Boolean bExamen);

    public Long countForFindByStrExamenSolicitado(String strExamenSolicitado);

    public Long countForFindByStrResultadoExamen(String strResultadoExamen);

    public Long countForFindByBDiagnostico(Boolean bDiagnostico);

    public Long countForFindByStrDiagnostico(String strDiagnostico);

    public Long countForFindByStrTratamiento(String strTratamiento);

    public Long countForFindByBCirugia(Boolean bCirugia);

    public Long countForFindByBRemiteConsExterna(String bRemiteConsExterna);

    public Long countForFind();

    public Pacient newInstance(String strTipoDocumento, Integer intNumeroDocumento);

}
