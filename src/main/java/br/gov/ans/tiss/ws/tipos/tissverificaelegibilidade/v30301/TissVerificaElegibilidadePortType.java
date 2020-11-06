
package com.spin.verificaelegibilidade.tiss.br.gov.ans.tiss.ws.tipos.tissverificaelegibilidade.v30301;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.ObjectFactory;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.PedidoElegibilidadeWS;
import com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301.RespostaElegibilidadeWS;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "tissVerificaElegibilidade_PortType", targetNamespace = "http://www.ans.gov.br/tiss/ws/tipos/tissverificaelegibilidade/v30301")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ObjectFactory.class,
    com.spin.verificaelegibilidade.tiss.org.w3._2000._09.xmldsig_.v30301.ObjectFactory.class
})
public interface TissVerificaElegibilidadePortType {


    /**
     * 
     * @param pedidoElegibilidade
     * @return
     *     RespostaElegibilidadeWS
     * @throws TissFault
     */
    @WebMethod(operationName = "tissVerificaElegibilidade_Operation")
    @WebResult(name = "respostaElegibilidadeWS", targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas", partName = "respostaElegibilidade")
    public RespostaElegibilidadeWS tissVerificaElegibilidadeOperation(
        @WebParam(name = "pedidoElegibilidadeWS", targetNamespace = "http://www.ans.gov.br/padroes/tiss/schemas", partName = "pedidoElegibilidade")
        PedidoElegibilidadeWS pedidoElegibilidade)
        throws TissFault
    ;

}
