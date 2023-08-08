/**
 * MessengerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.services;

public interface MessengerService extends javax.xml.rpc.Service {
    public java.lang.String getMessengerPortAddress();

    public com.java.services.Messenger getMessengerPort() throws javax.xml.rpc.ServiceException;

    public com.java.services.Messenger getMessengerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
