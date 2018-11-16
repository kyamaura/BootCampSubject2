package jp.co.netprotections.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeRequestsDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.dto.MemberJudgeResponsesDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RestController
public class MemberJudgeController {

  @Autowired
  MemberJudgeServiceImpl memberJudgeServiceImpl;

  @RequestMapping(
      value = "/subject2",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )
  public MemberJudgeResponseDto execute(@RequestBody MemberJudgeRequestDto dto) {
    if(dto.getEventPlanning() > 5
        ||
        dto.getCoodination() > 5
        ||
        dto.getCogitation() > 5
        ||
        dto.getProgrammingAbility() > 5
        ||
        dto.getInfrastructureKnowledge() > 5
        ||
        dto.getEventPlanning() < 0
        ||
        dto.getCoodination() < 0
        ||
        dto.getCogitation() < 0
        ||
        dto.getProgrammingAbility() < 0
        ||
        dto.getInfrastructureKnowledge() < 0
    ) {
      MemberJudgeResponseDto memberJudgeResponseDto = new MemberJudgeResponseDto();
      return memberJudgeResponseDto;
    } else {
      MemberJudgeResponseDto result = memberJudgeServiceImpl.execute(dto);
      return result;
    }

  }

  @RequestMapping(
        value = "/subject3",
        method = RequestMethod.POST,
        consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
     )
  @ResponseBody
  public MemberJudgeResponsesDto execute1(@RequestBody MemberJudgeRequestsDto dtos) {
    System.out.println(dtos.getMemberCandidatesList());
    MemberJudgeResponseDto result1 =
        memberJudgeServiceImpl.execute(dtos.getMemberCandidatesList().get(0));
    MemberJudgeResponseDto result2 =
            memberJudgeServiceImpl.execute(dtos.getMemberCandidatesList().get(1));
    ArrayList<MemberJudgeResponseDto> list = new ArrayList<MemberJudgeResponseDto>();
    list.add(0, result1);
    list.add(1, result2);
    System.out.println(list);
    MemberJudgeResponsesDto results = new MemberJudgeResponsesDto();
    results.setJudgedCandidatesResultList(list);
    return results;
  }



  @RequestMapping(
      value = "/subject4",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
      )
  @ResponseBody
  public MemberJudgeResponsesDto executess(@RequestBody MemberJudgeRequestsDto dto) {
    MemberJudgeResponsesDto test = new MemberJudgeResponsesDto();
    System.out.println(test.getJudgedCandidatesResultList());
    return test;
  }

}
