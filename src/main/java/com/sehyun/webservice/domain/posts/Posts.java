package com.sehyun.webservice.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sehyun.webservice.domain.BaseTimeEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * @NoArgsConstructor : 기본 생성자 자동 추가
 * access = AccessLevel.PROTECTED : 기본생성자의 접근 권한을 protected로 제한
 * 생성자로 protected Posts() {}와 같은 효과
 * Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
*/
@NoArgsConstructor(access = AccessLevel.PROTECTED)

/*
 * 클래스내 모든 필드의 Getter 메소드를 자동생성
 */
@Getter

/*
 * 해당 클래스의 빌더패턴 클래스를 생성
 * 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
 */
@Entity
public class Posts extends BaseTimeEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) { 
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
