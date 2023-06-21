package com.project.GestionPersonne.dots;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonneRequestDTO {
    private Long id;
    private String nom;
    private String prenom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide a date.")
    @Pattern(regexp = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$", message = "date format should be yyyy-MM-dd")
    private String dateDeNaissance;
}
