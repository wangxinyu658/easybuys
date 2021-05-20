package com.wxy.service.proc;

import com.wxy.dao.ProCDao;
import com.wxy.entity.ProC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProCServiceImpl implements ProCService {
    @Autowired
    private ProCDao productCDao;
    @Override
    public List<Object> findType() {
        List<ProC> type1 = productCDao.findType1();
        List<ProC> type2 = productCDao.findType2();
        List<ProC> type3 = productCDao.findType3();
        ArrayList<Object> list = new ArrayList<>();
        list.add(type1);
        list.add(type2);
        list.add(type3);
        return list;
    }
}
