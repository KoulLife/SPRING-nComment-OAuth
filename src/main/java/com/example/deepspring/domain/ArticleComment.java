package com.example.deepspring.domain;

import java.time.LocalDateTime;

public class ArticleComment {
  private Long id;
  private Article article;
  private String comment;

  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDateTime modifiedAt;
  private String modifiedBy;
}
