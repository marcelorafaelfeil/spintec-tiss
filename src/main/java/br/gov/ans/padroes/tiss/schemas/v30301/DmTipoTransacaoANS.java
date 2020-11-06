
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_tipoTransacaoANS.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tipoTransacaoANS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONITORAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tipoTransacaoANS")
@XmlEnum
public enum DmTipoTransacaoANS {

    MONITORAMENTO;

    public String value() {
        return name();
    }

    public static DmTipoTransacaoANS fromValue(String v) {
        return valueOf(v);
    }

}
