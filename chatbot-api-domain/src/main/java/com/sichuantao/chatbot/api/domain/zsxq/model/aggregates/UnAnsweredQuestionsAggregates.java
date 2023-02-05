package com.sichuantao.chatbot.api.domain.zsxq.model.aggregates;

import com.sichuantao.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * @author 小司
 * @description 未回答问题的聚合信息
 * @github https://github.com/Si-Chuantao
 * @copyright
 */
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }
}
