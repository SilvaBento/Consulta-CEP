/**
 * CEPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CEPService_pkg;

public class CEPServiceLocator extends org.apache.axis.client.Service implements CEPService_pkg.CEPService {

    public CEPServiceLocator() {
    }


    public CEPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CEPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CEPServicePort
    private java.lang.String CEPServicePort_address = "http://www.byjg.com.br/site/webservice.php/ws/cep";

    public java.lang.String getCEPServicePortAddress() {
        return CEPServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CEPServicePortWSDDServiceName = "CEPServicePort";

    public java.lang.String getCEPServicePortWSDDServiceName() {
        return CEPServicePortWSDDServiceName;
    }

    public void setCEPServicePortWSDDServiceName(java.lang.String name) {
        CEPServicePortWSDDServiceName = name;
    }

    public CEPService_pkg.CEPServicePort getCEPServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CEPServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCEPServicePort(endpoint);
    }

    public CEPService_pkg.CEPServicePort getCEPServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CEPService_pkg.CEPServiceBindingStub _stub = new CEPService_pkg.CEPServiceBindingStub(portAddress, this);
            _stub.setPortName(getCEPServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCEPServicePortEndpointAddress(java.lang.String address) {
        CEPServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CEPService_pkg.CEPServicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                CEPService_pkg.CEPServiceBindingStub _stub = new CEPService_pkg.CEPServiceBindingStub(new java.net.URL(CEPServicePort_address), this);
                _stub.setPortName(getCEPServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CEPServicePort".equals(inputPortName)) {
            return getCEPServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:CEPService", "CEPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:CEPService", "CEPServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CEPServicePort".equals(portName)) {
            setCEPServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
