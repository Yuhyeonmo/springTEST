package com.yhm.book.springBoot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity Jpa 어노테이션
 * Getter, NoArgsConsturctor 롬복
 * 롬복은 코드를 단순화 시켜줌.
 * Posts 실제 DB테이블과 매칭될 클래스 Jpa 사용 시 Entity 클래스의 수정
 *
 */

@Getter
@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
