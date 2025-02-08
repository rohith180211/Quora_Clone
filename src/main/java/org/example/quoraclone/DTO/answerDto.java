package org.example.quoraclone.DTO;

import lombok.Data;

import java.util.Set;

@Data
public class answerDto {
    private String content;
    private Long id;
    private Long userId;
    private Long answerId;

}
