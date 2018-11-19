package jp.co.netprotections.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import jp.co.netprotections.service.impl.NewComp2;

@RestController
public class MemberJudgeController {

  @Autowired
  MemberJudgeServiceImpl memberJudgeServiceImpl;

  /**
   * validation処理後、ソートをかけてリスポンスを返します.
   */
  @RequestMapping(
      value = "/subject2",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
    )
  public MemberJudgeResponsesDto execute(@RequestBody MemberJudgeRequestsDto dtos) {
    List<MemberJudgeResponseDto> list = new ArrayList<MemberJudgeResponseDto>();
    for (MemberJudgeRequestDto member : dtos.getMemberCandidatesList()) {
      if (
          member.getEventPlanning() <= 5
          &&
          member.getCoodination() <= 5
          &&
          member.getCogitation() <= 5
          &&
          member.getProgrammingAbility() <= 5
          &&
          member.getInfrastructureKnowledge() <= 5
          &&
          member.getEventPlanning() >= 0
          &&
          member.getCoodination() >= 0
          &&
          member.getCogitation() >= 0
          &&
          member.getProgrammingAbility() >= 0
          &&
          member.getInfrastructureKnowledge() >= 0
      ) {
        MemberJudgeResponseDto result = memberJudgeServiceImpl.execute(member);
        list.add(result);
      }
    }
    Collections.sort(list, new NewComp2());

    MemberJudgeResponsesDto results = new MemberJudgeResponsesDto();
    results.setJudgedCandidatesResultList(list);
    return results;
  }

  /**
   *【テスト】２つのリクエストに対して、レスポンスします.
   */
  @RequestMapping(
        value = "/subject3",
        method = RequestMethod.POST,
        consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
     )
  @ResponseBody
  public MemberJudgeResponsesDto execute1(@RequestBody MemberJudgeRequestsDto dtos) {
    MemberJudgeResponseDto result1 =
        memberJudgeServiceImpl.execute(dtos.getMemberCandidatesList().get(0));
    MemberJudgeResponseDto result2 =
            memberJudgeServiceImpl.execute(dtos.getMemberCandidatesList().get(1));
    ArrayList<MemberJudgeResponseDto> list = new ArrayList<MemberJudgeResponseDto>();
    list.add(0, result1);
    list.add(1, result2);
    MemberJudgeResponsesDto results = new MemberJudgeResponsesDto();
    results.setJudgedCandidatesResultList(list);
    return results;
  }


  /**
   *【テスト】 for拡張文で、複数のリクエストに対して、レスポンスします.
   */
  @RequestMapping(
      value = "/subject4",
      method = RequestMethod.POST,
      consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
      )
  @ResponseBody
  public MemberJudgeResponsesDto execute2(@RequestBody MemberJudgeRequestsDto dtos) {
    ArrayList<MemberJudgeResponseDto> list = new ArrayList<MemberJudgeResponseDto>();
    for (MemberJudgeRequestDto member : dtos.getMemberCandidatesList()) {
      MemberJudgeResponseDto result = memberJudgeServiceImpl.execute(member);
      list.add(result);
    }
    MemberJudgeResponsesDto results = new MemberJudgeResponsesDto();
    results.setJudgedCandidatesResultList(list);
    return results;
  }

}
