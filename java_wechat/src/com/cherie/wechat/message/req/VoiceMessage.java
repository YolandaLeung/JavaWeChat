package com.cherie.wechat.message.req;
/**
 * 语音消息
 * @author liangxy
 * @date 2017.06.06
 */
public class VoiceMessage extends BaseMessage{
	//媒体Id
	private String MediaId;
	//语音格式
	private String Format;
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
