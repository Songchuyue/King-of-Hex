package com.kingofhex.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {

	@RequestMapping("getbotinfo/")
	public List<String> getBotInfo() {
		List<String> list = new LinkedList<>();
		list.add("bot1");
		list.add("bot2");
		list.add("bot3");
		return list;
	}
}
