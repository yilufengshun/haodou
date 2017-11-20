package com.meng.spring.service;

/**
 * Thanks for Everything.
 */
public interface RedisService {

	public void setExp(String key, String value, Long time);

	public void setObject(String key, Object value);
	public Object getObject(String key);

	public String get(String key);

	public void del(String key);

	public Long incr(String key);




}
