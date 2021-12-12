package com.example.flight_control_app.model;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    @NonNull
    private Long id;
    @NotBlank
    private String destination;
}
