package org.example.quoraclone.DTO;

import lombok.Data;

@Data
public class commentDto {
    private String content;
    private Long id;
    private Long answerId;
    private Long parentCommentId;
}
