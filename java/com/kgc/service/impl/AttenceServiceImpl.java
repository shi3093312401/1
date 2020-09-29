package com.kgc.service.impl;

import com.kgc.mapper.AttenceMapper;
import com.kgc.pojo.Attence;
import com.kgc.pojo.AttenceExample;
import com.kgc.service.AttenceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("attenceService")
public class AttenceServiceImpl implements AttenceService {
    @Resource
    AttenceMapper attenceMapper;
    @Override
    public List<Attence> getlist() {
        AttenceExample example=new AttenceExample();
        AttenceExample.Criteria criteria=example.createCriteria();
        List<Attence> list=attenceMapper.selectByExample(null);
        return list;
    }

    @Override
    public int add(Attence attence) {
        int i=attenceMapper.insertSelective(attence);
        return i;
    }
}
