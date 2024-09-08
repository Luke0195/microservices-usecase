package br.com.lucas.models.enums;

import java.util.Arrays;

public enum ProblemType {
    INVALID_DATA("INVALID DATA", "Please check the payload"),
    INVALID_PARAM("INVALID PARAM", "Invalid param is provided"),
    MISSING_PARAM("MISSING PARAM", "Missing param"),
    RESOURCE_NOTFOUND("RESOURCE NOTFOUND", "This entity not found!"),
    RESOURCE_ALREADYEXISTS("RESOURCE ALREADY EXISTS", "This entity already exists");


    private final  String title;
    private final String description;


    ProblemType(String title, String description ){
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public static ProblemType toEnum(String title){
        return Arrays.stream(ProblemType.values()).filter(problemType ->  problemType.getTitle().equals(title)).findFirst().orElseThrow(()-> new IllegalArgumentException("Invalid Problem Type:" + title));
    }

}
