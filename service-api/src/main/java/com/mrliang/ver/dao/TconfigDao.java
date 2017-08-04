package com.mrliang.ver.dao;

import com.mrliang.common.dao.BaseDao;
import com.mrliang.ver.dto.TconfigDto;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component("tconfigDao")
public class TconfigDao extends BaseDao<TconfigDto>{
    @Resource(name = "sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;
    @PostConstruct
    public void SqlSessionFactory() {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
