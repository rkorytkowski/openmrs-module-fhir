package org.openmrs.module.fhir.api.client;

import org.springframework.http.ResponseEntity;

/**
 * This interface describes a client which is able to pull and push an object to OpenMRS instance based on a category.
 */
public interface Client {

    /**
     * Perform GET request.
     *
     * @param category Category of the resource.
     * @param url The url of the resource.
     * @param username Username for Basic Auth.
     * @param password Password for Basic Auth.
     * @return Object representing pulled object.
     */
    Object getObject(String category, String url, String username, String password);

    /**
     * Perform POST request.
     *
     * @param url The url of the resource.
     * @param username Username for Basic Auth.
     * @param password Password for Baisc Auth.
     * @param object Object to be send.
     * @return Response entity representing request result.
     */
    ResponseEntity<String> postObject(String url, String username, String password, Object object);
}