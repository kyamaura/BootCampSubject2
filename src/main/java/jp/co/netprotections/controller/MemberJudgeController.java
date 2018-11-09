package jp.co.netprotections.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;

@RestController
public class MemberJudgeController {

  @RequestMapping("/hello")
    public String  hello() {
    return "helloworld!!";
  }

  @RequestMapping(
      value = "/subject2",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )

  @ResponseBody
  public MemberJudgeResponseDto execute(@RequestBody MemberJudgeRequestDto dto) {
    MemberJudgeService test = new MemberJudgeService();
    MemberJudgeResponseDto result = test.execute(dto);

    return result;
  }

}
