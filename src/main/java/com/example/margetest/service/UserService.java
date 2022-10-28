package com.example.margetest.service;

import com.example.margetest.database.User;
import com.example.margetest.database.UserMapper;
import lombok.RequiredArgsConstructor;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.example.margetest.database.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserMapper mapper;

    public List<User> selectAll() {
        SelectStatementProvider selectStatement
                = select(user.allColumns()).from(user).build().render(RenderingStrategies.MYBATIS3);
        return mapper.selectMany(selectStatement);

    }

    public User selectByPrimaryKey(Integer id) {
        Optional<User> optionalUser = mapper.selectByPrimaryKey(id);
        return optionalUser.orElseThrow(RuntimeException::new);
    }

    public void save(User user) {
        int i = user.getId() == null ? mapper.insert(user)
                : mapper.updateByPrimaryKey(user);
    }

    public void deleteByPrimaryKey(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
}
