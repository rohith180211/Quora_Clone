package org.example.quoraclone.DTO;

import lombok.Data;

import java.util.Set;

@Data
public class questionDto {
    private String title;
    private String content;
    private Long id;
    private Long userId;
    private Set<Long> tagIds;

}
