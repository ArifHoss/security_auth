package com.spring.security_auth.controller;

import com.spring.security_auth.model.pojo.Notice;
import com.spring.security_auth.services.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/notices")
    public List<Notice> getNotices() {
        return noticeService.findAllActiveNotices();
    }

//    @GetMapping("/notices")
//    public ResponseEntity<List<Notice>> getNotices() {
//        List<Notice> notices = noticeService.findAllActiveNotices();
//        if (notices != null ) {
//            return ResponseEntity.ok()
//                    .cacheControl(CacheControl.maxAge(Duration.ofMinutes(60)))
//                    .body(notices);
//        }else {
//            return null;
//        }
//    }
}
