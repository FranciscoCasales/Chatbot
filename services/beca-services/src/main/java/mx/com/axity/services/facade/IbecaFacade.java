package mx.com.axity.services.facade;

import mx.com.axity.commons.to.ContactTO;
import mx.com.axity.commons.to.UserTO;

import java.util.List;

public interface IbecaFacade {

    List<ContactTO> getContactF(String name);
    ContactTO getContactBYNameLastname(String name, String lastName);
}
