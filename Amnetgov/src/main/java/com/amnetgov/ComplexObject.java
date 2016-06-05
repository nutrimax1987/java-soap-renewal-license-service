
package com.amnetgov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexObject")
@XmlSeeAlso({ SeleccionarResultadoCertificadorResultado.class,
		ConsultarResultadoSeguimientoCertificadorResultado.class })
public abstract class ComplexObject extends StructuralObject {

}
