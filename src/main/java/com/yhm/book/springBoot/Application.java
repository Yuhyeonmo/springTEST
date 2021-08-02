package com.yhm.book.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Application 클래스는 Main Class
// @SpringBootApplication의 스프링 부트의 자동설정, 스프링 bean 읽기와 생성 모두 자동으로 설정 / 이클래스는 항상 프로젝트 최상단에 위치함.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
