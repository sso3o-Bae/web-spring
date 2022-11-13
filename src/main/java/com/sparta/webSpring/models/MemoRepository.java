package com.sparta.webSpring.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end); //다 찾아주고, 정렬을 해줘 수정된 날짜를 기준으로, 최신순으로 //24시간 이내만
}