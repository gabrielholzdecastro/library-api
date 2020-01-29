package com.gabrielholz.libraryapi.api.exception;

import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

public class ApiErros {
    private List<String> errors;

    public ApiErros(BindingResult bindingResult) {
        this.errors = new ArrayList<>();
        bindingResult.getAllErrors().forEach(errors -> this.errors.add(errors.getDefaultMessage()));
    }

    public List<String> getErrors() {
        return errors;
    }
}
