/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.config.mybatis.MyBatisUtil;
import com.spring.model.Ciudad;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository("ciudadDAO")
public class CiudadDAOImpl implements CiudadDAO{

    @Override
    public void save(Ciudad c) {
        SqlSession session = new MyBatisUtil().getSession();
            try {
                session.insert("Ciudad.save", c);
            } finally {
                session.commit();
                session.close();
            }
    }

    @Override
    public List<Ciudad> list() {
        List<Ciudad> list = new ArrayList<Ciudad>();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectList("Ciudad.list");
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public Ciudad search(Ciudad c) {
        Ciudad list = new Ciudad();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectOne("Ciudad.search", c);
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public void delete(Ciudad c) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Ciudad.delete", c);
        } finally {
            session.commit();
            session.close();
        }
    }

    @Override
    public void edit(Ciudad c) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Ciudad.edit", c);
        } finally {
            session.commit();
            session.close();
        }
    }
    
}
