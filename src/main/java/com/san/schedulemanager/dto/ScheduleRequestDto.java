package com.san.schedulemanager.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;
    private String content;
    private Long userId; // 작성자 정보 (일단은 userId만 받아 처리)
}
