package org.activiti.user_group.user;

import org.activiti.user_group.group.Group;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/12 0012.
 */
@Service
public class UserManager {

    public User getUser(String code){

        User user = new User();
        user.setId("user_test_1");
        user.setName("经理1");
        user.setPassword("123");
        Group group = new Group();
        group.setId("group_test_1");
        group.setCode("jingli");
        group.setName("经理");

        List<Group> groupList = new ArrayList<>();
        groupList.add(group);
        user.setGroupList(groupList);

        return user;
    }
}
