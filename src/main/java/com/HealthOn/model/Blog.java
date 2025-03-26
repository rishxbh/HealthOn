package com.HealthOn.model;

import lombok.*;

import jakarta.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long blogId;
    private Date postedOn;
    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    private Doctor doctor;
    private String title;
    private String content;
}
