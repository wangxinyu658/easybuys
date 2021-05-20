package com.wxy.dao;
import com.wxy.entity.ProC;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProCDao {
    //左边商品展示（首页）
    List<ProC> findType1();

    List<ProC> findType2();

    List<ProC> findType3();
}