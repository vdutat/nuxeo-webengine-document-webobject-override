package org.nuxeo.ecm.restapi.server.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.webengine.model.WebObject;

@WebObject(type = "Document")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON + "+esentity" })
public class CustomJSONDocumentObject extends JSONDocumentObject {

    protected static final Log log = LogFactory.getLog(CustomJSONDocumentObject.class);
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response doPost(DocumentModel inputDoc) {
        log.warn("<doPost> " + inputDoc);
        return super.doPost(inputDoc);
    }

    @Override
    public DocumentModel doGet() {
        log.warn("<doGet> " + doc);
        return super.doGet();
    }
}

