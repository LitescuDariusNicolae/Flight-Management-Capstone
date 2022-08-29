package org.darius.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Passenger {
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String phoneNumber;
}
