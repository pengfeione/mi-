package com.mehome.dao;

import com.mehome.domain.ForumTopic;

public interface ForumTopicDao {
    int delete(String tid);

    int insert(ForumTopic record);

    int insertRequired(ForumTopic record);

    ForumTopic selectById(String tid);

    int updateRequired(ForumTopic record);

    int updateByPrimaryKeyWithBLOBs(ForumTopic record);

    int update(ForumTopic record);
}