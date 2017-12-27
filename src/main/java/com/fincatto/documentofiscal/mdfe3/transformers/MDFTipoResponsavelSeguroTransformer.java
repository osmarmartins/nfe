package com.fincatto.documentofiscal.mdfe3.transformers;

import com.fincatto.documentofiscal.mdfe3.classes.def.MDFTipoResponsavelSeguro;
import org.simpleframework.xml.transform.Transform;

/**
 * Created by Eldevan Nery Junior on 07/12/17.
 */
public class MDFTipoResponsavelSeguroTransformer implements Transform<MDFTipoResponsavelSeguro> {

    @Override
    public MDFTipoResponsavelSeguro read(String value) throws Exception {
        return MDFTipoResponsavelSeguro.valueOfCodigo(value);
    }

    @Override
    public String write(MDFTipoResponsavelSeguro value) throws Exception {
        return value.getCodigo();
    }
}
