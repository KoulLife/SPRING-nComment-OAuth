package com.example.deepspring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "hashtag"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@Entity
public class Article {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Setter @Column(nullable = false) private String title;
  @Setter @Column(nullable = false, length = 10000) private String comment;
  @Setter private String hashtag;

  @CreatedDate @Column(nullable = false) private LocalDateTime createdAt;
  @CreatedBy @Column(nullable = false, length = 100) private String createdBy;
  @LastModifiedDate @Column(nullable = false) private LocalDateTime modifiedAt;
  @LastModifiedBy @Column(nullable = false, length = 100) private String modifiedBy;

  public Article(){}

  private Article(String title, String comment, String hashtag) {
    this.title = title;
    this.comment = comment;
    this.hashtag = hashtag;
  }

  public Article of(String title, String comment, String hashtag){
    return new Article(title, comment, hashtag);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Article article)) return false;
    return id != null && Objects.equals(id, article.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}



































