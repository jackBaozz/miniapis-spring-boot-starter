/*
 * Copyright 2023 bzz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bzz.miniapis.entity;

import java.io.Serializable;
import java.util.Map;

/**
 * 根据文档封装的chatGPT的实体
 *
 * @author bzz
 * @see https://platform.openai.com/docs/api-reference/chat
 */
public class ChatGPTRequestModel implements Serializable {

    private static final long serialVersionUID = 1L;

    public ChatGPTRequestModel() {

    }

    public ChatGPTRequestModel(String originApiUrl, String apiSecretKey) {
        this.originApiUrl = originApiUrl;
        this.apiSecretKey = apiSecretKey;
    }

    private String originApiUrl = "https://api.openai.com/v1/chat/completions";

    private String apiSecretKey = "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";


    /**
     * 代理地址
     * 如果设置了此参数那么此接口地址会优先于
     */
    private String proxyApiUrl = "";

    /**
     * ID of the model to use. Currently, only gpt-3.5-turbo and gpt-3.5-turbo-0301 are supported.
     * 要使用的模型的ID。目前，只有gpt-3.5-turbo和gpt-3.5-turbo-0301被支持。
     *
     * Required
     */
    private String model = "gpt-3.5-turbo-0301";

    /**
     * The messages to generate chat completions for,
     * 要生成聊天完成的消息
     *
     * Required
     */
    private ChatGPTMessageModel[] messages;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random,
     * while lower values like 0.2 will make it more focused and deterministic.
     * We generally recommend altering this or top_p but not both.
     *
     * 使用什么采样温度，在0和2之间。较高的数值如0.8会使输出更加随机，而较低的数值如0.2会使其更加集中和确定。
     * 我们一般建议改变这个值或top_p，但不能同时改变。
     */
    private float temperature = 0.8f; //默认0.8

    /**
     * An alternative to sampling with temperature, called nucleus sampling,
     * where the model considers the results of the tokens with top_p probability mass.
     * So 0.1 means only the tokens comprising the top 10% probability mass are considered.
     *
     * We generally recommend altering this or temperature but not both.
     *
     *
     * 用温度取样的另一种方法，称为核取样，模型考虑具有top_p概率质量的令牌的结果。所以0.1意味着只考虑由前10%的概率质量组成的标记。
     * 我们一般建议改变这个或温度，但不能同时改变。
     */
    private float top_p = 1.0f; //建议不使用

    /**
     * How many chat completion choices to generate for each input message.
     * 每条输入信息要产生多少个聊天候选项(套)来完成选择
     */
    private int n = 1; //默认1套回复

    /**
     * If set, partial message deltas will be sent, like in ChatGPT.
     * Tokens will be sent as data-only server-sent events as they become available,
     * with the stream terminated by a data: [DONE] message.
     *
     * 如果设置了，部分消息增量将被发送，就像在 ChatGPT 中一样。(异步,事件触发返回结果)
     * 令牌将作为data-only server-sent events事件触发来发送，stream通过 data: [DONE] 的一个消息来打断结果输出。
     */
    private boolean stream = false;

    /**
     * Up to 4 sequences where the API will stop generating further tokens.
     * 最多可以有4个序列，API将停止生成更多的令牌。。
     */
    private String stop = "stop"; // \n

    /**
     * The maximum number of tokens allowed for the generated answer.
     * By default, the number of tokens the model can return will be (4096 - prompt tokens).
     *
     * 生成的答案允许的最大标记数。默认情况下，模型可以返回的标记数为（4096 - 提示标记）
     */
    private int max_tokens = 2048;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far,
     * increasing the model's likelihood to talk about new topics.
     *
     * 介于 -2.0 和 2.0 之间的数字。正值会根据它们在文本中出现的情况对新令牌进行惩罚，从而增加模型谈论新话题的可能性。
     */
    private float presence_penalty = 0.0f;//存在性惩罚

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency
     * in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
     *
     * 介于 -2.0 和 2.0 之间的数字。正值会根据它们在文本中出现的频率对新令牌进行惩罚，从而降低模型重复原话的可能性。
     */
    private float frequency_penalty = 0.0f;//频率性惩罚

    /**
     * Modify the likelihood of specified tokens appearing in the completion.
     *
     * Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to
     * an associated bias value from -100 to 100.
     * Mathematically, the bias is added to the logits generated by the model prior to sampling.
     * The exact effect will vary per model, but values between -1 and 1 should decrease or
     * increase likelihood of selection;
     * values like -100 or 100 should result in a ban or exclusive selection of the relevant token.
     *
     *
     *
     * 修改指定的令牌出现在完成度中的可能性。
     *
     * 接受一个json对象，该对象将标记（由标记器中的标记ID指定）映射到-100到100的相关偏置值。
     * 在数学上，偏差被添加到模型在采样前产生的对数中。每个模型的确切效果会有所不同，但是-1和1之间的值应该减少或增加选择的可能性；
     * 像-100或100这样的值应该导致禁止或排斥选择相关的标记。
     *
     *
     * {"50256": -100} 类似-100就是静止出现50256字符
     */
    private Map<String, String> logit_bias = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse
     * 一个唯一的标识符，代表您的最终用户，可以帮助 OpenAI 监控和检测滥用行为。
     */
    private String user = "anonymity";


    public String getOriginApiUrl() {
        return originApiUrl;
    }

    public void setOriginApiUrl(String originApiUrl) {
        this.originApiUrl = originApiUrl;
    }

    public String getProxyApiUrl() {
        return proxyApiUrl;
    }

    public void setProxyApiUrl(String proxyApiUrl) {
        this.proxyApiUrl = proxyApiUrl;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ChatGPTMessageModel[] getMessages() {
        return messages;
    }

    public void setMessages(ChatGPTMessageModel[] messages) {
        this.messages = messages;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getTop_p() {
        return top_p;
    }

    public void setTop_p(float top_p) {
        this.top_p = top_p;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isStream() {
        return stream;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }

    public float getPresence_penalty() {
        return presence_penalty;
    }

    public void setPresence_penalty(float presence_penalty) {
        this.presence_penalty = presence_penalty;
    }

    public float getFrequency_penalty() {
        return frequency_penalty;
    }

    public void setFrequency_penalty(float frequency_penalty) {
        this.frequency_penalty = frequency_penalty;
    }

    public Map<String, String> getLogit_bias() {
        return logit_bias;
    }

    public void setLogit_bias(Map<String, String> logit_bias) {
        this.logit_bias = logit_bias;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getApiSecretKey() {
        return apiSecretKey;
    }

    public void setApiSecretKey(String apiSecretKey) {
        this.apiSecretKey = apiSecretKey;
    }
}
