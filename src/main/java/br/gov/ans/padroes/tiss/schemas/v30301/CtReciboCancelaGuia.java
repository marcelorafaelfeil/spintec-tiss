
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_reciboCancelaGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboCancelaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCancelamentoRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboCancelaGuia", propOrder = {
    "mensagemErro",
    "reciboCancelaGuia"
})
public class CtReciboCancelaGuia {

    protected CtMotivoGlosa mensagemErro;
    protected CtGuiaCancelamentoRecibo reciboCancelaGuia;

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Obtém o valor da propriedade reciboCancelaGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public CtGuiaCancelamentoRecibo getReciboCancelaGuia() {
        return reciboCancelaGuia;
    }

    /**
     * Define o valor da propriedade reciboCancelaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public void setReciboCancelaGuia(CtGuiaCancelamentoRecibo value) {
        this.reciboCancelaGuia = value;
    }

}
