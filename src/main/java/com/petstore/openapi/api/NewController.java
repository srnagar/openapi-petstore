package com.petstore.openapi.api;

import com.petstore.openapi.model.Error;
import com.petstore.openapi.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/v1}")
public class NewController {


    @Operation(
            operationId = "createDogs",
            summary = "Create a dog",
            tags = {"dogs"},
            responses = {
                    @ApiResponse(responseCode = "201", description = "Null response"),
                    @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/dogs",
            produces = {"application/json"},
            consumes = {"application/json"}
    )

    public ResponseEntity<Void> createDogs(
            @Parameter(name = "Dog", description = "", required = true) @Valid @RequestBody Pet pet
    ) {
        throw new UnsupportedOperationException("Not implemented");
    }

}
