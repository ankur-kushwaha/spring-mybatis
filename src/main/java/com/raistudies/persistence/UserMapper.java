package com.raistudies.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import com.raistudies.domain.User;
public interface UserMapper {

    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(String id);
    public List<User> getAllUser();
    
    //define in result map in mapper.xml
    //define the list of object in User class itself and use the getter property to retrieve its value   
    @Select(value="{call package_name.procedure_name("
    		+ "#{firstParam,mode=IN, jdbcType=VARCHAR},"
    		+ "#{secondParam,mode=OUT,jdbcType=cursor,javaType=resultSet,resultMap=customResultMap}"
    		+ ")}")
    @Options(statementType=StatementType.CALLABLE)
    Object getAllUserUsingAnnotation(User user);
}