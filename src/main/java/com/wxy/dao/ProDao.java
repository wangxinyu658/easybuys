package com.wxy.dao;

import com.wxy.entity.Pro;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProDao {
    Pro findById(@Param("id") Integer id);

    //商品展示
    List<Pro> findAll();



}