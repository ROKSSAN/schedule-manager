package com.san.schedulemanager.repository;

import com.san.schedulemanager.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // 필요 시 사용자 기반 필터링 등 추가 가능
}

