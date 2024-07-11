package com.example.deepspring.domain;

import javax.swing.*;
import java.time.LocalDateTime;

public class Article {
  private Long id;
  private String title;
  private String comment;
  private String hashtag;

  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDateTime modifiedAt;
  private String modifiedBy;
}
