package com.spring.security_auth.repository;

import com.spring.security_auth.model.pojo.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository  extends JpaRepository<Notice, Long> {

//    @Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
//    List<Notice> findAllActiveNotices();

}
