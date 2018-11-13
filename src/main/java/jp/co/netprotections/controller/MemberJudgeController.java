package jp.co.netprotections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;

@RestController
public class MemberJudgeController {

  @Autowired
  MemberJudgeService memberJudgeService;

  @RequestMapping(
      value = "/subject2",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )
  public MemberJudgeResponseDto execute(@RequestBody MemberJudgeRequestDto dto) {
    if(dto.geteventPlanning() > 5
        ||
        dto.getcoodination() > 5
        ||
        dto.getcogitation() > 5
        ||
        dto.getprogrammingAbility() > 5
        ||
        dto.getinfrastructureKnowledge() > 5
        ||
        dto.geteventPlanning() < 0
        ||
        dto.getcoodination() < 0
        ||
        dto.getcogitation() < 0
        ||
        dto.getprogrammingAbility() < 0
        ||
        dto.getinfrastructureKnowledge() < 0
    ) {
      MemberJudgeResponseDto memberJudgeResponseDto = new MemberJudgeResponseDto();
      return memberJudgeResponseDto;
    } else {
      MemberJudgeResponseDto result = memberJudgeService.execute(dto);
      return result;
    }

  }

}
