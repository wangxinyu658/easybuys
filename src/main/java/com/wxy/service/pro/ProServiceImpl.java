package com.wxy.service.pro;

import com.wxy.dao.ProCDao;
import com.wxy.dao.ProDao;
import com.wxy.entity.Pro;
import com.wxy.entity.ProC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ProServiceImpl implements ProService {
    @Autowired
    private ProDao proDao;

    @Autowired
    private ProCDao proCDao;


    @Override
    public Pro fingById(Integer id) {
        return proDao.findById(id);
    }

    @Override
    public List<Object> findAll() {
        List<ProC> type1 = proCDao.findType1();
        List<ProC> type2 = proCDao.findType2();
        List<Pro> proList = proDao.findAll();
        ArrayList<Object> list = new ArrayList<>();
        list.add(type1);
        list.add(type2);
        list.add(proList);
        return list;

    }


}