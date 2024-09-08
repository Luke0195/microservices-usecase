package br.com.lucas.models.enums;

import java.util.Arrays;

public enum ProfileEnum {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_COSTUMER("ROLE_COSTUMER"),
    ROLE_TECHNICIAN("ROLE_TECHNICIAN");

    private final String value;

    ProfileEnum( String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public static ProfileEnum toEnum(final String description){
        return Arrays.stream(ProfileEnum.values())
                .filter(profileEnum ->   profileEnum.getValue().equals(description))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Profile: " + description));
    }

}
