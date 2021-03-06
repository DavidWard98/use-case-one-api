package com.example.usecaseoneapi.exception;

public class UserNotFoundException extends RuntimeException {

    /**
     * @author David
     * <p>
     * I ripped this from the internet.
     * https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
     */
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public UserNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
