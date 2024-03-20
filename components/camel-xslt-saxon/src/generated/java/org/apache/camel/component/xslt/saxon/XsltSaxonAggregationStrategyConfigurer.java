/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt.saxon;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.xslt.saxon.XsltSaxonAggregationStrategy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XsltSaxonAggregationStrategyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.xslt.saxon.XsltSaxonAggregationStrategy target = (org.apache.camel.component.xslt.saxon.XsltSaxonAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "output":
        case "Output": target.setOutput(property(camelContext, org.apache.camel.component.xslt.XsltOutput.class, value)); return true;
        case "propertyname":
        case "PropertyName": target.setPropertyName(property(camelContext, java.lang.String.class, value)); return true;
        case "transformerfactoryclass":
        case "TransformerFactoryClass": target.setTransformerFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "xslfile":
        case "XslFile": target.setXslFile(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "output":
        case "Output": return org.apache.camel.component.xslt.XsltOutput.class;
        case "propertyname":
        case "PropertyName": return java.lang.String.class;
        case "transformerfactoryclass":
        case "TransformerFactoryClass": return java.lang.String.class;
        case "xslfile":
        case "XslFile": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.xslt.saxon.XsltSaxonAggregationStrategy target = (org.apache.camel.component.xslt.saxon.XsltSaxonAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "output":
        case "Output": return target.getOutput();
        case "propertyname":
        case "PropertyName": return target.getPropertyName();
        case "transformerfactoryclass":
        case "TransformerFactoryClass": return target.getTransformerFactoryClass();
        case "xslfile":
        case "XslFile": return target.getXslFile();
        default: return null;
        }
    }
}

