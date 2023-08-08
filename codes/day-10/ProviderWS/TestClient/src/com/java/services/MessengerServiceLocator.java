/**
 * MessengerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.services;

public class MessengerServiceLocator extends org.apache.axis.client.Service implements com.java.services.MessengerService {

    public MessengerServiceLocator() {
    }


    public MessengerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MessengerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MessengerPort
    private java.lang.String MessengerPort_address = "http://localhost:3456/ws/messenger";

    public java.lang.String getMessengerPortAddress() {
        return MessengerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MessengerPortWSDDServiceName = "MessengerPort";

    public java.lang.String getMessengerPortWSDDServiceName() {
        return MessengerPortWSDDServiceName;
    }

    public void setMessengerPortWSDDServiceName(java.lang.String name) {
        MessengerPortWSDDServiceName = name;
    }

    public com.java.services.Messenger getMessengerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MessengerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMessengerPort(endpoint);
    }

    public com.java.services.Messenger getMessengerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.java.services.MessengerPortBindingStub _stub = new com.java.services.MessengerPortBindingStub(portAddress, this);
            _stub.setPortName(getMessengerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMessengerPortEndpointAddress(java.lang.String address) {
        MessengerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.java.services.Messenger.class.isAssignableFrom(serviceEndpointInterface)) {
                com.java.services.MessengerPortBindingStub _stub = new com.java.services.MessengerPortBindingStub(new java.net.URL(MessengerPort_address), this);
                _stub.setPortName(getMessengerPortWSDDServiceName());
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
        if ("MessengerPort".equals(inputPortName)) {
            return getMessengerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.java.com/", "MessengerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.java.com/", "MessengerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MessengerPort".equals(portName)) {
            setMessengerPortEndpointAddress(address);
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
