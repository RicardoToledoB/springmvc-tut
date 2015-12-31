package com.spring.config.mybatis;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
    String resource = "com/spring/config/mybatis/mybatis-config.xml";// path of the mybatis configuration file.
    private SqlSession session = null;
    public SqlSession getSession() {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            session = sqlMapper.openSession();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return session;

    }
}
