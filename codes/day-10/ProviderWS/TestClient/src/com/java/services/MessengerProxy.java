package com.java.services;

public class MessengerProxy implements com.java.services.Messenger {
  private String _endpoint = null;
  private com.java.services.Messenger messenger = null;
  
  public MessengerProxy() {
    _initMessengerProxy();
  }
  
  public MessengerProxy(String endpoint) {
    _endpoint = endpoint;
    _initMessengerProxy();
  }
  
  private void _initMessengerProxy() {
    try {
      messenger = (new com.java.services.MessengerServiceLocator()).getMessengerPort();
      if (messenger != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)messenger)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)messenger)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (messenger != null)
      ((javax.xml.rpc.Stub)messenger)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.services.Messenger getMessenger() {
    if (messenger == null)
      _initMessengerProxy();
    return messenger;
  }
  
  public java.lang.String getMessage(java.lang.String arg0) throws java.rmi.RemoteException{
    if (messenger == null)
      _initMessengerProxy();
    return messenger.getMessage(arg0);
  }
  
  
}