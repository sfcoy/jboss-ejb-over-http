JBoss AS 7.2 EJB Remoting over HTTP
===================================

JBoss AS parts that implement EJB remoting over HTTP.

Currently, this provides an AS module that can be added to the modules directory of a JBoss AS 7.2 build.

Add the extension to your standalone.xml/domain.xml:

    <extensions>
        ...
        <extension module="org.jboss.as.ejb-over-http"/>
        ...
    </extensions>

and configure it with:

    <subsystem xmlns="urn:jboss:domain:ejb-over-http:1.0">
        <connector context="ejbhttp" virtual-host="default-host" security-domain="other" />
    </subsystem>

* virtual-host name optional - it defaults to "default-host". It must match a declared virtual-server in
the web subsystem .

* security-domain is optional - the connection will not be secured if it missing.

You can declare multiple connectors with different virtual hosts and contexts


TODO
---
 1. security is not implemented.
 2. add the client jar to the build
