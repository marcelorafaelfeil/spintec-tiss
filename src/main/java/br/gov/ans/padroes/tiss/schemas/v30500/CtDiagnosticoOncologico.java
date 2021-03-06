
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_diagnosticoOncologico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnosticoOncologico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="diagnosticoCID" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_diagnosticoCID10" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="estadiamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_estadiamento"/>
 *         &lt;element name="finalidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_finalidadeTratamento"/>
 *         &lt;element name="ecog" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_ecog"/>
 *         &lt;element name="diagnosticoHispatologico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000" minOccurs="0"/>
 *         &lt;element name="infoRelevantes" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnosticoOncologico", propOrder = {
    "dataDiagnostico",
    "diagnosticoCID",
    "estadiamento",
    "finalidade",
    "ecog",
    "diagnosticoHispatologico",
    "infoRelevantes"
})
public class CtDiagnosticoOncologico {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDiagnostico;
    protected List<String> diagnosticoCID;
    @XmlElement(required = true)
    protected String estadiamento;
    @XmlElement(required = true)
    protected String finalidade;
    @XmlElement(required = true)
    protected String ecog;
    protected String diagnosticoHispatologico;
    protected String infoRelevantes;

    /**
     * Obt�m o valor da propriedade dataDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDiagnostico() {
        return dataDiagnostico;
    }

    /**
     * Define o valor da propriedade dataDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDiagnostico(XMLGregorianCalendar value) {
        this.dataDiagnostico = value;
    }

    /**
     * Gets the value of the diagnosticoCID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticoCID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticoCID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiagnosticoCID() {
        if (diagnosticoCID == null) {
            diagnosticoCID = new ArrayList<String>();
        }
        return this.diagnosticoCID;
    }

    /**
     * Obt�m o valor da propriedade estadiamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadiamento() {
        return estadiamento;
    }

    /**
     * Define o valor da propriedade estadiamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadiamento(String value) {
        this.estadiamento = value;
    }

    /**
     * Obt�m o valor da propriedade finalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalidade() {
        return finalidade;
    }

    /**
     * Define o valor da propriedade finalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalidade(String value) {
        this.finalidade = value;
    }

    /**
     * Obt�m o valor da propriedade ecog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcog() {
        return ecog;
    }

    /**
     * Define o valor da propriedade ecog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcog(String value) {
        this.ecog = value;
    }

    /**
     * Obt�m o valor da propriedade diagnosticoHispatologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticoHispatologico() {
        return diagnosticoHispatologico;
    }

    /**
     * Define o valor da propriedade diagnosticoHispatologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticoHispatologico(String value) {
        this.diagnosticoHispatologico = value;
    }

    /**
     * Obt�m o valor da propriedade infoRelevantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoRelevantes() {
        return infoRelevantes;
    }

    /**
     * Define o valor da propriedade infoRelevantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoRelevantes(String value) {
        this.infoRelevantes = value;
    }

}
