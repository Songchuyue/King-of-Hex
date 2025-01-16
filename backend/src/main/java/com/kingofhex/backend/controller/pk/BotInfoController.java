package com.kingofhex.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {

	@RequestMapping("getbotinfo/")
	public Map<String, String> getBotInfo() {
		Map<String, String> botInfo001 = new HashMap<>();
		botInfo001.put("botName", "Genshin Impact professional player");
		botInfo001.put("botVersion", "1.0.0");
		return botInfo001;
	}
}
