package com.sparta.webSpring.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc(); //다 찾아주고, 정렬을 해줘 수정된 날짜를 기준으로, 최신순으로
}