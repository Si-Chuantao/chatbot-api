package com.sichuantao.chatbot.api.domain.ai;

/*
ChatGPT Open ai 接口：https://beta.openai.com/account/api-keys
 */

import java.io.IOException;

public interface IOpenAI {
    String doChatGPT(String openAiKey,String question) throws IOException;
}
