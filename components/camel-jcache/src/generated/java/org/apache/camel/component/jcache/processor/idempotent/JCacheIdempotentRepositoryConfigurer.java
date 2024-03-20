/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcache.processor.idempotent;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.jcache.processor.idempotent.JCacheIdempotentRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JCacheIdempotentRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.jcache.processor.idempotent.JCacheIdempotentRepository target = (org.apache.camel.component.jcache.processor.idempotent.JCacheIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "CacheName": target.setCacheName(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration":
        case "Configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.jcache.JCacheConfiguration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "CacheName": return java.lang.String.class;
        case "configuration":
        case "Configuration": return org.apache.camel.component.jcache.JCacheConfiguration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.jcache.processor.idempotent.JCacheIdempotentRepository target = (org.apache.camel.component.jcache.processor.idempotent.JCacheIdempotentRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "cachename":
        case "CacheName": return target.getCacheName();
        case "configuration":
        case "Configuration": return target.getConfiguration();
        default: return null;
        }
    }
}

