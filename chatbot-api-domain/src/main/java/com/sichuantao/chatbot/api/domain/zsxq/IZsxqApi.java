package com.sichuantao.chatbot.api.domain.zsxq;

import com.sichuantao.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

/**
 * @author 小司
 * @description
 * @github https://github.com/Si-Chuantao
 * @copyright
 */
public interface IZsxqApi {
    // 为回答的信息数据
    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;
    // 回答问题接口，silenced是否可见
    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;

}
