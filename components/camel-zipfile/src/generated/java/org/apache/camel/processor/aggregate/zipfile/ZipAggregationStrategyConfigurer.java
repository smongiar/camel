/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.processor.aggregate.zipfile;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.processor.aggregate.zipfile.ZipAggregationStrategy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ZipAggregationStrategyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.zipfile.ZipAggregationStrategy target = (org.apache.camel.processor.aggregate.zipfile.ZipAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "FilePrefix": target.setFilePrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "filesuffix":
        case "FileSuffix": target.setFileSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "parentdir":
        case "ParentDir": target.setParentDir(property(camelContext, java.io.File.class, value)); return true;
        case "preservefolderstructure":
        case "PreserveFolderStructure": target.setPreserveFolderStructure(property(camelContext, boolean.class, value)); return true;
        case "usefilenameheader":
        case "UseFilenameHeader": target.setUseFilenameHeader(property(camelContext, boolean.class, value)); return true;
        case "usetempfile":
        case "UseTempFile": target.setUseTempFile(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "FilePrefix": return java.lang.String.class;
        case "filesuffix":
        case "FileSuffix": return java.lang.String.class;
        case "parentdir":
        case "ParentDir": return java.io.File.class;
        case "preservefolderstructure":
        case "PreserveFolderStructure": return boolean.class;
        case "usefilenameheader":
        case "UseFilenameHeader": return boolean.class;
        case "usetempfile":
        case "UseTempFile": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.processor.aggregate.zipfile.ZipAggregationStrategy target = (org.apache.camel.processor.aggregate.zipfile.ZipAggregationStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "fileprefix":
        case "FilePrefix": return target.getFilePrefix();
        case "filesuffix":
        case "FileSuffix": return target.getFileSuffix();
        case "parentdir":
        case "ParentDir": return target.getParentDir();
        case "preservefolderstructure":
        case "PreserveFolderStructure": return target.isPreserveFolderStructure();
        case "usefilenameheader":
        case "UseFilenameHeader": return target.isUseFilenameHeader();
        case "usetempfile":
        case "UseTempFile": return target.isUseTempFile();
        default: return null;
        }
    }
}

