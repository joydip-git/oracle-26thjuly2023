
package com.java.servicedescription;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java.servicedescription package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWelcomeMessage_QNAME = new QName("http://services.java.com/", "getWelcomeMessage");
    private final static QName _GetWelcomeMessageResponse_QNAME = new QName("http://services.java.com/", "getWelcomeMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java.servicedescription
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWelcomeMessage }
     * 
     */
    public GetWelcomeMessage createGetWelcomeMessage() {
        return new GetWelcomeMessage();
    }

    /**
     * Create an instance of {@link GetWelcomeMessageResponse }
     * 
     */
    public GetWelcomeMessageResponse createGetWelcomeMessageResponse() {
        return new GetWelcomeMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.java.com/", name = "getWelcomeMessage")
    public JAXBElement<GetWelcomeMessage> createGetWelcomeMessage(GetWelcomeMessage value) {
        return new JAXBElement<GetWelcomeMessage>(_GetWelcomeMessage_QNAME, GetWelcomeMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWelcomeMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.java.com/", name = "getWelcomeMessageResponse")
    public JAXBElement<GetWelcomeMessageResponse> createGetWelcomeMessageResponse(GetWelcomeMessageResponse value) {
        return new JAXBElement<GetWelcomeMessageResponse>(_GetWelcomeMessageResponse_QNAME, GetWelcomeMessageResponse.class, null, value);
    }

}
