package com.example.demo.config;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class BaseEntity {

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP not null")
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP")
    private LocalDateTime updateAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    protected Status status = Status.ACTIVE;

    public void changeToActive(){
        this.status = Status.ACTIVE;
    }
    public void changeToInActive(){
        this.status = Status.INACTIVE;
    }

}
