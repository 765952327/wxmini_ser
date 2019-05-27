package com.tree.wxmini.service;

import com.tree.wxmini.response.WxSession;

public interface LoginService {
	 WxSession wxLogin(String code);
}
