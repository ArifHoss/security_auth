package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Notice;
import com.spring.security_auth.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService{

    private final NoticeRepository noticeRepository;

    @Override
    public List<Notice> findAllActiveNotices() {
        return noticeRepository.findAll();

//        return noticeRepository.findAllActiveNotices();
    }
}
