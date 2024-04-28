package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> findAllActiveNotices();
}
