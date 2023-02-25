
package dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dao package. 
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

    private final static QName _VerificaLogin_QNAME = new QName("http://Dao/", "verificaLogin");
    private final static QName _VerificaLoginResponse_QNAME = new QName("http://Dao/", "verificaLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificaLogin }
     * 
     */
    public VerificaLogin createVerificaLogin() {
        return new VerificaLogin();
    }

    /**
     * Create an instance of {@link VerificaLoginResponse }
     * 
     */
    public VerificaLoginResponse createVerificaLoginResponse() {
        return new VerificaLoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Dao/", name = "verificaLogin")
    public JAXBElement<VerificaLogin> createVerificaLogin(VerificaLogin value) {
        return new JAXBElement<VerificaLogin>(_VerificaLogin_QNAME, VerificaLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Dao/", name = "verificaLoginResponse")
    public JAXBElement<VerificaLoginResponse> createVerificaLoginResponse(VerificaLoginResponse value) {
        return new JAXBElement<VerificaLoginResponse>(_VerificaLoginResponse_QNAME, VerificaLoginResponse.class, null, value);
    }

}
